package com.SportHub.services.impl;

import com.SportHub.dtos.UserDto;
import com.SportHub.enums.UserStatus;
import com.SportHub.exception.BusinessException;
import com.SportHub.models.UserModel;
import com.SportHub.repositories.UserRepository;
import com.SportHub.services.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneId;

@Service
public class UserServiceImpl implements UserService {

     private  final UserRepository  userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserModel registerUser(UserDto userDto) {
        if (userRepository.existsByUsername(userDto.getUsername())) {
            throw new BusinessException("Username is already taken:" + userDto.getUsername());
        }

        if (userRepository.existsByCpf(userDto.getCpf())) {
            throw new BusinessException("Cpf is already taken:" + userDto.getCpf());
        }

        if (userRepository.existsByEmail(userDto.getEmail())) {
            throw new BusinessException("Email is already taken:" + userDto.getEmail());
        }

        if (userRepository.existsByPhoneNumber(userDto.getPhoneNumber())){
            throw new BusinessException("PhoneNumber is already taken:" + userDto.getPhoneNumber());
        }
        var userModel = new UserModel();
        BeanUtils.copyProperties(userDto, userModel);
        userModel.setUserStatus(UserStatus.ACTIVE);
        userModel.setCreationDate(LocalDateTime.now(ZoneId.of("UTC")));
        userModel.setLastUpdateDate(LocalDateTime.now(ZoneId.of("UTC")));
         return userRepository.save(userModel);
    }
}
