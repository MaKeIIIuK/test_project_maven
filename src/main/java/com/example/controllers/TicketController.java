package com.example.controllers;

import com.example.dtos.TicketDto;
import com.example.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
public class TicketController {
    @Autowired
    private TicketService ticketService;

    @GetMapping("/tickets")
    Iterable<TicketDto> all() {
        return ticketService.getAll();
    }

    @GetMapping("/tickets/{id}")
    TicketDto one(@PathVariable UUID id) throws Throwable {
        return (TicketDto) ticketService.findTicket(id)
                .orElseThrow(() -> new TicketNotFoundException(id));
    }

    @PostMapping("/tickets")
    TicketDto newTicket(@RequestBody TicketDto newTicket) {
        return ticketService.add(newTicket);
    }

    @DeleteMapping("/tickets/{id}")
    void deleteTicket(@PathVariable UUID id) {
        ticketService.delete(id);
    }
}
