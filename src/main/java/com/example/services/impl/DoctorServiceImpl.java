package com.example.services.impl;

import com.example.dtos.DoctorDto;
import com.example.models.Doctors;
import com.example.repositories.DoctorRepository;
import com.example.services.DoctorService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class DoctorServiceImpl implements DoctorService<Integer> {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private DoctorRepository doctorRepository;

    @Override
    public void delete(DoctorDto doctor){
        doctorRepository.deleteById(doctor.getId());
    }

    @Override
    public void delete(UUID id){
        doctorRepository.deleteById(id);
    }

    @Override
    public List<DoctorDto> getAll() {
        return doctorRepository.findAll().stream().map((d) -> modelMapper.map(d, DoctorDto.class)).collect(Collectors.toList());
    }

    @Override
    public Optional<DoctorDto> findDoctor(UUID id){
        return Optional.ofNullable(modelMapper.map(doctorRepository.findById(id), DoctorDto.class));
    }

    @Override
    public DoctorDto add(DoctorDto doctor) {
        Doctors d = modelMapper.map(doctor, Doctors.class);

        return modelMapper.map(doctorRepository.save(d), DoctorDto.class);
    }
}
