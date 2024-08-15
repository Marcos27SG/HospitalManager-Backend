package com.example.demo.repositories.spring.data;


import com.example.demo.domain.entities.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HospitalRepository extends JpaRepository<Hospital, Integer> {
}
