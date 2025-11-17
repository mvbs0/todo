package com.miguel.todo.dto;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
@Data
@Builder
public class TaskDto {

    private Date dateOfDelivery;

    private Date dateOfStart;

    private String description;

    private String title;

    public void setDescription() {
    }
}
