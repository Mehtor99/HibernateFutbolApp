package org.mehtor.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.mehtor.entity.League;
import org.mehtor.entity.Stadium;

import java.util.Optional;

public class LeagueRepository extends RepositoryManager<League,Long> {
	
	public LeagueRepository() {
		super(League.class);
	}
	
	public Optional<League> findLeagueIdByName(String leagueName) {
		EntityManager em = getEntityManager();
		try {
			
			CriteriaBuilder cb = em.getCriteriaBuilder();
			CriteriaQuery<League> cq = cb.createQuery(League.class);
			Root<League> root = cq.from(League.class);
			
			cq.select(root).where(cb.equal(root.get("leagueName"), leagueName));
			League singleResult = em.createQuery(cq).getSingleResult();
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