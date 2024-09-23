package org.mehtor.service;

import org.mehtor.dto.request.TeamSaveRequestDto;
import org.mehtor.dto.response.TeamResponseDto;
import org.mehtor.entity.League;
import org.mehtor.entity.Stadium;
import org.mehtor.entity.Team;
import org.mehtor.repository.LeagueRepository;
import org.mehtor.repository.StadiumRepository;
import org.mehtor.repository.TeamRepository;

import java.util.List;
import java.util.Optional;

public class TeamService extends ServiceManager<Team,Long> {
	private final TeamRepository teamRepository;
	private final StadiumService stadiumService;
	
	public TeamService() {
		this(new TeamRepository());
	}
	public TeamService(TeamRepository teamRepository) {
		super(teamRepository);
		this.teamRepository = teamRepository;
		this.stadiumService = new StadiumService();
	}
	
	public Optional<Team> findTeamIdByName(String teamName) {
		return teamRepository.findTeamIdByName(teamName);
	}
	
	public Optional<TeamResponseDto> save(TeamSaveRequestDto dto){
		Team team;
		Optional<Team> teamOptional;
		TeamResponseDto teamResponseDto = new TeamResponseDto();
		
		try {
			Optional<Stadium> stadiumOptional =stadiumService.findStadiumIdByName(dto.getStadiumName());
			if (stadiumOptional.isPresent()) {
				team = new Team();
				team.setTeamName(dto.getTeamName());
				team.setPresidentName(dto.getPresidentName());
				team.setFoundationDate(dto.getFoundationDate());
				team.setColour(dto.getColour());
				team.setStadiumID(stadiumOptional.get().getId());
				teamOptional = Optional.of(teamRepository.save(team));
				
				teamResponseDto.setStadiumName(stadiumOptional.get().getStadiumName());
				teamResponseDto.setTeamName(teamOptional.get().getTeamName());
				teamResponseDto.setPresidentName(teamOptional.get().getPresidentName());
				teamResponseDto.setFoundationDate(teamOptional.get().getFoundationDate());
				teamResponseDto.setColour(teamOptional.get().getColour());
				System.out.println(teamOptional.get().getTeamName()+" takımı başarıyla kaydedildi.");
				return Optional.of(teamResponseDto);
			}
		}
		catch (Exception e) {
			System.out.println("Service: Team kaydedilirken hata oluştu."+ e.getMessage());
		}
		return Optional.of(teamResponseDto);
	}
	
	public List<Team> listAllByNameContainsValue(String value){
		try {
			return teamRepository.listAllByNameContainsValue(value);
		}
		catch (Exception e) {
			System.out.println("Service : listAllByNameContainsValue metodunda hata oluştu" + e.getMessage());
			return null;
		}
	}
}