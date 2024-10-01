package org.mehtor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.mehtor.controller.*;
import org.mehtor.dto.request.*;
import org.mehtor.dto.response.*;
import org.mehtor.entity.*;
import org.mehtor.enums.ECluster;
import org.mehtor.enums.EColours;
import org.mehtor.enums.EPosition;
import org.mehtor.enums.ERegion;
import org.mehtor.gui.MainGui;
import org.mehtor.gui.MatchGui;
import org.mehtor.model.ControllerModel;
import org.mehtor.repository.ManagerRepository;
import org.mehtor.repository.PlayerRepository;
import org.mehtor.repository.TeamRepository;
import org.mehtor.service.LeagueService;
import org.mehtor.service.PlayerService;
import org.mehtor.utility.DataGenerator;
import org.mehtor.utility.game_function.FixtureGenerator;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Runner {
	public static void main(String[] args) {
	
			DataGenerator dataGenerator = new DataGenerator();
//			dataGenerator.createGenerateData();
		
		
		ControllerModel controllerModel = ControllerModel.getInstance();
		PlayerRepository playerRepository = new PlayerRepository();//
		ManagerRepository managerRepository = new ManagerRepository();
		TeamRepository teamRepository = new TeamRepository();
	
		
		
		List<Long> takimIDleri = teamRepository.findAllTeamIds();
		FixtureGenerator fixtureGenerator =new FixtureGenerator(takimIDleri, LocalDate.of(2024, 10, 8));

		////////////////////////
                                 		MainGui.startApplication();
		
//		MatchGui.createFixture();
//		fixtureGenerator.makeMatch();
//		MatchGui.fiksturuYazdir();
		

//		fixtureGenerator.printLeagueTable();

	
	
	}
}