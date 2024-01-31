package com.example.init;

import com.example.dtos.DoctorDto;
import com.example.dtos.PatientDto;
import com.example.dtos.TicketDto;
import com.example.services.DoctorService;
import com.example.services.PatientService;
import com.example.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.UUID;

@Component
public class CommandLineRunnerImpl implements CommandLineRunner {

    @Autowired
    private DoctorService doctorService;

    @Autowired
    private PatientService patientService;

    @Autowired
    private TicketService ticketService;

    @Override
    public void run(String... args) throws Exception {
        seedData();
    }

    private void seedData() throws IOException {
        //Добавление в БД записей

        DoctorDto d = new DoctorDto(UUID.randomUUID(), "Egor", "Pediator", "+11111111111");
        DoctorDto sd = doctorService.add(d);

        PatientDto p = new PatientDto(UUID.randomUUID(), "Alah", "+11111111111", LocalDate.of(1995,8,17));
        PatientDto sp = patientService.add(p);

        TicketDto t = new TicketDto(sd.getId(), sp.getId(), LocalDate.of(2024, 1, 31), LocalTime.of(18,30), 3600, "konsultatia");
        TicketDto st = ticketService.add(t);


    }
}
