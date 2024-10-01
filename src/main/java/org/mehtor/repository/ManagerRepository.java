package org.mehtor.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.mehtor.entity.Manager;

import java.util.Optional;

public class ManagerRepository extends RepositoryManager<Manager,Long> {
	
	public ManagerRepository() {
		super(Manager.class);
	}
	
	public Optional<Manager> findManagerByIdAndPassword(Long id, String password) {
		EntityManager em = getEntityManager();
		
		try {
			CriteriaBuilder cb = em.getCriteriaBuilder();
			CriteriaQuery<Manager> cq = cb.createQuery(Manager.class);
			Root<Manager> root = cq.from(Manager.class);
			Predicate idPredicate = cb.equal(root.get("id"), id);
			Predicate passwordPredicate = cb.equal(root.get("managerPassword"), password);
			
			// Combining the predicates with AND logic
			cq.where(cb.and(idPredicate, passwordPredicate));
			
			// Executing the query
			Manager result = em.createQuery(cq).getSingleResult();
			
			return Optional.ofNullable(result);
		}
		catch (Exception e) {
			e.printStackTrace();
			return Optional.empty();
		}
		finally {
			em.close();
		}
	}
	
	public boolean existsByUserName(String username) {
		EntityManager em = getEntityManager();
		
		try{
			CriteriaBuilder cb = em.getCriteriaBuilder();
			CriteriaQuery<Long> cq = cb.createQuery(Long.class);
			Root<Manager> root = cq.from(Manager.class);
			
			cq.select(cb.count(root)).where(cb.equal(root.get("userName"), username));
			
			Long count = em.createQuery(cq).getSingleResult();
			return count > 0;
		}
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		finally {
			em.close();
		}
	}
	
	
	
	
	//TODO JOIN kullanmak gerekli 2 tablo da calışman gerekli
	//! teamRepository de olması gerekli
	public Optional<Long> findTeamIdByManagerId(Long managerId) {
		EntityManager em = getEntityManager();
		
		try {
			Long teamId = em.createQuery("SELECT  m.teamID FROM Manager m WHERE m.id = :managerId", Long.class)
			                .setParameter("managerId", managerId)
			                .getSingleResult();
			return Optional.ofNullable(teamId);
		} catch (Exception e) {
			e.printStackTrace();
			return Optional.empty();
		} finally {
			em.close();
		}
	}
	
	public Optional<Manager> findByTeamId(Long secilenTakimID) {  //takımID ile manager buluyor
		EntityManager em = getEntityManager();
		try{
			Optional<Manager> manager= Optional.ofNullable(em
					                                               .createQuery("SELECT m FROM Manager m WHERE m" +
							                                                            ".teamID = :secilenTakim", Manager.class)
					                                               .setParameter("secilenTakim", secilenTakimID)
					                                               .getSingleResult());
			return manager;
		}catch (Exception e) {
			return Optional.empty();
		}
		finally {
			em.close();
		}
	}
	
}