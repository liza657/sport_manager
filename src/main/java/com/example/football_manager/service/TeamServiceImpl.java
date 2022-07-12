package com.example.football_manager.service;

import com.example.football_manager.entity.Team;
import com.example.football_manager.repository.TeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.Set;

@RequiredArgsConstructor
@Service
public class TeamServiceImpl implements TeamService {

    private final TeamRepository teamRepository;

    @Override
    @Transactional
    public Set<Team> retrieveAllTeams() {
        Set<Team> set = new HashSet<>();
        teamRepository.findAll().forEach(set::add);
        return set;
    }

    @Override
    public void updateTeam(Team team) {
        teamRepository.save(team);

    }


    @Override
    @Transactional
    public void saveTeam(Team team) {
        teamRepository.save(team);
    }


    @Override
    @Transactional
    public Team getTeam(Integer id) {
        return teamRepository.findById(id).get();

    }

    @Override
    @Transactional
    public void deleteTeam(Integer id) {
        teamRepository.findById(id).ifPresent(teamRepository::delete);
    }



}
