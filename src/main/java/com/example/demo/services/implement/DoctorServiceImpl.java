package com.example.demo.services.implement;

import com.example.demo.domain.entities.Hospital;

import com.example.demo.dto.HospitalDTO;

import com.example.demo.repositories.spring.data.DoctorRepository;
import com.example.demo.repositories.spring.data.HospitalRepository;
import com.example.demo.services.DoctorService;
import com.example.demo.services.HospitalService;
import com.example.demo.services.mapper.DoctorMapper;
import com.example.demo.services.mapper.HospitalMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class DoctorServiceImpl  {

}