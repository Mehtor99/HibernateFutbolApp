package org.mehtor.service;

import org.mehtor.dto.request.LeagueSaveRequestDto;
import org.mehtor.dto.response.LeagueResponseDto;
import org.mehtor.entity.League;
import org.mehtor.repository.LeagueRepository;

import java.util.Optional;

public class LeagueService extends ServiceManager<League ,Long> {
	private final LeagueRepository leagueRepository;
	
	public LeagueService() {
		this(new LeagueRepository());
	}
	
	public LeagueService(LeagueRepository leagueRepository) {
		super(leagueRepository);
		this.leagueRepository = leagueRepository;
	}
	
	
	public Optional<LeagueResponseDto> save(LeagueSaveRequestDto dto){
		League league = new League();
		Optional<League> leagueOptional;
		LeagueResponseDto leagueResponseDto = new LeagueResponseDto();
		
		try {
			league.setLeagueName(dto.getLeagueName());
			league.setLeagueSeason(dto.getLeagueSeason());
			league.setCluster(dto.getCluster());
			league.setRegion(dto.getRegion());
			league.setStartDate(dto.getStartDate());
			leagueOptional =Optional.of(leagueRepository.save(league));
			
			leagueResponseDto.setLeagueName(leagueOptional.get().getLeagueName());
			leagueResponseDto.setLeagueSeason(leagueOptional.get().getLeagueSeason());
			leagueResponseDto.setCluster(leagueOptional.get().getCluster());
			leagueResponseDto.setRegion(leagueOptional.get().getRegion());
			leagueResponseDto.setStartDate(leagueOptional.get().getStartDate());
			System.out.println(league.getLeagueName()+ "isimli lig başarıyla eklendi");
			return Optional.of(leagueResponseDto);
		}
		catch (Exception e) {
			System.out.println("Service : League kaydedilirken hata oluştu. "+e.getMessage());
		}
		return Optional.of(leagueResponseDto);
	}
	
}