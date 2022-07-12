package com.example.football_manager.controller;

import com.example.football_manager.entity.Player;
import com.example.football_manager.entity.Team;
import com.example.football_manager.service.PlayerService;
import com.example.football_manager.service.TeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class MyRestController {

    private final PlayerService playerService;
    private final TeamService teamService;

    @GetMapping("/players")
    public Set<Player> getAllPlayers() {
        return playerService.retrieveAllPlayers();
    }

    @GetMapping("/players/{id}")
    public Player getPlayer(@PathVariable Integer id) {
        return playerService.getPlayer(id);
    }

    @PostMapping("/players")
    public ResponseEntity<String> addNewPlayer(@RequestBody Player player) {
        playerService.savePlayer(player);
        return ResponseEntity.ok().body(String.format("player:[{}] was successfully added", player));
    }

    @PutMapping("/players")
    public ResponseEntity<String> updatePlayer(@RequestBody Player player) {
        playerService.updatePlayer(player);
        return ResponseEntity.ok().body(String.format("player with id:%d was successfully updated", player.getId()));
    }

    @DeleteMapping("/players/{id}")
    public ResponseEntity<String> deletePlayer(@PathVariable Integer id) {
        playerService.deletePlayer(id);
        return ResponseEntity.ok().body(String.format("player with id:%d was successfully deleted", id));
    }


    @GetMapping("/teams")
    public Set<Team> showAllTeams() {
        return teamService.retrieveAllTeams();
    }

    @GetMapping("/teams/{id}")
    public Team getTeam(@PathVariable Integer id) {
    return teamService.getTeam(id);
    }

    @PostMapping("/teams")
    public ResponseEntity<String> addNewPlayer(@RequestBody Team team) {
        teamService.saveTeam(team);
        return ResponseEntity.ok().body(String.format("team:[{}] was successfully added", team));
    }

    @PutMapping("/teams")
    public ResponseEntity<String> updateTeam(@RequestBody Team team) {
        teamService.updateTeam(team);
        return ResponseEntity.ok().body(String.format("team with id:%d was successfully updated", team.getId() ));
    }

    @DeleteMapping("/teams/{id}")
    public ResponseEntity<String> deleteTeam(@PathVariable Integer id) {
        teamService.deleteTeam(id);
        return ResponseEntity.ok().body(String.format("team with id:%d was successfully deleted", id ));
    }

//    @PostMapping("/transfer")
//    public String transferPlayer(@RequestParam("id") Integer playerId, @RequestParam("to") Integer teamId) {
//        Player player = playerService.getPlayer(playerId);
//        Team teamTo = teamService.getTeam(teamId);
//        teamTo.addNewPlayer();
//
//    }
}
