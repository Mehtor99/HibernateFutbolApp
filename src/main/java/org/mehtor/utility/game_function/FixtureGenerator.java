package org.mehtor.utility.game_function;

import org.mehtor.entity.*;
import org.mehtor.repository.FixtureRepository;

import org.mehtor.repository.MatchRepository;
import org.mehtor.repository.StatisticsRepository;
import org.mehtor.repository.TeamRepository;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class FixtureGenerator {
	
	
	private List<Long> takimIDleri;
	private static FixtureRepository fixtureRepository;
	private static MatchRepository matchRepository;
	private static TeamRepository teamRepository;
	private static StatisticsRepository statisticsRepository;
	
	
	public FixtureGenerator(List<Long> takimIDleri, LocalDate sezonBaslangic) {
		this.takimIDleri = takimIDleri;
		this.fixtureRepository = new FixtureRepository();
		this.matchRepository = new MatchRepository();
		this.teamRepository = new TeamRepository();
		this.statisticsRepository = new StatisticsRepository();
		
	}
	
	public void generateFikstur() {
		int takimSayisi = takimIDleri.size();
		boolean tekMi = takimSayisi % 2 != 0;
		
		if (tekMi) {
			takimIDleri.add(-1L);
			takimSayisi++;
		}
		
		LocalDate seasonStartDate = LocalDate.now();
		int totalWeeks = (takimSayisi - 1) * 2;
		LocalDate seasonEndDate = seasonStartDate.plusWeeks(totalWeeks);
		
		
		Fixture fixture = Fixture.builder().leagueID(1L).startDate(seasonStartDate).endDate(seasonEndDate).build();
		fixtureRepository.save(fixture);
		
		// İlk yarı
		for (int hafta = 0; hafta < takimSayisi - 1; hafta++) {
			List<Match> matchList = new ArrayList<>();
			
			for (int i = 0; i < takimSayisi / 2; i++) {
				Long homeTeam, awayTeam;
				
				if (hafta % 2 == 0) {
					homeTeam = takimIDleri.get(i);
					awayTeam = takimIDleri.get(takimSayisi - 1 - i);
				}
				else {
					homeTeam = takimIDleri.get(takimSayisi - 1 - i);
					awayTeam = takimIDleri.get(i);
				}
				
				if (homeTeam != -1 && awayTeam != -1) {
					Match match = Match.builder().homeTeamID(homeTeam).awayTeamID(awayTeam)
					                   .matchDate(calculateMatchDate(hafta)).leagueID(fixture.getLeagueID())
					                   .stadiumID(1L).fixtureID(fixture.getId()).build();
					
					matchRepository.save(match);
					matchList.add(match);
				}
			}
			
			takimIDleri.add(1, takimIDleri.remove(takimIDleri.size() - 1));
		}
		
		
		for (int hafta = 0; hafta < takimSayisi - 1; hafta++) {
			List<Match> matchList = new ArrayList<>();
			
			for (int i = 0; i < takimSayisi / 2; i++) {
				Long homeTeam, awayTeam;
				
				if (hafta % 2 == 0) {
					homeTeam = takimIDleri.get(takimSayisi - 1 - i);
					awayTeam = takimIDleri.get(i);
				}
				else {
					homeTeam = takimIDleri.get(i);
					awayTeam = takimIDleri.get(takimSayisi - 1 - i);
				}
				
				if (homeTeam != -1 && awayTeam != -1) {
					Match match = Match.builder().homeTeamID(homeTeam).awayTeamID(awayTeam)
					                   .matchDate(calculateMatchDate(hafta + takimSayisi))
					                   .leagueID(fixture.getLeagueID()).stadiumID(1L).fixtureID(fixture.getId())
					                   .build();
					
					matchRepository.save(match);
					matchList.add(match);
				}
			}
			
			
			takimIDleri.add(1, takimIDleri.remove(takimIDleri.size() - 1));
		}
	}
	
	
	private LocalDate calculateMatchDate(int hafta) {
		LocalDate startDate = LocalDate.now();
		return startDate.plusWeeks(hafta);
	}
	
	
	public void makeMatch() {
		List<Match> matchList = matchRepository.findAll();
		Random random = new Random();
		
		for (Match match : matchList) {
			
			int homeGoals = random.nextInt(6);
			int awayGoals = random.nextInt(6);
			
			match.setHomeTeamScore(homeGoals);
			match.setAwayTeamScore(awayGoals);
			
			matchRepository.update(match);
			
			
			updateTeamStatistics(match.getHomeTeamID(), match.getAwayTeamID(), homeGoals, awayGoals, match.getLeagueID());
		}
		
	}
	
	private void updateTeamStatistics(Long homeTeamID, Long awayTeamID, int homeGoals, int awayGoals, Long leagueID) {
		Statistics homeTeamStat = statisticsRepository.findById(homeTeamID)
		                                              .orElse(Statistics.builder().teamId(homeTeamID).leagueId(leagueID)
		                                                                .build());
		Statistics awayTeamStat = statisticsRepository.findById(awayTeamID)
		                                              .orElse(Statistics.builder().teamId(awayTeamID).leagueId(leagueID)
		                                                                .build());
		
		if (homeGoals > awayGoals) {
			homeTeamStat.addWin();
			awayTeamStat.addLose();
		}
		else if (awayGoals > homeGoals) {
			awayTeamStat.addWin();
			homeTeamStat.addLose();
		}
		else {
			homeTeamStat.addDraw();
			awayTeamStat.addDraw();
		}
		
		homeTeamStat.addGoals(homeGoals, awayGoals);
		awayTeamStat.addGoals(awayGoals, homeGoals);
		
		
		statisticsRepository.update(homeTeamStat);
		statisticsRepository.update(awayTeamStat);
		
	}
	
	public void printLeagueTable() {
		List<Statistics> statisticsList = statisticsRepository.findAll();
		Map<Long, String> teamNames =
				teamRepository.findAll().stream().collect(Collectors.toMap(Team::getId, Team::getTeamName)); //
		// Assuming
		
		statisticsList.sort(Comparator.comparingInt(Statistics::getPoints)
		                              .thenComparingInt(Statistics::getGoalDifference).reversed());
		
		System.out.printf("%-20s %-5s %-5s %-5s %-5s %-5s %-5s %-5s%n", "Takım İsmi", "G", "B", "M", "AG", "YG", "AV", "Puan");
		System.out.println("------------------------------------------------------------------");
		
		for (Statistics stats : statisticsList) {
			String teamName = teamNames.get(stats.getTeamId());
			System.out.printf("%-20s %-5d %-5d %-5d %-5d %-5d %-5d %-5d%n", teamName, stats.getWins(),         // G (Galibiyet)
			                  stats.getDraws(),        // B (Beraberlik)
			                  stats.getLosses(),       // M (Mağlubiyet)
			                  stats.getGoalsScored(),  // AG (Atılan Goller)
			                  stats.getGoalsConceded(), // YG (Yenilen Goller)
			                  stats.getGoalDifference(), // AV (Averaj)
			                  stats.getPoints());      // Puan
		}
	}
}