package com.miguel.todo.repository;

import com.miguel.todo.model.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TaskRepository extends JpaRepository<TaskEntity, UUID> {
}
