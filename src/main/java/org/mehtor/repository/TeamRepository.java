package org.mehtor.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.mehtor.entity.Team;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

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
	
	public List<Long> findAllTeamIds() {
		EntityManager em = getEntityManager();
		try {
			CriteriaBuilder cb = em.getCriteriaBuilder();
			CriteriaQuery<Long> query = cb.createQuery(Long.class);
			Root<Team> root = query.from(Team.class);
			
			// Sadece takım ID'lerini seç
			query.select(root.get("id"));
			return em.createQuery(query).getResultList();
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		finally {
			em.close();
		}
	}
	
	public Map<Long, String> findAllTeamIdToName() {
		EntityManager em = getEntityManager();
		
		try {
			CriteriaBuilder cb = em.getCriteriaBuilder();
			CriteriaQuery<Object[]> query = cb.createQuery(Object[].class);
			Root<Team> root = query.from(Team.class);
			
			// Takım ID ve isimlerini seç
			query.multiselect(root.get("id"), root.get("teamName"));
			
			List<Object[]> results = em.createQuery(query).getResultList();
			
			// Listeyi Map<Long, String> formatına çevir
			return results.stream().collect(Collectors.toMap(
					result -> (Long) result[0],   // ID
					result -> (String) result[1]  // Name
			));
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