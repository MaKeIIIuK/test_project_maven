package com.example.controllers;

import com.example.dtos.DoctorDto;
import com.example.services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
public class DoctorController {
    private DoctorService doctorService;

    @GetMapping("/doctors")
    Iterable<DoctorDto> all()
    {
        return doctorService.getAll();
    }

    @GetMapping("/doctors/{id}")
    DoctorDto one(@PathVariable UUID id) throws  Throwable {
        return (DoctorDto) doctorService.findDoctor(id)
                .orElseThrow(() -> new DoctorNotFoundException(id));
    }

    @PostMapping("/doctors")
    DoctorDto newDoctor(@RequestBody DoctorDto newDoctor){
        return doctorService.add(newDoctor);
    }

    @DeleteMapping("/doctors/{id}")
    void deleteDoctor(@PathVariable UUID id) {doctorService.delete(id);}

    @Autowired
    public void setDoctorService(DoctorService doctorService) {
        this.doctorService = doctorService;
    }
}
