package com.example.services;

import com.example.dtos.DoctorDto;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface DoctorService <I extends Number> {
    void delete(DoctorDto doctor);

    void delete(UUID id);

    List<DoctorDto> getAll();

    Optional<DoctorDto> findDoctor(UUID id);

    DoctorDto add(DoctorDto doctor);
}
