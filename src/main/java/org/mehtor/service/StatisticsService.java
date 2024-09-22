package org.mehtor.service;

import org.mehtor.entity.League;
import org.mehtor.entity.Statistics;
import org.mehtor.repository.ICrud;
import org.mehtor.repository.StatisticsRepository;

public class StatisticsService extends ServiceManager<Statistics,Long> {
	private final StatisticsRepository statisticsRepository;
	
	public StatisticsService() {
		this(new StatisticsRepository());
	}
	
	public StatisticsService(StatisticsRepository statisticsRepository) {
		super(statisticsRepository);
		this.statisticsRepository = statisticsRepository;
	}
}