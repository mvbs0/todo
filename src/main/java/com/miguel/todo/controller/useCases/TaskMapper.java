package com.miguel.todo.controller.useCases;

import com.miguel.todo.dto.TaskDto;
import com.miguel.todo.model.TaskEntity;

public class TaskMapper {

    public static TaskEntity toEntity(TaskDto dto) {
        return TaskEntity.builder()
                .title(dto.getTitle())
                .dateOfDelivery(dto.getDateOfDelivery())
                .dateOfStart(dto.getDateOfStart())
                .description(dto.getDescription())
                .build();
    }

    public static TaskDto toDto(TaskEntity entity) {
        return TaskDto.builder()
                .title(entity.getTitle())
                .dateOfDelivery(entity.getDateOfDelivery())
                .dateOfStart(entity.getDateOfStart())
                .description(entity.getDescription())
                .build();
    }
}
