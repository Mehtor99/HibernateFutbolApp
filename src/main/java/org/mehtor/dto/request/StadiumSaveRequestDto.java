package org.mehtor.dto.request;

public class StadiumSaveRequestDto {
	
	private String stadiumName;
	private String location;
	private Integer capacity;
	
	public StadiumSaveRequestDto(String stadiumName, String location, Integer capacity) {
		this.stadiumName = stadiumName;
		this.location = location;
		this.capacity = capacity;
	}
	
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
}