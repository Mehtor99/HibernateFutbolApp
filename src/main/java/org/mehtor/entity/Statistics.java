package org.mehtor.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Data
@Entity
@Table(name = "tblstatistics")
public class Statistics extends BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer wins;
	private Integer losses;
	private Integer draws;
	@Column(name="goalsscored")
	private Integer goalsScored;
	@Column(name="goalsconceded")
	private Integer goalsConceded;
	
	
	public int getGoalDifference() {
		return goalsScored - goalsConceded;
	}
	
	public void addWin() {
		this.wins++;
	}
	
	public void addDraw() {
		this.draws++;
	}
	
	public void addLoss() {
		this.losses++;
	}
	
	public void addGoals(int scored, int conceded) {
		this.goalsScored += scored;
		this.goalsConceded += conceded;
	}
	
	public int getPoints() {
		return (wins * 3) + (draws * 1);
	}
}