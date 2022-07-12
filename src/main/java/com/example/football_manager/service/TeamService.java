package com.example.football_manager.service;

import com.example.football_manager.entity.Team;

import java.util.Set;

public interface TeamService {

    public void saveTeam(Team Team);

    public Team getTeam(Integer id);

    public void deleteTeam(Integer id);

    Set<Team> retrieveAllTeams();

    void updateTeam(Team team);
}
