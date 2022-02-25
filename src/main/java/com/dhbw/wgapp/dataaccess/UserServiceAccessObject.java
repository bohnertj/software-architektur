package com.dhbw.wgapp.dataaccess;

import com.dhbw.wgapp.db.DummyDB;
import com.dhbw.wgapp.presentation.UserDto;

public class UserServiceAccessObject {
    DummyDB db = new DummyDB();

    public void saveUser(UserDto user){
        db.saveUser(user);
    }
}
