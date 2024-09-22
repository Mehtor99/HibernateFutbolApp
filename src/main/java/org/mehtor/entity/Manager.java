package org.mehtor.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@NoArgsConstructor   //Boş constructor oluşturur.
@AllArgsConstructor  //Full constructor oluştutur
@SuperBuilder
@Data
@Entity
@Table(name = "tblmanager")
public class Manager extends BaseEntity  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name= "team_id")
	private Long teamID;
	@Column(name = "managername")
	private String managerName;
	@Column(name = "managersurname")
	private String managerSurname;
	@Column(name = "managerpassword")
	private String managerPassword;
	@Column(name = "dateofbirth")
	@Temporal(TemporalType.DATE)
	private LocalDate dateOfBirth;
	
}