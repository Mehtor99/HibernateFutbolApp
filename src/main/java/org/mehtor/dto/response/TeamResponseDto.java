package org.mehtor.dto.response;

import org.mehtor.enums.EColours;

public class TeamResponseDto {
	
	private String stadiumName;
	
	private String teamName;
	
	private String presidentName;
	
	private String foundationDate;
	
	private EColours colour;
	
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
	
	@Override
	public String toString() {
		return "TeamResponseDto{" + "stadiumName='" + getStadiumName() + '\'' + ", teamName='" + getTeamName() + '\'' + ", presidentName='" + getPresidentName() + '\'' + ", foundationDate='" + getFoundationDate() + '\'' + ", colour=" + getColour() + '}';
	}
}