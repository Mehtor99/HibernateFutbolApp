package org.mehtor.dto.response;

import java.time.LocalDate;

public class MatchResponseDto {
	
	private String leagueName;
	private String homeTeamName;
	private String awayTeamName;
	private String stadiumName;
	private Integer homeTeamScore;
	private Integer awayTeamScore;
	private String refereeName; //hakem
	private LocalDate matchDate;
	
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
	
	@Override
	public String toString() {
		return "MatchResponseDto{" + "leagueName='" + getLeagueName() + '\'' + ", homeTeamName='" + getHomeTeamName() + '\'' + ", awayTeamName='" + getAwayTeamName() + '\'' + ", stadiumName='" + getStadiumName() + '\'' + ", homeTeamScore=" + getHomeTeamScore() + ", awayTeamScore=" + getAwayTeamScore() + ", refereeName='" + getRefereeName() + '\'' + ", matchDate=" + getMatchDate() + '}';
	}
}