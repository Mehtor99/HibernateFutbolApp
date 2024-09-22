package org.mehtor.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.mehtor.enums.EPosition;

import java.time.LocalDate;

@NoArgsConstructor   //Boş constructor oluşturur.
@AllArgsConstructor  //Full constructor oluştutur
@SuperBuilder
@Data
@Entity
@Table(name = "tblplayer")
public class Player extends BaseEntity  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "team_id")
	private Long teamID;
	private String name;
	private String surname;
	
	@Temporal(TemporalType.DATE)
	private LocalDate birthday;
	@Column(name = "contractfee")
	private Long contractFee;
	@Enumerated(EnumType.STRING)
	private EPosition position;
	
	
}