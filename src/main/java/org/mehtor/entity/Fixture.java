package org.mehtor.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor   //Boş constructor oluşturur.
@AllArgsConstructor  //Full constructor oluştutur
@Builder
@Data
@Entity
@Table(name = "tblfixture")
public class Fixture {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "leagueid")
	private Long leagueId;
	@Temporal(TemporalType.DATE)
	@Column(name = "startdate")
	private LocalDate startDate;
	@Temporal(TemporalType.DATE)
	@Column(name = "enddate")
	private LocalDate endDate;
	
	
}