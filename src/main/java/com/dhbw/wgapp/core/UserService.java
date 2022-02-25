package com.dhbw.wgapp.core;

import com.dhbw.wgapp.dataaccess.UserServiceAccessObject;
import com.dhbw.wgapp.presentation.UserDto;

public class UserService {
    public void createUser(UserDto userDto){
        UserServiceAccessObject dao = new UserServiceAccessObject();
        dao.saveUser(userDto);
    }
}
