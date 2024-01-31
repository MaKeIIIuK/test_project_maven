package com.example.controllers;

import java.util.UUID;

public class TicketNotFoundException extends RuntimeException{
    TicketNotFoundException(UUID id) {
        super("Could not find ticket " + id);
    }
}
