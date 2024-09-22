package org.mehtor.repository;

import org.mehtor.entity.Match;

public class MatchRepository extends RepositoryManager<Match, Long> {
	public MatchRepository() {
		super(Match.class);
	}
}