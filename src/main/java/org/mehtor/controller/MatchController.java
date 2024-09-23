package org.mehtor.controller;

import org.mehtor.entity.League;
import org.mehtor.entity.Match;
import org.mehtor.service.LeagueService;
import org.mehtor.service.MatchService;

import java.util.List;
import java.util.Optional;

public class MatchController {
	private final MatchService matchService;
	
	public MatchController() {
		this.matchService = new MatchService();
	}
	
	public Match save(Match match) {
		try {
			System.out.println("Controller Match başarıyla kaydedildi.");
			return matchService.save(match);
			
		} catch (Exception e) {
			System.out.println("Controller Match kaydedilirken hata oluştu: " + e.getMessage());
		}
		return match;
	}
	
	
	public Iterable<Match> saveAll(List<Match> league) {
		try {
			System.out.println("Controller Match başarıyla kaydedildi.");
			return matchService.saveAll(league);
			
		} catch (Exception e) {
			System.out.println("Controller Match kaydedilirken hata oluştu: " + e.getMessage());
		}
		return league;
	}
	
	
	public Boolean deleteById(Long longid) {
		try {
			Boolean isDeleted = matchService.deleteById(longid);
			if (isDeleted) {
				System.out.println("Controller: Match silindi");
				return true;
			}
			else {
				System.out.println("Controller: Match silinirken hata oldu.");
				return false;
			}
		}catch (Exception e) {
			System.out.println("Controller: Match silinirken hata oldu"+e.getMessage());
			return false;
		}
	}
	
	public Optional<Match> findById(Long longid) {
		Optional<Match> userOptional = matchService.findById(longid);
		return userOptional;
	}
	
	public Boolean existById(Long longid) {
		try {
			Boolean isExistById = matchService.existById(longid);
			if (isExistById) {
				System.out.println("Controller: Match basarıyla bulundu.");
				return true;
			}
			else {
				System.out.println("Controller: Match bulunamadı.");
				return false;
			}
		}
		catch (Exception e) {
			System.out.println("Controller: Match bulunamadı."+e.getMessage());
			return false;
		}
	}
	
	public List<Match> findAll() {
		List<Match> userList = matchService.findAll();
		if (userList.isEmpty()) {
			System.out.println("Controller: Veritabanına kayıtlı Match bulunamadı");
		}
		return userList;
	}
	
}