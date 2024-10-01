package org.mehtor.controller;

import org.mehtor.service.FixtureService;

public class FixtureController {
	private final FixtureService fixtureService;
	
	public FixtureController() {
		this.fixtureService = new FixtureService();
		
	}
}