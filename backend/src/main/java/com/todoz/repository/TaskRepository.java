package com.todoz.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todoz.model.Task;

public interface TaskRepository extends JpaRepository<Task, UUID> {
    List<Task> findByTodo_Id(UUID todo);

    List<Task> findByIsDone(Boolean isDone);
    
}
