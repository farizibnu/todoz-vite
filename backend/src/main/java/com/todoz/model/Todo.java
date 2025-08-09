package com.todoz.model;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Data
@Table(name = "todos")
public class Todo {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    private String name;

    private String description;

    @Column(name = "start_date")
    private LocalDateTime startDate;

    @Column(name = "due_date")
    private LocalDateTime dueDate;

    @Enumerated(EnumType.STRING)
    private TodoStatus status;
    
}
