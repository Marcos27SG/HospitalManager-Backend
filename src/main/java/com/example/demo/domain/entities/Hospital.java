package com.example.demo.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "hospital_db")
public class Hospital {

    @Id
    @SequenceGenerator(name = "hospital_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hospital_sequence")
    private Integer id;

    @Column(name = "name", nullable = false, length = 150)
    private String name;


    @Column(name = "created_at", columnDefinition = "TIMESTAMP")
    private LocalDateTime createdAt;

    @Column(name = "created_by", columnDefinition = "TIMESTAMP")
    private LocalDateTime createdBy;

}
