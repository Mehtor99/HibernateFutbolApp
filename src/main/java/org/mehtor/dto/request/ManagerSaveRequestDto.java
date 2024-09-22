package org.mehtor.dto.request;

import java.time.LocalDate;

public class ManagerSaveRequestDto {
	
	private String teamName;
	private String managerName;
	private String managerSurname;
	private String managerPassword;
	private LocalDate dateOfBirth;
	
	public ManagerSaveRequestDto(String teamName, String managerName, String managerSurname, String managerPassword, LocalDate dateOfBirth) {
		this.teamName = teamName;
		this.managerName = managerName;
		this.managerSurname = managerSurname;
		this.managerPassword = managerPassword;
		this.dateOfBirth = dateOfBirth;
	}
	
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
	
	public String getManagerPassword() {
		return managerPassword;
	}
	
	public void setManagerPassword(String managerPassword) {
		this.managerPassword = managerPassword;
	}
	
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
}