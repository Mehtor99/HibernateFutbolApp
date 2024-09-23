package org.mehtor.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.mehtor.entity.Team;

import java.util.List;
import java.util.Optional;

public class TeamRepository extends RepositoryManager<Team,Long> {
	public TeamRepository() {
		super(Team.class);
	}
	
	public Optional<Team> findTeamIdByName(String teamName) {
		EntityManager em = getEntityManager();
		try {
			
			CriteriaBuilder cb = em.getCriteriaBuilder();
			CriteriaQuery<Team> cq = cb.createQuery(Team.class);
			Root<Team> root = cq.from(Team.class);
			
			cq.select(root).where(cb.equal(root.get("teamName"), teamName));
			Team singleResult = em.createQuery(cq).getSingleResult();
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
	
	public List<Team> listAllByNameContainsValue(String value){
		EntityManager em = getEntityManager();
		
		try {
			CriteriaBuilder cb = em.getCriteriaBuilder();
			CriteriaQuery<Team> cq = cb.createQuery(Team.class);
			Root<Team> root = cq.from(Team.class);                            //spor
			cq.select(root).where(cb.like(cb.lower(root.get("teamName")),("%"+ value.toLowerCase() +"%")));
			return em.createQuery(cq).getResultList();                    //burada dışadan gelen metni küçültüyor
		}
		catch (Exception e) {
			System.out.println("Repository : listAllByNameContainsValue metodunda hata oluştu" + e.getMessage());
			return null;
		}
		finally {
			em.close();
		}
		
	}
	
	
}