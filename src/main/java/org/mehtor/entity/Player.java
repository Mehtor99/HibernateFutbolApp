package org.mehtor.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.mehtor.enums.EPosition;

import java.time.LocalDate;
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Data
@Entity
@Table(name = "tblplayer")
public class Player extends BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="team_id")
	private Long teamID;
	private String name;
	private String surname;
	@Temporal(TemporalType.DATE)
	private LocalDate birthday;
	@Column(name="contractfee")
	private Long contractFee;
	@Enumerated(EnumType.STRING)
	private EPosition position;
	
	
	public String toStringOzet() {
		return "Player{"  +  ", name='" + getName() + '\'' + ", surname='" + getSurname() + '\'' + ", birthday=" + getBirthday()  + ", position=" + getPosition() + '}';
	}
	
}