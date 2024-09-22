package org.mehtor.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.mehtor.enums.EColours;

@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Data
@Entity
@Table(name="tblTeam")
public class Team extends BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "stadium_id")
	private Long stadiumID;
	@Column(name="teamname")
	private String teamName;
	@Column(name = "foundationname")
	private String presidentName;
	@Column(name = "foundationdate")
	private String foundationDate;
	@Enumerated(EnumType.STRING)
	private EColours colour;
	
}