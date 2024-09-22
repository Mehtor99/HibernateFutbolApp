package org.mehtor.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.mehtor.entity.Stadium;
import org.mehtor.entity.Team;

import java.util.Optional;

public class StadiumRepository extends RepositoryManager<Stadium,Long> {
	public StadiumRepository() {
		super(Stadium.class);
	}
	
	public Optional<Stadium> findStadiumIdByName(String stadiumName) {
		EntityManager em = getEntityManager();
		try {
			
			CriteriaBuilder cb = em.getCriteriaBuilder();
			CriteriaQuery<Stadium> cq = cb.createQuery(Stadium.class);
			Root<Stadium> root = cq.from(Stadium.class);
			
			cq.select(root).where(cb.equal(root.get("stadiumName"), stadiumName));
			Stadium singleResult = em.createQuery(cq).getSingleResult();
			return Optional.ofNullable(singleResult);
		}
		catch (Exception e) {
			e.printStackTrace();
			return Optional.empty();
		}
		finally {
			em.close();
		}
	}
}