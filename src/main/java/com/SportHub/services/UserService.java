package com.SportHub.services;

import com.SportHub.dtos.UserDto;
import com.SportHub.models.UserModel;
import org.springframework.stereotype.Service;

public interface UserService {

    UserModel registerUser(UserDto userDto);
}
