package com.example.demo.repositories.spring.data;

import com.example.demo.domain.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Integer> {
}