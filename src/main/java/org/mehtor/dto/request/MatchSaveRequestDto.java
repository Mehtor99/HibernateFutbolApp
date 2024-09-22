package org.mehtor.dto.request;

import java.time.LocalDate;

public class MatchSaveRequestDto {
	
	private String leagueName;  //ligId bulmak için kullanacağız
	private String homeTeamName;//teamId bulmak için kullanacağız
	private String awayTeamName;//teamId bulmak için kullanacağız
	private String stadiumName;//StadiumId bulmak için kullanacağız
	private Integer homeTeamScore;
	private Integer awayTeamScore;
	private String refereeName; //hakem
	private LocalDate matchDate;
	
	public MatchSaveRequestDto(String leagueName, String homeTeamName, String awayTeamName, String stadiumName, Integer homeTeamScore, Integer awayTeamScore, String refereeName, LocalDate matchDate) {
		this.leagueName = leagueName;
		this.homeTeamName = homeTeamName;
		this.awayTeamName = awayTeamName;
		this.stadiumName = stadiumName;
		this.homeTeamScore = homeTeamScore;
		this.awayTeamScore = awayTeamScore;
		this.refereeName = refereeName;
		this.matchDate = matchDate;
	}
	
	public String getLeagueName() {
		return leagueName;
	}
	
	public void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}
	
	public String getHomeTeamName() {
		return homeTeamName;
	}
	
	public void setHomeTeamName(String homeTeamName) {
		this.homeTeamName = homeTeamName;
	}
	
	public String getAwayTeamName() {
		return awayTeamName;
	}
	
	public void setAwayTeamName(String awayTeamName) {
		this.awayTeamName = awayTeamName;
	}
	
	public String getStadiumName() {
		return stadiumName;
	}
	
	public void setStadiumName(String stadiumName) {
		this.stadiumName = stadiumName;
	}
	
	public Integer getHomeTeamScore() {
		return homeTeamScore;
	}
	
	public void setHomeTeamScore(Integer homeTeamScore) {
		this.homeTeamScore = homeTeamScore;
	}
	
	public Integer getAwayTeamScore() {
		return awayTeamScore;
	}
	
	public void setAwayTeamScore(Integer awayTeamScore) {
		this.awayTeamScore = awayTeamScore;
	}
	
	public String getRefereeName() {
		return refereeName;
	}
	
	public void setRefereeName(String refereeName) {
		this.refereeName = refereeName;
	}
	
	public LocalDate getMatchDate() {
		return matchDate;
	}
	
	public void setMatchDate(LocalDate matchDate) {
		this.matchDate = matchDate;
	}
}