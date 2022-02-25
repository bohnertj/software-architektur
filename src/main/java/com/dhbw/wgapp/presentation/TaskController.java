package com.dhbw.wgapp.presentation;

import com.dhbw.wgapp.core.TaskService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@SpringBootApplication

public class TaskController {

    public void createTask(TaskDto taskDto) {
        TaskService taskService = new TaskService();
        taskService.createTask(taskDto);
    }
}