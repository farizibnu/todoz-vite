package com.todoz.repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todoz.model.User;

public interface UserRepository extends JpaRepository<User, UUID> {
    List<User> findByNameContainingIgnoreCase(String name);
    
    List<User> findByCreatedAtAfter(LocalDateTime date);
       
}