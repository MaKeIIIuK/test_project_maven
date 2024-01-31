package com.example.dtos;

import java.time.LocalDate;
import java.util.UUID;

public class PatientDto {

    private UUID id;

    private String patientName;

    private String patientPhoneNumber;

    private LocalDate patientBirthDate;

    public PatientDto() {
    }

    public PatientDto(UUID id, String patientName, String patientPhoneNumber, LocalDate patientBirthDate){
        this.id = id;
        this.patientName = patientName;
        this.patientPhoneNumber = patientPhoneNumber;
        this.patientBirthDate = patientBirthDate;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getPatientName(){
        return this.patientName;
    }

    public void setPatientName(String patientName){
        this.patientName = patientName;
    }

    public String getPatientPhoneNumber() {
        return patientPhoneNumber;
    }

    public void setPatientPhoneNumber(String patientPhoneNumber) {
        this.patientPhoneNumber = patientPhoneNumber;
    }

    public LocalDate getPatientBirthDate() {
        return patientBirthDate;
    }

    public void setPatientBirthDate(LocalDate patientBirthDate) {
        this.patientBirthDate = patientBirthDate;
    }
}
