package com.SportHub.repositories;

import com.SportHub.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<UserModel,UUID> {
    boolean existsByUsername(String username);

    boolean existsByCpf(String cpf);

    boolean existsByEmail(String email);

    boolean existsByPhoneNumber(String phoneNumber);
}
