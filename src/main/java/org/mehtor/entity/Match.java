package org.mehtor.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.Map;

@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Data
@Entity
@Table(name = "tblmatch")
public class Match extends BaseEntity  {
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
	@ElementCollection
	@Column(name="teamidtoname")
	private Map<Integer, String> teamIDtoName;
	
}