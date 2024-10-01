package org.mehtor.service;

import org.mehtor.entity.Fixture;
import org.mehtor.repository.FixtureRepository;

public class FixtureService extends ServiceManager<Fixture,Long> {
	private  final FixtureRepository fixtureRepository;
	
	public FixtureService() {
		this(new FixtureRepository());
		
	}
	
	public FixtureService(FixtureRepository fixtureRepository) {
		super(fixtureRepository);
		this.fixtureRepository = fixtureRepository;
		
	}
	
}