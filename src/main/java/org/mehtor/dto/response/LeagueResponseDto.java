package org.mehtor.dto.response;

import org.mehtor.enums.ECluster;
import org.mehtor.enums.ERegion;

import java.time.LocalDate;

public class LeagueResponseDto {
	
	private String leagueName;
	private String leagueSeason;
	private ECluster cluster;
	private ERegion region;
	private LocalDate startDate;
	
	public String getLeagueName() {
		return leagueName;
	}
	
	public void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}
	
	public String getLeagueSeason() {
		return leagueSeason;
	}
	
	public void setLeagueSeason(String leagueSeason) {
		this.leagueSeason = leagueSeason;
	}
	
	public ECluster getCluster() {
		return cluster;
	}
	
	public void setCluster(ECluster cluster) {
		this.cluster = cluster;
	}
	
	public ERegion getRegion() {
		return region;
	}
	
	public void setRegion(ERegion region) {
		this.region = region;
	}
	
	public LocalDate getStartDate() {
		return startDate;
	}
	
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	
	@Override
	public String toString() {
		return "LeagueResponseDto{" + "leagueName='" + getLeagueName() + '\'' + ", leagueSeason='" + getLeagueSeason() + '\'' + ", cluster=" + getCluster() + ", region=" + getRegion() + ", startDate=" + getStartDate() + '}';
	}
}