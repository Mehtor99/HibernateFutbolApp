package org.mehtor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.mehtor.controller.*;
import org.mehtor.dto.request.*;
import org.mehtor.dto.response.*;
import org.mehtor.entity.BaseEntity;
import org.mehtor.entity.League;
import org.mehtor.entity.Player;
import org.mehtor.enums.ECluster;
import org.mehtor.enums.EColours;
import org.mehtor.enums.EPosition;
import org.mehtor.enums.ERegion;
import org.mehtor.repository.PlayerRepository;
import org.mehtor.repository.TeamRepository;
import org.mehtor.service.LeagueService;
import org.mehtor.service.PlayerService;
import org.mehtor.utility.DataGenerator;

import java.time.LocalDate;
import java.util.Optional;

public class Runner {
	public static void main(String[] args) {
		
		PlayerController playerController = new PlayerController();
		ManagerController managerController = new ManagerController();
		StadiumController stadiumController = new StadiumController();
		TeamController teamController = new TeamController();
		LeagueController leagueController = new LeagueController();
		
		
//		leagueService.save(League.builder().leagueName("Trendyol lig").build());
//		playerService.save(Player.builder().name("Mike").birthday(LocalDate.of(1996,12,7)).build());
		
//		DataGenerator dataGenerator = new DataGenerator();
//		dataGenerator.createGenerateData();
		
//      PlayerSaveRequestDto dto = new PlayerSaveRequestDto("Fenerbahçe", "Ahmet", "Güler", LocalDate.of(1995,5,15), EPosition.MIDFIELD);
//		Optional<PlayerResponseDto> responseDto = playerController.save(dto);
		
//		ManagerSaveRequestDto dto = new ManagerSaveRequestDto("Galatasaray","Kemal","Özogli","12345",LocalDate.of(1997,5,18));
//		Optional<ManagerResponseDto> managerResponseDto = managerController.save(dto);
//		System.out.println(managerResponseDto);
		
		
//		StadiumSaveRequestDto dto = new StadiumSaveRequestDto("Ali Samiyen","İstanbul",50000);
//		Optional<StadiumResponseDto> stadiumResponseDto = stadiumController.save(dto);
//		System.out.println(stadiumResponseDto);
		
//		TeamSaveRequestDto dto = new TeamSaveRequestDto("Ali Samiyen", "Alper Spor", "Alper Güler", "2005", EColours.BLACK_RED);
//		Optional<TeamResponseDto> teamResponseDto = teamController.save(dto);
//		System.out.println(teamResponseDto);
		
//		LeagueSaveRequestDto dto = new LeagueSaveRequestDto("Mehtor League", "Season 25", ECluster.TRENDYOL_SUPER_LIG, ERegion.TURKIYE,LocalDate.of(2025,3,10));
//		Optional<LeagueResponseDto> leagueResponseDto = leagueController.save(dto);
//		System.out.println(leagueResponseDto);
	
		
	
	}
}