package com.dhbw.wgapp.core;

import com.dhbw.wgapp.dataaccess.TaskDataAccessObject;
import com.dhbw.wgapp.presentation.TaskController;
import com.dhbw.wgapp.presentation.TaskDto;

public class TaskService {

    public void createTask(TaskDto taskDto) {
        TaskDataAccessObject dao = new TaskDataAccessObject();
        dao.save(taskDto);
    }
}