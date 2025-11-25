package com.miguel.todo.controller;

import com.miguel.todo.service.useCases.CreateTaskUseCase;
import com.miguel.todo.dto.TaskDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    @Autowired
    private CreateTaskUseCase createTaskUseCase;

    @PostMapping
    public ResponseEntity<Object> create(@RequestBody TaskDto dto){
        //como fazer tratativas de erro no Springboot sem utilizar o try catch
        try {
        TaskDto response = createTaskUseCase.create(dto);
        return ResponseEntity.ok(response);

        } catch (Exception erro){
            return ResponseEntity.badRequest().body(erro.getMessage());
        }

    };

}
