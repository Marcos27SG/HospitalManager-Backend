package com.example.demo.services.mapper;


import com.example.demo.domain.entities.Doctor;
import com.example.demo.domain.entities.Patient;
import com.example.demo.dto.DoctorDTO;
import com.example.demo.dto.PatientDTO;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class SpecialtyMapper implements CustomMapper<DoctorDTO, Doctor> {

    @Override
    public DoctorDTO toDto(Doctor doctor) {
        DoctorDTO doctorDTO = new DoctorDTO();
        doctorDTO.setId(doctor.getId());
        doctorDTO.setName(doctor.getName());
        doctorDTO.setLastName(doctor.getLastName());
        doctorDTO.setCreatedAt(doctor.getCreatedAt());
        doctorDTO.setCreatedBy(doctor.getCreatedBy());
        return doctorDTO;
    }


    @Override
    public Doctor toEntity(DoctorDTO doctorDTO) {
        Doctor doctor = new Doctor();
        doctor.setId(doctorDTO.getId());
        doctor.setName(doctorDTO.getName());
        doctor.setCreatedAt(doctorDTO.getCreatedAt());
        doctor.setCreatedAt(doctorDTO.getCreatedBy());
        return doctor;
    }
}