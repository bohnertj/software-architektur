package com.dhbw.wgapp.presentation;

import java.time.LocalDate;
import java.util.ArrayList;

public class UserDto {
    public String firstName;
    public String lastName;
    public LocalDate bday;
    public ArrayList<TaskDto> todoList = new ArrayList<TaskDto>();


    @Override
    public String toString() {
        return "UserDto{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", bday=" + bday +
                ", todoList=" + todoList +
                '}';
    }
}
