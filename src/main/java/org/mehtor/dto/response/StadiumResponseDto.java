package org.mehtor.dto.response;

public class StadiumResponseDto {
	
	private String stadiumName;
	private String location;
	private Integer capacity;
	
	public String getStadiumName() {
		return stadiumName;
	}
	
	public void setStadiumName(String stadiumName) {
		this.stadiumName = stadiumName;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public Integer getCapacity() {
		return capacity;
	}
	
	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}
	
	@Override
	public String toString() {
		return "StadiumResponseDto{" + "stadiumName='" + getStadiumName() + '\'' + ", location='" + getLocation() + '\'' + ", capacity=" + getCapacity() + '}';
	}
}