package com.example.services.impl;

import com.example.dtos.TicketDto;
import com.example.models.Tickets;
import com.example.repositories.TicketRepository;
import com.example.services.TicketService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class TicketServiceImpl implements TicketService<Integer> {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private TicketRepository ticketRepository;

    @Override
    public void delete(TicketDto patient){
        ticketRepository.deleteById(patient.getId());
    }

    @Override
    public void delete(UUID id){
        ticketRepository.deleteById(id);
    }

    @Override
    public List<TicketDto> getAll() {
        return ticketRepository.findAll().stream().map((t) -> modelMapper.map(t, TicketDto.class)).collect(Collectors.toList());
    }

    @Override
    public Optional<TicketDto> findTicket(UUID id){
        return Optional.ofNullable(modelMapper.map(ticketRepository.findById(id), TicketDto.class));
    }

    @Override
    public Tickets add(Tickets ticket) {
        return null;
    }

    @Override
    public TicketDto add(TicketDto ticket) {
        Tickets t = modelMapper.map(ticket, Tickets.class);

        return modelMapper.map(ticketRepository.save(t), TicketDto.class);
    }
}
