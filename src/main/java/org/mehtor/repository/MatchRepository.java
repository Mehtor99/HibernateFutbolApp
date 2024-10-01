package org.mehtor.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.mehtor.entity.Match;

import java.util.List;

public class MatchRepository extends RepositoryManager<Match, Long> {
	public MatchRepository() {
		super(Match.class);
	}
	
	public List<Match> findByFixtureID(Long fixtureId) {  //fiksture idsine göre maçları listeler
		EntityManager em = getEntityManager();
		try {
			CriteriaBuilder cb = em.getCriteriaBuilder();
			CriteriaQuery<Match> cq = cb.createQuery(Match.class);
			Root<Match> root = cq.from(Match.class);
			cq.select(root).where(cb.equal(root.get("fixtureID"),fixtureId));
			List<Match> matches = em.createQuery(cq).getResultList();
			return matches;
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		finally {
			em.close();
		}
	}
	
}