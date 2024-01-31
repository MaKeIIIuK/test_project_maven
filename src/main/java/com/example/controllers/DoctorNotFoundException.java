package com.example.controllers;

import java.util.UUID;

public class DoctorNotFoundException extends RuntimeException{
    DoctorNotFoundException(UUID id) {
        super("Could not find doctor " + id);
    }
}
