package com.example.services.impl;

import com.example.dtos.PatientDto;
import com.example.models.Patients;
import com.example.repositories.PatientRepository;
import com.example.services.PatientService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class PatientServiceImpl implements PatientService<Integer> {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private PatientRepository patientRepository;

    @Override
    public void delete(PatientDto patient){
        patientRepository.deleteById(patient.getId());
    }

    @Override
    public void delete(UUID id){
        patientRepository.deleteById(id);
    }

    @Override
    public List<PatientDto> getAll() {
        return patientRepository.findAll().stream().map((p) -> modelMapper.map(p, PatientDto.class)).collect(Collectors.toList());
    }

    @Override
    public Optional<PatientDto> findPatient(UUID id){
        return Optional.ofNullable(modelMapper.map(patientRepository.findById(id), PatientDto.class));
    }

    @Override
    public Patients add(Patients patient) {
        return null;
    }

    @Override
    public PatientDto add(PatientDto patient) {
        Patients p = modelMapper.map(patient, Patients.class);

        return modelMapper.map(patientRepository.save(p), PatientDto.class);
    }
}
