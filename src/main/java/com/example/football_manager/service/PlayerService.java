package com.example.football_manager.service;

import com.example.football_manager.entity.Player;

import java.util.Set;

public interface PlayerService {

    public void savePlayer(Player player);

        public Player getPlayer(Integer id);

    public void deletePlayer(Integer id);

    Set<Player> retrieveAllPlayers();

    void updatePlayer(Player player);
}
