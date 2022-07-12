package com.example.football_manager.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "budget")
    private Integer budget;
    @Column(name = "commission")
    private Integer commission;
    @OneToMany(mappedBy = "team")
    private Set<Player> players;


}
