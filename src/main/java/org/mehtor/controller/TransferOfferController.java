package org.mehtor.controller;

import org.mehtor.entity.Manager;
import org.mehtor.entity.TransferOffer;
import org.mehtor.service.TransferOfferService;

import java.util.List;
import java.util.Optional;

public class TransferOfferController {

	private final TransferOfferService transferOfferService;
	
	
	public TransferOfferController() {
		this.transferOfferService = new TransferOfferService();
	}
	
	public TransferOffer save(TransferOffer transferOffer) {
		try{
			return transferOfferService.save(transferOffer);
			
		}catch(Exception e){
			System.out.println("Controller TransferOffer kaydedilirken hata oluştu: " + e.getMessage());
		}
		return null;
	}
	
	public Iterable<TransferOffer> saveAll(List<TransferOffer> transferOfferList) {
		try{
			System.out.println("Controller TransferOffer başarıyla kaydedildi.");
			return transferOfferService.saveAll(transferOfferList);
		}catch(Exception e){
			System.out.println("Controller TransferOffer kaydedilirken hata oluştu: " + e.getMessage());
		}
		return transferOfferList;
	}
	
	public Boolean deleteByID(Long longId){
		try{
			Boolean isDeleted = transferOfferService.deleteById(longId);
			if(isDeleted){
				System.out.println("Controller: TransferOffer başarıyla silindi.");
				return true;
			}else{
				System.out.println("Controller: TransferOffer silinemedi.");
				return false;
			}
		}
		catch(Exception e){
			System.out.println("Controller: TransferOffer silinirken hata oldu: " + e.getMessage());
			return false;
		}
	}
	
	public Optional<TransferOffer> findById(Long longid) {
		Optional<TransferOffer> transferOptional = transferOfferService.findById(longid);
		return transferOptional;
	}
	
	public Boolean existById(Long longid) {
		try{
			Boolean isExistById = transferOfferService.existById(longid);
			if (isExistById) {
				System.out.println("Controller: TransferOffer başarıyla bulundu");
				return true;
			}else {
				System.out.println("Controller: TransferOffer bulunamadı.");
				return false;
			}
		}
		catch(Exception e){
			System.out.println("Controller: TransferOffer bulunurken hata oldu: "+e.getMessage());
			return false;
		}
	}
	
	public List<TransferOffer> findAll(){
		List<TransferOffer> transferOfferList = transferOfferService.findAll();
		if (transferOfferList.isEmpty()) {
			System.out.println("Controller: Veritabanında kayıtlı TransferOffer bulunmamaktadır.");
		}
		return transferOfferList;
	}
	
	public List<TransferOffer>futbolcuIcinYapilanTeklifler(Manager manager) {
		return transferOfferService.futbolcuIcinYapilanTeklifler(manager);
	}
	
}