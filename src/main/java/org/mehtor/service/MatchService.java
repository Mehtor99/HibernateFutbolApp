package org.mehtor.service;

import org.mehtor.dto.request.MatchSaveRequestDto;
import org.mehtor.dto.response.MatchResponseDto;
import org.mehtor.entity.League;
import org.mehtor.entity.Match;
import org.mehtor.repository.LeagueRepository;
import org.mehtor.repository.MatchRepository;

import java.util.Optional;

public class MatchService extends ServiceManager<Match,Long> {
	private final MatchRepository matchRepository;
	
	public MatchService() {
		this(new MatchRepository());
	}
	
	public MatchService(MatchRepository matchRepository) {
		super(matchRepository);
		this.matchRepository = matchRepository;
	}

}