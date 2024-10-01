package org.mehtor.dto.response;

import lombok.Getter;
import org.mehtor.enums.EPosition;

import java.time.LocalDate;

public class PlayerResponseDto {
	
	
	private String name;
	private String surname;
	private LocalDate birthday;
	private EPosition position;
	private Long contractFee;
	
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
	
	public String getName() {
		return name;
	}
	
	public Long getContractFee() {
		return contractFee;
	}
	
	public void setContractFee(Long contractFee) {
		this.contractFee = contractFee;
	}
	
	@Override
	public String toString() {
		return "PlayerResponseDto{" + "name='" + getName() + '\'' + ", surname='" + getSurname() + '\'' + ", birthday=" + getBirthday() + ", position=" + getPosition() + ", contractFee=" + getContractFee() + '}';
	}
}