package com.example.demo.repositories.spring.data;

import com.example.demo.domain.entities.Specialty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpecialtyRepository extends JpaRepository<Specialty, Integer> {
}