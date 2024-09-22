package org.mehtor.dto.response;

import java.time.LocalDate;

public class ManagerResponseDto {
	
	private String teamName;
	private String managerName;
	private String managerSurname;
	private LocalDate dateOfBirth;
	
	public String getTeamName() {
		return teamName;
	}
	
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	
	public String getManagerName() {
		return managerName;
	}
	
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	
	public String getManagerSurname() {
		return managerSurname;
	}
	
	public void setManagerSurname(String managerSurname) {
		this.managerSurname = managerSurname;
	}
	
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	@Override
	public String toString() {
		return "ManagerResponseDto{" + "teamName='" + getTeamName() + '\'' + ", managerName='" + getManagerName() + '\'' + ", managerSurname='" + getManagerSurname() + '\'' + ", dateOfBirth=" + getDateOfBirth() + '}';
	}
}