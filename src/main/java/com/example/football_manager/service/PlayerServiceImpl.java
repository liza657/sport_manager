package com.example.football_manager.service;

import com.example.football_manager.entity.Player;
import com.example.football_manager.repository.PlayerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class PlayerServiceImpl implements PlayerService {

    private final PlayerRepository playerRepository;

    @Override
    @Transactional
    public Set<Player> retrieveAllPlayers() {
        Set<Player> set = new HashSet<>();
        playerRepository.findAll().forEach(set::add);
        return set;
    }

    @Override
    public void updatePlayer(Player player) {
        playerRepository.save(player);
    }


    @Override
    @Transactional
    public void savePlayer(Player player) {
        playerRepository.save(player);
    }

    @Override
    @Transactional
    public Player getPlayer(Integer id) {
        return playerRepository.findById(id).get();
    }

    @Override
    @Transactional
    public void deletePlayer(Integer id) {
        playerRepository.findById(id).ifPresent(playerRepository::delete);
    }

}
