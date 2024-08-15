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
public class DoctorDTO {
    private Integer id;
    private String name;
    private String lastName;
    private String direction;
    private LocalDateTime dateOfBirth;
    private LocalDateTime createdAt;
    private LocalDateTime createdBy;
}
