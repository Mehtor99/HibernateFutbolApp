package org.mehtor.gui;

import org.mehtor.entity.*;
import org.mehtor.model.ControllerModel;
import org.mehtor.repository.FixtureRepository;
import org.mehtor.repository.MatchRepository;
import org.mehtor.repository.StadiumRepository;
import org.mehtor.repository.TeamRepository;
import org.mehtor.utility.game_function.FixtureGenerator;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

public class MatchGui {
	private static ControllerModel controllerModel=ControllerModel.getInstance();
	private static final Scanner scanner = new Scanner(System.in);
	private Map<Integer, Integer> puanTablosu;
	private static TeamRepository teamRepository = new TeamRepository();
	private static final MatchRepository matchRepository = new MatchRepository();
	private static final FixtureRepository fixtureRepository = new FixtureRepository();
	private static final StadiumRepository stadiumRepository = new StadiumRepository();
	
	
	
	public static void matchModule(ControllerModel cModel) {
		
		controllerModel = cModel;
		
		int opt;
		do {
			opt = musabakaMenu();
			musabakaMenuOpsiyonlari(opt);
		} while (opt != 0);
	}
	
	
	private static int musabakaMenu() {
		System.out.println("-----Musabaka Menu-------");
		System.out.println("1-Fiksturu Goruntule");
		System.out.println("2-Puan tablosunu Goruntule");
		System.out.println("0-Cıkıs Yap");
		System.out.print("Seciminiz");
		int opt = scanner.nextInt();
		scanner.nextLine();
		return opt;
		
	}
	
	private static int musabakaMenuOpsiyonlari(int opt) {
		switch (opt) {
			case 1: {
				fiksturuYazdir();
				break;
			}
			case 2: {
				printLeagueTable();
				break;
			}
			case 0: {
				System.out.println("Ana menuye dönülüyor...");
			}
			default:
				System.out.println("lütfen gecerli bir secim yapınız");
		}
		
		return opt;
	}
	
	public static void createFixture(){
		FixtureGenerator fixtureGenerator = fixtureData();
		fixtureGenerator.generateFikstur();
		
	}
	
	private static void printLeagueTable() {
		FixtureGenerator fixtureGenerator = fixtureData();
		fixtureGenerator.printLeagueTable();
	}
	
	private static FixtureGenerator fixtureData() {
		List<Long> takimIDleri = teamRepository.findAllTeamIds();
		FixtureGenerator fixtureGenerator = new FixtureGenerator(takimIDleri, LocalDate.of(2024,10,8));
		return fixtureGenerator;
	}
	
	public static void fiksturuYazdir() {
		// Veritabanından tüm fikstürü çekiyoruz
		List<Fixture> fixtureList = fixtureRepository.findAll();
		int weekCounter = 1; // Hafta sayacı
		
		for (Fixture fixture : fixtureList) {
			System.out.println("Lig ID'si: " + fixture.getLeagueID());
			System.out.println("Başlangıç Tarihi: " + fixture.getStartDate());
			System.out.println("Bitiş Tarihi: " + fixture.getEndDate());
			
			// Her bir fikstüre ait maçları matchRepository üzerinden çekiyoruz
			List<Match> matchList = matchRepository.findByFixtureID(fixture.getId());
			
			int matchCounter = 0; // Her fikstürde maç sayısını tutar
			System.out.println("Hafta " + weekCounter + ":"); // İlk hafta başlığı
			
			for (Match match : matchList) {
				if (matchCounter > 0 && matchCounter % 9 == 0) {
					weekCounter++;
					System.out.println(); // Boşluk ekleyelim
					System.out.println("Hafta " + weekCounter + ":"); // Yeni hafta başlığı
				}
				
				// Ev sahibi takımın ismini ve stadyumunu getiriyoruz
				Optional<Team> homeTeam = teamRepository.findById(match.getHomeTeamID());
				String homeTeamName = homeTeam.map(Team::getTeamName).orElse("Bilinmeyen Takım");
				
				// Deplasman takımının ismini getiriyoruz
				Optional<Team> awayTeam = teamRepository.findById(match.getAwayTeamID());
				String awayTeamName = awayTeam.map(Team::getTeamName).orElse("Bilinmeyen Takım");
				
				Long stadiumId = homeTeam.map(Team::getStadiumID).orElse(null);
				
				Optional<Stadium>  stadiumIdByName = stadiumRepository.findById(stadiumId);
				String stadiumName = stadiumIdByName.map(Stadium::getStadiumName).orElse("Bilinmeyen Stadium");
				
				
				System.out.println("Maç ID: " + match.getId());
				System.out.println("Ev Sahibi Takım: " + homeTeamName);
				System.out.println("Deplasman Takım: " + awayTeamName);
				System.out.println("Maç Tarihi: " + match.getMatchDate());
				System.out.println("Stadyum Adı: " + stadiumName); // Ev sahibi takımın stadyum ID'sini göster
				System.out.println("------------------------------");
				
				matchCounter++; // Maç sayısını arttırıyoruz
			}
			System.out.println(); // Fikstür sonuna boşluk ekleyelim
		}
	}
	
}