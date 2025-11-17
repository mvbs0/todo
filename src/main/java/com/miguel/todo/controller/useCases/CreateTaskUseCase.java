package com.miguel.todo.controller.useCases;

import com.miguel.todo.dto.TaskDto;
import com.miguel.todo.model.TaskEntity;
import com.miguel.todo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateTaskUseCase {
    @Autowired
    //injeção de dependência

    private TaskRepository repository;

    public TaskDto execute (TaskDto dto){
        dto.getDescription();
        dto.getDateOfDelivery();
        dto.getTitle();
        dto.getDateOfStart();

        TaskEntity task = TaskEntity.builder()
                .title(dto.getTitle())
                .dateOfDelivery(dto.getDateOfDelivery())
                .dateOfStart(dto.getDateOfStart())
                .description(dto.getDescription())
                .build();

        TaskEntity saved = repository.save(task);

        TaskDto response = TaskDto.builder()
                .title(saved.getTitle())
                .dateOfDelivery(saved.getDateOfDelivery())
                .dateOfStart(saved.getDateOfStart())
                .description(saved.getDescription())
                .build();

        return response;

    }

}
