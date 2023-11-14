package com.example.auth.repositories;

import com.example.auth.domain.evento.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoRepository extends JpaRepository<Evento, String> {
}
