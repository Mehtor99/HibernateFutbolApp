package org.mehtor.dto.request;


import org.mehtor.enums.EColours;

public class TeamSaveRequestDto {
	
	private String stadiumName;
	
	private String teamName;
	
	private String presidentName;
	
	private String foundationDate;
	
	private EColours colour;
	
	public TeamSaveRequestDto(String stadiumName, String teamName, String presidentName, String foundationDate, EColours colour) {
		this.stadiumName = stadiumName;
		this.teamName = teamName;
		this.presidentName = presidentName;
		this.foundationDate = foundationDate;
		this.colour = colour;
	}
	
	public String getStadiumName() {
		return stadiumName;
	}
	
	public void setStadiumName(String stadiumName) {
		this.stadiumName = stadiumName;
	}
	
	public String getTeamName() {
		return teamName;
	}
	
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	
	public String getPresidentName() {
		return presidentName;
	}
	
	public void setPresidentName(String presidentName) {
		this.presidentName = presidentName;
	}
	
	public String getFoundationDate() {
		return foundationDate;
	}
	
	public void setFoundationDate(String foundationDate) {
		this.foundationDate = foundationDate;
	}
	
	public EColours getColour() {
		return colour;
	}
	
	public void setColour(EColours colour) {
		this.colour = colour;
	}
}