package org.mehtor.repository;

import org.mehtor.entity.Statistics;

public class StatisticsRepository extends RepositoryManager<Statistics,Long> {
	public StatisticsRepository() {
		super(Statistics.class);
	}
}