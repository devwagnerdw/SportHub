package com.SportHub.models;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "TB_EVENTS")
public class EventModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID eventId;


    @Column(nullable = false, length = 100)
    private String title;

    @Column(length = 255)
    private String description;

    @Column(nullable = false)
    private LocalDateTime startDateTime;

    @Column(nullable = false)
    private LocalDateTime endDateTime;

    @ManyToMany(mappedBy = "events")
    private Set<UserModel> users;

}
