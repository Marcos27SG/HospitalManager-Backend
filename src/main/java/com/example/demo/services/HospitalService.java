package com.example.demo.services;

import com.example.demo.dto.HospitalDTO;

import java.util.List;
import java.util.Optional;

public interface HospitalService {

    List<HospitalDTO> listHospital();


    HospitalDTO create(HospitalDTO hospitalDTO);

    HospitalDTO update(HospitalDTO hospitalDTO);

    void deleteById(Integer hospitalId);

}
