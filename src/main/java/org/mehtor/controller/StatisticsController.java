package org.mehtor.controller;

import org.mehtor.entity.Statistics;
import org.mehtor.service.StatisticsService;

import java.util.List;
import java.util.Optional;

public class StatisticsController {
	private final StatisticsService statisticsService;
	
	public StatisticsController(StatisticsService statisticsService) {
		this.statisticsService = statisticsService;
	}
	
	public Statistics save(Statistics statistics) {
		try {
			System.out.println("Controller Statistics başarıyla kaydedildi.");
			return statisticsService.save(statistics);
			
		} catch (Exception e) {
			System.out.println("Controller Statistics kaydedilirken hata oluştu: " + e.getMessage());
		}
		return statistics;
	}
	
	public Iterable<Statistics> saveAll(List<Statistics> statisticsList) {
		try {
			System.out.println("Controller Statistics başarıyla kaydedildi.");
			return statisticsService.saveAll(statisticsList);
			
		} catch (Exception e) {
			System.out.println("Controller Statistics kaydedilirken hata oluştu: " + e.getMessage());
		}
		return statisticsList;
	}
	
	public Boolean deleteByID(Long longid) {
		try {
			Boolean isDeleted = statisticsService.deleteById(longid);
			if (isDeleted) {
				System.out.println("Controller: Statistics başarıyla silindi.");
				return true;
			}else {
				System.out.println("Controller: Statistics silinemedi.");
				return false;
			}
		}
		catch (Exception e) {
			System.out.println("Controller: Statistics silinirken hata oldu: " + e.getMessage());
			return false;
		}
	}
	
	public Optional<Statistics> findById(Long longid) {
		Optional<Statistics> statisticsOptional = statisticsService.findById(longid);
		return statisticsOptional;
	}
	
	public Boolean existById(Long longid){
		try {
			Boolean isExistById = statisticsService.existById(longid);
			if (isExistById) {
				System.out.println("Controller: Statistics başarıyla bulundu");
				return true;
			}else {
				System.out.println("Controller: Statistics bulunamadı.");
				return false;
			}
		}
		catch (Exception e) {
			System.out.println("Controller: Statistics bulunurken hata oldu: "+e.getMessage());
			return false;
		}
	}
	
	public List<Statistics> findAll() {
		List<Statistics> statisticsList = statisticsService.findAll();
		if (statisticsList.isEmpty()) {
			System.out.println("Controller Veritabanında kayıtlı Statistics bulunmamaktadır.");
		}
		return statisticsList;
	}
}