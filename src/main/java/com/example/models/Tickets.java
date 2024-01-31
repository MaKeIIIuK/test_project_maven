package com.example.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "tickets")
public class Tickets extends BaseEntity{
    @Column(name = "date_of_receipt")
    private LocalDate dateOfReceipt;
    @OneToOne
    @JoinColumn(name = "doctor_id", referencedColumnName = "id")
    private Doctors doctor;
    @OneToOne
    @JoinColumn(name = "patient_id", referencedColumnName = "id")
    private Patients patient;

    public Tickets(LocalDate dateOfReceipt, Doctors doctor, Patients patient){
        this.dateOfReceipt = dateOfReceipt;
        this.doctor = doctor;
        this.patient = patient;
    }
    public Tickets(){}

    public LocalDate getDateOfReceipt() {
        return dateOfReceipt;
    }
    public void setDateOfReceipt(LocalDate dateOfReceipt) {
        this.dateOfReceipt = dateOfReceipt;
    }
}
