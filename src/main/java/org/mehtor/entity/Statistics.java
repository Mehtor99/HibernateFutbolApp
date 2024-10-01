package org.mehtor.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
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
	@Column(name = "team_id")
	private Long teamId;
	@Column(name = "league_id")
	private Long leagueId;
	private Integer wins = 0;
	private Integer losses = 0;
	private Integer draws = 0;
	@Column(name = "goalsscored")
	private Integer goalsScored = 0;
	@Column(name = "goalsconceded")
	private Integer goalsConceded = 0;
	
	public void addWin() {
		if (this.wins == null) {
			this.wins = 0;
		}
		this.wins++;
	}
	
	
	public int getGoalDifference() {
		return goalsScored - goalsConceded;
	}
	
	
	public void addDraw() {
		if (this.draws == null) {
			this.draws = 0;
		}
		this.draws++;
	}
	
	public void addLose() {
		if (this.losses == null) {
			this.losses = 0;
		}
		this.losses++;
	}
	
	public void addGoals(int scored, int conceded) {
		if (this.goalsScored == null) {
			this.goalsScored = 0;
		}
		if (this.goalsConceded == null) {
			this.goalsConceded = 0;
		}
		this.goalsScored += scored;
		this.goalsConceded += conceded;
	}
	
	public int getPoints() {
		return (wins * 3) + (draws * 1);
	}
}