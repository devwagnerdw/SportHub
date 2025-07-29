package com.SportHub.models;

import jakarta.persistence.*;

import java.util.List;

public class SpaceModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    private boolean active;

    @ManyToMany
    @JoinTable(
            name = "space_sports",
            joinColumns = @JoinColumn(name = "space_id"),
            inverseJoinColumns = @JoinColumn(name = "sport_id")
    )
    private List<SportModel> sports;

}
