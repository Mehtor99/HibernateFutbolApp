package org.mehtor.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.mehtor.enums.EOfferResponse;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Data
@Entity
@Table(name = "tbltransferoffer")
public class TransferOffer extends BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String message;
	@Column(name="offermoney")
	private Long offerMoney;
	@Enumerated(EnumType.STRING)
	private EOfferResponse response;
	@Column(name="offeringteam_id")
	private Long offeringTeamID; //teklif yapan
	@Column(name="receiverteam_id")
	private Long receiverTeamID; //teklif alan
	@Column(name="player_id")
	private Long playerID;
	@Column(name="manager_id")
	private Long managerID;
	
}