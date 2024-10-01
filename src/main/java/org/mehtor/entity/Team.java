package org.mehtor.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.mehtor.enums.EColours;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Data
@Entity
@Table(name="tblteam")
public class Team extends BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="stadium_id")
	private Long stadiumID;
	@Column(name="teamname")
	private String teamName;
	@Column(name="presidentname")
	private String presidentName;
	@Column(name="foundationdate")
	private String foundationDate;
	@Enumerated(EnumType.STRING)
	private EColours colour;
	
	
}