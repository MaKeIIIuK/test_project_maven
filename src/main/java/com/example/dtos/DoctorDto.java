package com.example.dtos;

import java.util.UUID;

public class DoctorDto {

    private UUID id;

    private String doctorName;

    private String doctorSpeciality;

    private String doctorPhoneNumber;

    public DoctorDto() {
    }

    public DoctorDto(UUID id, String doctorName, String doctorSpeciality, String doctorPhoneNumber){
        this.id = id;
        this.doctorName = doctorName;
        this.doctorSpeciality = doctorSpeciality;
        this.doctorPhoneNumber = doctorPhoneNumber;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getDoctorName(){
        return this.doctorName;
    }

    public void setDoctorName(String doctorName){
        this.doctorName = doctorName;
    }

    public String getDoctorSpeciality() {
        return doctorSpeciality;
    }

    public void setDoctorSpeciality(String doctorSpeciality) {
        this.doctorSpeciality = doctorSpeciality;
    }

    public String getDoctorPhoneNumber() {
        return doctorPhoneNumber;
    }

    public void setDoctorPhoneNumber(String doctorPhoneNumber) {
        this.doctorPhoneNumber = doctorPhoneNumber;
    }

}
