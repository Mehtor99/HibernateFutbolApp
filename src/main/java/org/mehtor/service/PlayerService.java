package org.mehtor.service;

import org.mehtor.dto.request.PlayerSaveRequestDto;
import org.mehtor.dto.response.PlayerResponseDto;
import org.mehtor.entity.League;
import org.mehtor.entity.Player;
import org.mehtor.entity.Team;
import org.mehtor.repository.ICrud;
import org.mehtor.repository.PlayerRepository;

import java.util.List;
import java.util.Optional;

public class PlayerService extends ServiceManager<Player, Long> {
	private final PlayerRepository playerRepository;
	private final TeamService teamService;
	
	public PlayerService() {
		this(new PlayerRepository());
	}
	
	public PlayerService(PlayerRepository playerRepository) {
		super(playerRepository);
		this.playerRepository = playerRepository;
		this.teamService = new TeamService();
	}
	
	
	public Optional<PlayerResponseDto> save(PlayerSaveRequestDto dto) {
		Player player;
		Optional<Player> playerOptional;
		PlayerResponseDto responseDto=new PlayerResponseDto();
		
		try{
			Optional<Team> teamOptional= teamService.findTeamIdByName(dto.getTeamName());
			if(teamOptional.isPresent()){
				player=new Player();
				player.setName(dto.getName());
				player.setSurname(dto.getSurname());
				player.setBirthday(dto.getBirthday());
				player.setPosition(dto.getPosition());
				player.setTeamID(teamOptional.get().getId());
				playerOptional=Optional.of(playerRepository.save(player));
				
				
				responseDto.setName(playerOptional.get().getName());
				responseDto.setSurname(playerOptional.get().getSurname());
				responseDto.setBirthday(playerOptional.get().getBirthday());
				responseDto.setPosition(playerOptional.get().getPosition());
				System.out.println(playerOptional.get().getName()+" başarıyla kaydedildi");
				return Optional.of(responseDto);
			}
		}
		catch(Exception e){
			System.out.println("Player kaydedilirken hata oluştur "+e.getMessage());
		}
		return Optional.of(responseDto);
	}
	
	public List<Player> findPlayerByTeamID(Long teamID){
		try {
			return playerRepository.findPlayerByTeamId(teamID);
		}
		catch (Exception e) {
			System.out.println("Service: ListAllByNameContainsValue hata oluştu: "+e.getMessage());
		}
		return null;
	}
	
}