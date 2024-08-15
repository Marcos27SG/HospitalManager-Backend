package com.example.demo.repositories.spring.data;

import com.example.demo.domain.entities.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {
}