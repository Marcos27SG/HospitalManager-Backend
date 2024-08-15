package com.example.demo.services.mapper;


import com.example.demo.domain.entities.Doctor;
import com.example.demo.domain.entities.Visit;
import com.example.demo.domain.entities.Patient;
import com.example.demo.dto.VisitDTO;
import com.example.demo.dto.PatientDTO;
import com.example.demo.dto.VisitDTO;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class VisitMapper implements CustomMapper<VisitDTO, Visit> {

    @Override
    public VisitDTO toDto(Visit visit) {
        VisitDTO visitDTO = new VisitDTO();
        visitDTO.setId(visit.getId());
        visitDTO.setDescription(visit.getDescription());
        visitDTO.setPatientId(visit.getPatient().getId());
        visitDTO.setDoctorId(visit.getDoctor().getId());
        visitDTO.setCreatedAt(visit.getCreatedAt());
        visitDTO.setCreatedBy(visit.getCreatedBy());
        return visitDTO;
    }


    @Override
    public Visit toEntity(VisitDTO visitDTO) {
        Visit visit = new Visit();
        visit.setId(visitDTO.getId());
        visit.setDescription(visitDTO.getDescription());
        visit.setPatient(new Patient());
        visit.setDoctor(new Doctor());
        visit.setCreatedAt(visitDTO.getCreatedAt());
        visit.setCreatedAt(visitDTO.getCreatedBy());
        return visit;
    }
}