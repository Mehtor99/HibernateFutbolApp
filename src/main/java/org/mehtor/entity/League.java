package org.mehtor.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.mehtor.enums.ECluster;
import org.mehtor.enums.ERegion;

import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Data
@Entity
@Table(name = "tblleague")
public class League extends BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="leaguename")
	private String leagueName;
	@Column(name="leagueseason")
	private String leagueSeason;
	@Enumerated(EnumType.STRING)
	private ECluster cluster;
	@Enumerated(EnumType.STRING)
	private ERegion region;
	@Temporal(TemporalType.DATE)
	private LocalDate startDate;
	@ElementCollection
	private List<Long> teamIDList;
}