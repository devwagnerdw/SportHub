package com.SportHub.controllers;

import com.SportHub.dtos.UserDto;
import com.SportHub.models.UserModel;
import com.SportHub.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping()
    public ResponseEntity<Object>registerUser(@RequestBody UserDto userDto){
        UserModel userModel= userService.registerUser(userDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(userModel);

    }
}
