package com.example.controllers;

import com.example.dtos.PatientDto;
import com.example.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
public class PatientController {
    @Autowired
    private PatientService patientService;

    @GetMapping("/patients")
    Iterable<PatientDto> all()
    {
        return patientService.getAll();
    }

    @GetMapping("/patients/{id}")
    PatientDto one(@PathVariable UUID id) throws  Throwable {
        return (PatientDto) patientService.findPatient(id)
                .orElseThrow(() -> new PatientNotFoundException(id));
    }

    @PostMapping("/patients")
    PatientDto newPatient(@RequestBody PatientDto newPatient){
        return patientService.add(newPatient);
    }

    @DeleteMapping("/patients/{id}")
    void deletePatient(@PathVariable UUID id) {patientService.delete(id);}
}
