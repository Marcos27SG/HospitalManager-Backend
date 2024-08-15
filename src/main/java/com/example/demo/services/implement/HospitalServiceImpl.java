package com.example.demo.services.implement;

import com.example.demo.domain.entities.Hospital;

import com.example.demo.dto.HospitalDTO;

import com.example.demo.repositories.spring.data.HospitalRepository;
import com.example.demo.services.HospitalService;
import com.example.demo.services.mapper.HospitalMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class HospitalServiceImpl implements HospitalService {

    private final HospitalRepository hospitalRepository;
    private final HospitalMapper hospitalMapper;

    public HospitalServiceImpl(HospitalRepository hospitalRepository, HospitalMapper hospitalMapper) {
        this.hospitalRepository = hospitalRepository;
        this.hospitalMapper = hospitalMapper;
    }

    @Override
    @Transactional(readOnly = true)
    public List<HospitalDTO> listHospital() {
        return hospitalRepository.findAll().stream().map(hospitalMapper::toDto).collect(Collectors.toList());
    }


    @Override
    public HospitalDTO create(HospitalDTO hospitalDTO) {
        Hospital hospital = hospitalRepository.save(hospitalMapper.toEntity(hospitalDTO));
        return hospitalMapper.toDto(hospital);
    }

    @Override
    public HospitalDTO update(HospitalDTO hospitalDTO) {
        Hospital hospital = hospitalRepository.save(hospitalMapper.toEntity(hospitalDTO));
        return hospitalMapper.toDto(hospital);
    }

    @Override
    public void deleteById(Integer hospitalId) {
        hospitalRepository.deleteById(hospitalId);
    }


}
