package com.SportHub.repositories;

import com.SportHub.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<UUID, UserModel> {
}
