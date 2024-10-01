package org.mehtor.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Map;
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Data
@Entity
@Table(name = "tblmatch")
public class Match extends BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="league_id")
	private Long leagueID;
	@Column(name="hometeam_id")
	private Long homeTeamID;
	@Column(name="awayteam_id")
	private Long awayTeamID;
	@Column(name="stadium_id")
	private Long stadiumID;
	@Column(name="hometeamscore")
	private Integer homeTeamScore;
	@Column(name="awayteamscore")
	private Integer awayTeamScore;
	@Column(name="refereename")
	private String refereeName; // hakem
	@Temporal(TemporalType.DATE)
	@Column(name="matchdate")
	private LocalDate matchDate;
	@Column(name="fixture_id")
	private Long fixtureID;
	
	public String toString() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		return "Maç ID: " + id + ", " +
				"Ev Sahibi Takım: " + homeTeamID + ", " +
				"Deplasman Takımı: " + awayTeamID + ", " +
				"Tarih: " + matchDate.format(formatter);
	}
}