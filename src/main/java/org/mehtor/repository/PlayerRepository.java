package org.mehtor.repository;

import org.mehtor.entity.Player;

public class PlayerRepository extends RepositoryManager<Player,Long> {
	
	public PlayerRepository() {
		super(Player.class);
	}
}