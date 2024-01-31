package com.example.services;

import com.example.dtos.PatientDto;
import com.example.models.Patients;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PatientService<I extends Number> {
    void delete(PatientDto patient);

    void delete(UUID id);

    List<PatientDto> getAll();

    Optional<PatientDto> findPatient(UUID id);

    Patients add(Patients patient);

    PatientDto add(PatientDto patient);
}
