package com.example.demo.services.implement;

import com.example.demo.domain.entities.Hospital;
import com.example.demo.domain.entities.Patient;
import com.example.demo.dto.HospitalDTO;
import com.example.demo.dto.PatientDTO;
import com.example.demo.repositories.spring.data.HospitalRepository;
import com.example.demo.repositories.spring.data.PatientRepository;
import com.example.demo.services.mapper.HospitalMapper;
import com.example.demo.services.mapper.PatientMapper;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

public class PatientServiceImpl {

    private final PatientRepository patientRepository;
    private final PatientMapper patientMapper;

    public PatientServiceImpl(PatientRepository patientRepository, PatientMapper patientMapper) {
        this.PatientRepository = patientRepository;
        this.PatientMapper = patientMapper;
    }

    @Override
    @Transactional(readOnly = true)
    public List<PatientDTO> listPatient() {
        return patientRepository.findAll().stream().map(patientMapper::toDto).collect(Collectors.toList());
    }


    @Override
    public PatientDTO create(HospitalDTO hospitalDTO) {
        Patient patient = patientRepository.save(patientMapper.toEntity(patientDTO));
        return patientMapper.toDto(patient);
    }

    @Override
    public PatientDTO update(HospitalDTO hospitalDTO) {
        Patient patient = patientRepository.save(patientMapper.toEntity(patientDTO));
        return patientMapper.toDto(patient);
    }

    @Override
    public void deleteById(Integer hospitalId) {
        patientRepository.deleteById(patientId);
    }
}
