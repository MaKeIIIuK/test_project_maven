package com.example.services;

import com.example.dtos.TicketDto;
import com.example.models.Tickets;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface TicketService<I extends Number> {
    void delete(TicketDto ticket);

    void delete(UUID id);

    List<TicketDto> getAll();

    Optional<TicketDto> findTicket(UUID id);

    Tickets add(Tickets ticket);

    TicketDto add(TicketDto ticket);
}
