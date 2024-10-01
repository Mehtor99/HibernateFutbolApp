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
@Table(name = "tblcontractoffer")
public class ContractOffer extends BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="offermoney")
	private Long offerMoney;
	@Column(name="transferoffer_id")
	private Long transferOfferID;
	@Column(name="player_id")
	private Long playerID;
	@Enumerated(EnumType.STRING)
	private EOfferResponse offerResponse;
	@Column(name="contractdecision")
	private boolean contractDecision;
	
	public void decisionContract() {
		if (offerResponse==EOfferResponse.ACCEPT){
			this.contractDecision = true;
		}else{
			this.contractDecision = false;
		}
	}
}