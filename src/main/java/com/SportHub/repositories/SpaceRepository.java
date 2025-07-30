package com.SportHub.repositories;

import com.SportHub.models.SpaceModel;
import com.SportHub.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SpaceRepository extends JpaRepository< SpaceModel ,UUID> {
}
