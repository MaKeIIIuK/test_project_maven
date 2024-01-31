package com.example.controllers;

import java.util.UUID;

public class PatientNotFoundException extends RuntimeException{
    PatientNotFoundException(UUID id) {
        super("Could not find patient " + id);
    }
}
