package com.miguel.todo.service;

import com.miguel.todo.dto.TaskDto;
import com.miguel.todo.model.TaskEntity;
import com.miguel.todo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class TaskService {
    @Autowired
    private TaskRepository repository;

    public TaskDto criar(TaskDto dto){

        TaskEntity task = TaskEntity.builder()
                .title(dto.getTitle())
                .dateOfDelivery(dto.getDateOfDelivery())
                .dateOfStart(dto.getDateOfStart())
                .description(dto.getDescription())
                .build();

        //salva
        TaskEntity salvar = repository.save(task);

        //transformar no builder
        TaskDto resposta = TaskDto.builder().title(salvar.getTitle())
                .dateOfDelivery(salvar.getDateOfDelivery())
                .dateOfStart(salvar.getDateOfStart())
                .description(salvar.getDescription())
                .build();
        return resposta;
    }
}
