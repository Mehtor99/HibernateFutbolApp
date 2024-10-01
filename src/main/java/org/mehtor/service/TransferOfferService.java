package org.mehtor.service;

import org.mehtor.entity.Manager;
import org.mehtor.entity.TransferOffer;
import org.mehtor.repository.ICrud;
import org.mehtor.repository.TransferOfferRepository;

import java.util.List;

public class TransferOfferService extends ServiceManager<TransferOffer,Long> {
	private final TransferOfferRepository transferOfferRepository;
	
	public TransferOfferService() {
		this(new TransferOfferRepository());
	}
	
	public TransferOfferService(TransferOfferRepository transferOfferRepository) {
		super(transferOfferRepository);
		this.transferOfferRepository = transferOfferRepository;
	}
	
	public List<TransferOffer> futbolcuIcinYapilanTeklifler(Manager manager){
		return transferOfferRepository.futbolcuIcinYapilanTeklifler(manager);
	}
	
}