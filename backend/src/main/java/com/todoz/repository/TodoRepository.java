package com.todoz.repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.todoz.model.Todo;
import com.todoz.model.TodoStatus;
import com.todoz.model.User;


@Repository
public interface TodoRepository extends JpaRepository<Todo, UUID> {
    List<Todo> findByUser(User user);
    
    List<Todo> findByStatus(TodoStatus status);

    List<Todo> findByDueDateBetween(LocalDateTime startDate, LocalDateTime dueDate);
    
}
