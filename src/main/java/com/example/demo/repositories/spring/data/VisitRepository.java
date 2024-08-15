package com.example.demo.repositories.spring.data;

import com.example.demo.domain.entities.Visit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitRepository extends JpaRepository<Visit, Integer> {
}