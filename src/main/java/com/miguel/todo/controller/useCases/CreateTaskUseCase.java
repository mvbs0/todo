package com.miguel.todo.controller.useCases;

import com.miguel.todo.dto.TaskDto;
import com.miguel.todo.model.TaskEntity;
import com.miguel.todo.repository.TaskRepository;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
// service é geralmete utilizado no use case pq ele está na camada de serviço( tudo que contém lógica na geralmente é utilizado na camada de serioviço
@Service
public class CreateTaskUseCase {
    //injeção de dependência
    @Autowired
    private TaskRepository repository;

    @SneakyThrows
    public TaskDto create(TaskDto dto) {

        if(dto.getTitle() == null || dto.getTitle().isBlank()) {
            throw new IllegalAccessException("Title is required");
        }

        TaskEntity task = TaskMapper.toEntity(dto);
        TaskEntity saved = repository.save(task);

        return TaskMapper.toDto(saved);
    }

}
