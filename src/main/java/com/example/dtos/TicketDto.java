package com.example.dtos;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

public class TicketDto{

    private UUID id;

    private UUID doctorId;

    private UUID patientId;

    private LocalDate ticketDate;

    private LocalTime ticketTime;

    private int ticketDuration;

    private String ticketProcedureType;
    public TicketDto() {
    }
    public TicketDto(UUID doctorId, UUID patientId, LocalDate ticketDate, LocalTime ticketTime, int ticketDuration, String ticketProcedureType){
        this.doctorId = doctorId;
        this.patientId = patientId;
        this.ticketDate = ticketDate;
        this.ticketTime = ticketTime;
        this.ticketDuration = ticketDuration;
        this.ticketProcedureType = ticketProcedureType;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(UUID doctorId) {
        this.doctorId = doctorId;
    }

    public UUID getPatientId() {
        return patientId;
    }

    public void setPatientId(UUID patientId) {
        this.patientId = patientId;
    }

    public LocalDate getTicketDate() {
        return ticketDate;
    }

    public void setTicketDate(LocalDate ticketDate) {
        this.ticketDate = ticketDate;
    }

    public LocalTime getTicketTime() {
        return ticketTime;
    }

    public void setTicketTime(LocalTime ticketTime) {
        this.ticketTime = ticketTime;
    }

    public int getTicketDuration() {
        return ticketDuration;
    }

    public void setTicketDuration(int ticketDuration) {
        this.ticketDuration = ticketDuration;
    }

    public String getTicketProcedureType() {
        return ticketProcedureType;
    }

    public void setTicketProcedureType(String ticketProcedureType) {
        this.ticketProcedureType = ticketProcedureType;
    }
}
