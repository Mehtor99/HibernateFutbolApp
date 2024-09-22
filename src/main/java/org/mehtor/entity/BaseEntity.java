package org.mehtor.entity;


import jakarta.persistence.MappedSuperclass;
import lombok.experimental.SuperBuilder;

@MappedSuperclass
@SuperBuilder
public class BaseEntity {
	private Integer state;
	private Long createat;
	private Long updateat;
	
	public BaseEntity() {
	}
	
	public BaseEntity(Integer state, Long createat, Long uodateat) {
		this.state = state;
		this.createat = createat;
		this.updateat = uodateat;
	}
	
	public Integer getState() {
		return state;
	}
	
	public void setState(Integer state) {
		this.state = state;
	}
	
	public Long getCreateat() {
		return createat;
	}
	
	public void setCreateat(Long createat) {
		this.createat = createat;
	}
	
	public Long getUpdateat() {
		return updateat;
	}
	
	public void setUpdateat(Long uodateat) {
		this.updateat = uodateat;
	}
}