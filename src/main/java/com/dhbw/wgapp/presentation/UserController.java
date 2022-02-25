package com.dhbw.wgapp.presentation;

import com.dhbw.wgapp.core.UserService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    public void createUser(UserDto userDto){
        UserService userService = new UserService();
        userService.createUser(userDto);
    }

}
