package com.example.models;

import jakarta.persistence.*;

@Entity
@Table(name = "doctors")
public class Doctors extends HumanBase{
    @Enumerated(EnumType.STRING)
    @Column(name = "doctor_type")
    private doctor_type doctorType;

    public Doctors() {
    }

    public Doctors(doctor_type doctorType){
        this.doctorType = doctorType;
    }

    public doctor_type getDoctorType() {
        return doctorType;
    }
    public void setDoctorType(doctor_type doctorType){
        this.doctorType = doctorType;
    }
}
