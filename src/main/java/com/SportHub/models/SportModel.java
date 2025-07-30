package com.SportHub.models;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;


@Entity
@Table(name = "TB_SPORT")
public class SportModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID sportId;

    private String name;

    @ManyToMany(mappedBy = "sports")
    private List<SpaceModel> spaces;
}
