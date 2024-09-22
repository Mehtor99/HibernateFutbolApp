package org.mehtor.controller;

import org.mehtor.dto.request.LeagueSaveRequestDto;
import org.mehtor.dto.response.LeagueResponseDto;
import org.mehtor.entity.League;
import org.mehtor.service.LeagueService;
import org.mehtor.service.ServiceManager;

import java.util.List;
import java.util.Optional;

public class LeagueController {
	private final LeagueService leagueService;
	
	public LeagueController() {
		this.leagueService = new LeagueService();
	}
	
	public Optional<LeagueResponseDto> save(LeagueSaveRequestDto dto) {
		try {
			System.out.println("Controller League başarıyla kaydedildi.");
			return leagueService.save(dto);
			
		} catch (Exception e) {
			System.out.println("Controller League kaydedilirken hata oluştu: " + e.getMessage());
		}
		return Optional.empty();
	}
	
	
	public Iterable<League> saveAll(List<League> league) {
		try {
			System.out.println("Controller League başarıyla kaydedildi.");
			return leagueService.saveAll(league);
			
		} catch (Exception e) {
			System.out.println("Controller League kaydedilirken hata oluştu: " + e.getMessage());
		}
		return league;
	}
	
	
	public Boolean deleteById(Long longid) {
		try {
			Boolean isDeleted = leagueService.deleteById(longid);
			if (isDeleted) {
				System.out.println("Controller: League silindi");
				return true;
			}
			else {
				System.out.println("Controller: League silinirken hata oldu.");
				return false;
			}
		}catch (Exception e) {
			System.out.println("Controller: League silinirken hata oldu"+e.getMessage());
			return false;
		}
	}
	
	public Optional<League> findById(Long longid) {
		Optional<League> userOptional = leagueService.findById(longid);
		return userOptional;
	}
	
	public Boolean existById(Long longid) {
		try {
			Boolean isExistById = leagueService.existById(longid);
			if (isExistById) {
				System.out.println("Controller: League basarıyla bulundu.");
				return true;
			}
			else {
				System.out.println("Controller: League bulunamadı.");
				return false;
			}
		}
		catch (Exception e) {
			System.out.println("Controller: League bulunamadı."+e.getMessage());
			return false;
		}
	}
	
	public List<League> findAll() {
		List<League> userList = leagueService.findAll();
		if (userList.isEmpty()) {
			System.out.println("Controller: Veritabanına kayıtlı league bulunamadı");
		}
		return userList;
	}
	
}