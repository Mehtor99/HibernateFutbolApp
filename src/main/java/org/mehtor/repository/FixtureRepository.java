package org.mehtor.repository;

import org.mehtor.entity.Fixture;

public class FixtureRepository extends RepositoryManager<Fixture,Long> {
	
	public FixtureRepository() {
		super(Fixture.class);
	}
	
}