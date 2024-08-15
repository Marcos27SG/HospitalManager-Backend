package com.example.demo.services.mapper;


import com.example.demo.domain.entities.Patient;
import com.example.demo.dto.PatientDTO;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class PatientMapper implements CustomMapper<PatientDTO, Patient> {

    @Override
    public PatientDTO toDto(Patient patient) {
        PatientDTO patientDTO = new PatientDTO();
        patientDTO.setId(patient.getId());
        patientDTO.setName(patient.getName());
        patientDTO.setLastName(patient.getLastName());
        patientDTO.setCreatedAt(patient.getCreatedAt());
        patientDTO.setCreatedBy(patient.getCreatedBy());
        return patientDTO;
    }


    @Override
    public Patient toEntity(PatientDTO patientDTO) {
        Patient patient = new Patient();
        patient.setId(patientDTO.getId());
        patient.setName(patientDTO.getName());
        patient.setCreatedAt(patientDTO.getCreatedAt());
        patient.setCreatedAt(patientDTO.getCreatedBy());
        return patient;
    }
}