package com.example.demo.web.rest;



import com.example.demo.dto.HospitalDTO;

import com.example.demo.services.HospitalService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/v1/hospitals")
public class HospitalController {

    private final HospitalService hospitalService;


    public HospitalController(HospitalService hospitalService) {
        this.hospitalService = hospitalService;

    }

    @GetMapping
    public ResponseEntity<List<HospitalDTO>> listHospitals() {
        return ResponseEntity.ok().body(hospitalService.listHospital());
    }


    @PostMapping
    public ResponseEntity<HospitalDTO> create(@RequestBody HospitalDTO hospitalDTO) throws URISyntaxException {
        if (hospitalDTO.getId() != null) {
            throw new IllegalArgumentException("Invalid Id on creation");
        }
        HospitalDTO hospitalDTOSaved = hospitalService.create(hospitalDTO);
        return ResponseEntity.created(new URI("/v1/hospital/" + hospitalDTOSaved.getId())).body(hospitalDTOSaved);
    }

    @PutMapping("/{id}")
    public ResponseEntity<HospitalDTO> update(@RequestBody HospitalDTO hospitalDTO, @PathVariable(name = "id") Integer id) {
        if (hospitalDTO.getId() == null) {
            throw new IllegalArgumentException("HospitalId required");
        }
        if (!Objects.equals(hospitalDTO.getId(), id)) {
            throw new IllegalArgumentException("Invalid Id");
        }

        return ResponseEntity.ok().body(hospitalService.update(hospitalDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteHospitalById(@PathVariable(name = "id") Integer id) {
        hospitalService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}


