package com.dhbw.wgapp.dataaccess;

import com.dhbw.wgapp.db.DummyDB;
import com.dhbw.wgapp.presentation.TaskController;
import com.dhbw.wgapp.presentation.TaskDto;

public class TaskDataAccessObject {
    DummyDB db = new DummyDB();

    public void save(TaskDto task) {
        db.save(task);
    }
}