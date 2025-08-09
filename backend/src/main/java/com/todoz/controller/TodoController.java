package com.todoz.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todoz.model.Todo;
import com.todoz.service.TodoService;

@RestController
@RequestMapping("/todos")
public class TodoController {
    
    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping
    public List<Todo> getAllTodos() {
        return todoService.getAllTodos();
    }
}
