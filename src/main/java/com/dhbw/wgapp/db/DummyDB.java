package com.dhbw.wgapp.db;

import com.dhbw.wgapp.presentation.TaskController;
import com.dhbw.wgapp.presentation.TaskDto;
import com.dhbw.wgapp.presentation.UserDto;

import java.util.ArrayList;
import java.util.List;

public class DummyDB {
    private List<TaskDto> tasks = new ArrayList<>();
    private List<UserDto> users = new ArrayList<>();

    public DummyDB() {
    }

    public void saveUser(UserDto user) {
        users.add(user);

        System.out.println(users);
    }
    public void save(TaskDto task) {
        tasks.add(task);

        System.out.println(tasks);
    }

}
