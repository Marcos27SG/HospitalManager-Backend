package com.example.demo.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class VisitDTO {
    private Integer id;
    private String description;
    private Integer patientId;
    private Integer doctorId;
    private LocalDateTime createdAt;
    private LocalDateTime createdBy;
}
