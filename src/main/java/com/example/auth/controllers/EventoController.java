package com.example.auth.controllers;

import com.example.auth.domain.evento.Evento;

import com.example.auth.domain.evento.EventoRequestDTO;
import com.example.auth.domain.evento.EventoResponseDTO;
import com.example.auth.repositories.EventoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("evento")
public class EventoController {

    @Autowired
    EventoRepository repository;

    @PostMapping
    public ResponseEntity postProduct(@RequestBody @Valid EventoRequestDTO body){
        Evento newEvento = new Evento(body);

        this.repository.save(newEvento);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity getAllEventos(){
        List<EventoResponseDTO> eventoList = this.repository.findAll().stream().map(EventoResponseDTO::new).toList();

        return ResponseEntity.ok(eventoList);
    }
}
