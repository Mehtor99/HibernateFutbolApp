package org.mehtor.dto.request;

import org.mehtor.enums.EPosition;

import java.time.LocalDate;

public class PlayerSaveRequestDto {
	
	private String teamName;
	private String name;
	private String surname;
	private LocalDate birthday;
	private EPosition position;
	
	public PlayerSaveRequestDto(String teamName, String name, String surname, LocalDate birthday, EPosition position) {
		this.teamName = teamName;
		this.name = name;
		this.surname = surname;
		this.birthday = birthday;
		this.position = position;
	}
	
	public String getTeamName() {
		return teamName;
	}
	
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public LocalDate getBirthday() {
		return birthday;
	}
	
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	
	public EPosition getPosition() {
		return position;
	}
	
	public void setPosition(EPosition position) {
		this.position = position;
	}
	
	
}