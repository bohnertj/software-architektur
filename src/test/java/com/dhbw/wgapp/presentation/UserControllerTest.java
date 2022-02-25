package com.dhbw.wgapp.presentation;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class UserControllerTest {
    @Test
    void name() {
        TaskController controllerTask = new TaskController();
        TaskDto taskDto = new TaskDto();
        taskDto.dueDay = LocalDate.now();
        taskDto.titel = "Apfel kaufen";
        controllerTask.createTask(taskDto);

        UserController controllerUser= new UserController();
        UserDto userDto = new UserDto();
        userDto.firstName= "Max";
        userDto.lastName="Müller";
        userDto.bday= LocalDate.now();

        //userDto.todoList.add(taskDto);
        controllerUser.createUser(userDto);
    }
}