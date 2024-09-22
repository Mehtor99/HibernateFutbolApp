package org.mehtor.repository;

import org.mehtor.entity.Manager;

public class ManagerRepository extends RepositoryManager<Manager,Long> {
	public ManagerRepository() {
		super(Manager.class);
	}
	
}