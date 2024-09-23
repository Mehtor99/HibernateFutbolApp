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
import org.mehtor.entity.Team;
import org.mehtor.enums.ECluster;
import org.mehtor.enums.EColours;
import org.mehtor.enums.EPosition;
import org.mehtor.enums.ERegion;
import org.mehtor.gui.MainGui;
import org.mehtor.repository.PlayerRepository;
import org.mehtor.repository.TeamRepository;
import org.mehtor.service.LeagueService;
import org.mehtor.service.PlayerService;
import org.mehtor.utility.DataGenerator;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class Runner {
	public static void main(String[] args) {
		
//			DataGenerator dataGenerator = new DataGenerator();
//			dataGenerator.createGenerateData();
		
		PlayerController playerController = new PlayerController();
		PlayerRepository playerRepository = new PlayerRepository();//
		ManagerController managerController = new ManagerController();
		StadiumController stadiumController = new StadiumController();
		TeamController teamController = new TeamController();
		TeamRepository teamRepository = new TeamRepository();
		LeagueController leagueController = new LeagueController();
		
		
//		List<Player> playerByTeamId = playerController.findPlayerByTeamID(1L);
//		playerByTeamId.forEach(System.out::println);
		
//		List<Team> teamList = teamController.listAllByNameContainsValue("Spor");
//		teamList.forEach(System.out::println);
		
		MainGui.startApplication();
		
	}
}