package org.mehtor.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.mehtor.entity.Manager;
import org.mehtor.entity.TransferOffer;

import java.util.List;

public class TransferOfferRepository extends RepositoryManager<TransferOffer,Long> {
	
	
	public TransferOfferRepository() {
		super(TransferOffer.class);
	}
	
	public List<TransferOffer> futbolcuIcinYapilanTeklifler(Manager manager) { //takımın futbolcularına gelen teklifleri listeliyor
		EntityManager em = getEntityManager();
	
		try{
			CriteriaBuilder cb = em.getCriteriaBuilder();
			CriteriaQuery<TransferOffer> cq = cb.createQuery(TransferOffer.class);
			Root<TransferOffer> root = cq.from(TransferOffer.class);
			cq.select(root).where(cb.equal(root.get("managerID"), manager.getTeamID())); //TODO hocaya mantık hatası var mı sor?
			return em.createQuery(cq).getResultList();
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		finally{
			em.close();
		}
	}
	
	public List<TransferOffer> findByReceiverTeamID(Long receiverTeamID) {
		EntityManager em = getEntityManager();
		try{
			CriteriaBuilder cb = em.getCriteriaBuilder();
			CriteriaQuery<TransferOffer> cq = cb.createQuery(TransferOffer.class);
			Root<TransferOffer> root = cq.from(TransferOffer.class);
			
			cq.select(root).where(cb.equal(root.get("receiverTeamID"), receiverTeamID));
			return em.createQuery(cq).getResultList();
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		finally{
			em.close();
		}
	}
}