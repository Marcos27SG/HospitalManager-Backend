package com.example.demo.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class HospitalDTO {
    private Integer id;
    private String name;
    private LocalDateTime createdAt;
    private LocalDateTime createdBy;
}
