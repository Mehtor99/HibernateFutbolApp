package org.mehtor.controller;

import org.mehtor.dto.request.ManagerSaveRequestDto;
import org.mehtor.dto.response.ManagerResponseDto;
import org.mehtor.entity.League;
import org.mehtor.entity.Manager;
import org.mehtor.service.ICrudService;
import org.mehtor.service.LeagueService;
import org.mehtor.service.ManagerService;
import org.mehtor.service.MatchService;

import java.util.List;
import java.util.Optional;

public class ManagerController  {
	private final ManagerService managerService;
	
	public ManagerController() {
		this.managerService =new ManagerService();
	}
	
	public Optional<ManagerResponseDto> save(ManagerSaveRequestDto dto) {
		try {
			System.out.println("Controller Manager başarıyla kaydedildi.");
			return managerService.save(dto);
			
		} catch (Exception e) {
			System.out.println("Controller Manager kaydedilirken hata oluştu: " + e.getMessage());
		}
		return Optional.empty();
	}
	
	
	public Iterable<Manager> saveAll(List<Manager> manager) {
		try {
			System.out.println("Controller Manager başarıyla kaydedildi.");
			return managerService.saveAll(manager);
			
		} catch (Exception e) {
			System.out.println("Controller Manager kaydedilirken hata oluştu: " + e.getMessage());
		}
		return manager;
	}
	
	
	public Boolean deleteById(Long longid) {
		try {
			Boolean isDeleted = managerService.deleteById(longid);
			if (isDeleted) {
				System.out.println("Controller: Manager silindi");
				return true;
			}
			else {
				System.out.println("Controller: Manager silinirken hata oldu.");
				return false;
			}
		}catch (Exception e) {
			System.out.println("Controller: Manager silinirken hata oldu"+e.getMessage());
			return false;
		}
	}
	
	public Optional<Manager> findById(Long longid) {
		Optional<Manager> userOptional = managerService.findById(longid);
		return userOptional;
	}
	
	public Boolean existById(Long longid) {
		try {
			Boolean isExistById = managerService.existById(longid);
			if (isExistById) {
				System.out.println("Controller: Manager basarıyla bulundu.");
				return true;
			}
			else {
				System.out.println("Controller: Manager bulunamadı.");
				return false;
			}
		}
		catch (Exception e) {
			System.out.println("Controller: Manager bulunamadı."+e.getMessage());
			return false;
		}
	}
	
	public List<Manager> findAll() {
		List<Manager> userList = managerService.findAll();
		if (userList.isEmpty()) {
			System.out.println("Controller: Veritabanına kayıtlı Manager bulunamadı");
		}
		return userList;
	}
	
	public Optional<Manager> findManagerByIdAndPassword(Long id, String password) {
		return managerService.findManagerByIdAndPassword(id, password);
	}
	
	public Optional<Long> findTeamIdByManagerId(Long managerId) {
		return managerService.findTeamIdByManagerId(managerId);
	}
	
	public Optional<Manager> findByTeamId(Long secilenTakimID) {
		return managerService.findByTeamId(secilenTakimID);
	}
	
}