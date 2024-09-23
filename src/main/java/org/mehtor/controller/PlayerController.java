package org.mehtor.controller;



import org.mehtor.dto.request.PlayerSaveRequestDto;
import org.mehtor.dto.response.PlayerResponseDto;
import org.mehtor.entity.League;
import org.mehtor.entity.Player;
import org.mehtor.service.LeagueService;
import org.mehtor.service.PlayerService;

import java.util.List;
import java.util.Optional;

public class PlayerController {
	private final PlayerService playerService;
	
	public PlayerController() {
		this.playerService = new PlayerService();
	}
	
	public Optional<PlayerResponseDto> save(PlayerSaveRequestDto dto) {
		try {
			System.out.println("Controller Player başarıyla kaydedildi.");
			return playerService.save(dto);
			
		} catch (Exception e) {
			System.out.println("Controller Player kaydedilirken hata oluştu: " + e.getMessage());
		}
		return Optional.empty();
	}
	
	
	public Iterable<Player> saveAll(List<Player> player) {
		try {
			System.out.println("Controller Player başarıyla kaydedildi.");
			return playerService.saveAll(player);
			
		} catch (Exception e) {
			System.out.println("Controller Player kaydedilirken hata oluştu: " + e.getMessage());
		}
		return player;
	}
	
	
	public Boolean deleteById(Long longid) {
		try {
			Boolean isDeleted = playerService.deleteById(longid);
			if (isDeleted) {
				System.out.println("Controller: Player silindi");
				return true;
			}
			else {
				System.out.println("Controller: Player silinirken hata oldu.");
				return false;
			}
		}catch (Exception e) {
			System.out.println("Controller: Player silinirken hata oldu"+e.getMessage());
			return false;
		}
	}
	
	public Optional<Player> findById(Long longid) {
		Optional<Player> userOptional = playerService.findById(longid);
		return userOptional;
	}
	
	public Boolean existById(Long longid) {
		try {
			Boolean isExistById = playerService.existById(longid);
			if (isExistById) {
				System.out.println("Controller: Player basarıyla bulundu.");
				return true;
			}
			else {
				System.out.println("Controller: Player bulunamadı.");
				return false;
			}
		}
		catch (Exception e) {
			System.out.println("Controller: Player bulunamadı."+e.getMessage());
			return false;
		}
	}
	
	public List<Player> findAll() {
		List<Player> userList = playerService.findAll();
		if (userList.isEmpty()) {
			System.out.println("Controller: Veritabanına kayıtlı Player bulunamadı");
		}
		return userList;
	}
	
	public List<Player> findPlayerByTeamID(Long teamID) {
		return playerService.findPlayerByTeamID(teamID);
	}
	
}