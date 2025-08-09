package com.todoz.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.todoz.model.Todo;
import com.todoz.model.User;
import com.todoz.repository.TodoRepository;

@Service
public class TodoService {
    
    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    public List<Todo> getTodoByUser(User user) {
        return todoRepository.findByUser(user);
    }

    public Todo createTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    public Todo updateTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    public void deleteTodo(UUID id) {
        todoRepository.deleteById(id);
    }
    
}
