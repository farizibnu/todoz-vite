package com.todoz.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.todoz.model.Task;
import com.todoz.repository.TaskRepository;

@Service
public class TaskService {
    
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }
}
