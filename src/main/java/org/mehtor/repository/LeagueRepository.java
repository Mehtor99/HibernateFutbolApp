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
	
}