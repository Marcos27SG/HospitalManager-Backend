package com.example.demo.services.mapper;



import com.example.demo.domain.entities.Hospital;
import com.example.demo.dto.HospitalDTO;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class HospitalMapper implements CustomMapper<HospitalDTO, Hospital> {
    @Override
    public HospitalDTO toDto(Hospital hospital) {
        HospitalDTO hospitalDTO = new HospitalDTO();
        hospitalDTO.setId(hospital.getId());
        hospitalDTO.setName(hospital.getName());
        hospitalDTO.setCreatedAt(hospital.getCreatedAt());
        hospitalDTO.setCreatedBy(hospital.getCreatedBy());
        return hospitalDTO;
    }


    @Override
    public Hospital toEntity(HospitalDTO hospitalDTO) {
        Hospital hospital = new Hospital();
        hospital.setId(hospitalDTO.getId());
        hospital.setName(hospitalDTO.getName());
        hospital.setCreatedAt(hospitalDTO.getCreatedAt());
        hospital.setCreatedAt(hospitalDTO.getCreatedBy());
        return hospital;
    }
}

