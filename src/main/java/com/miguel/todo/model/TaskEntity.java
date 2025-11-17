package com.miguel.todo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity (name = "task")
public class TaskEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column (nullable = false)
    private Date dateOfDelivery;
    @Column (nullable = false)
    private Date dateOfStart;
    @Column (nullable = false)
    private String description;
    @Column (nullable = false)
    private String title;

}
