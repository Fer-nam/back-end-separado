package com.example.auth.domain.evento;

public record EventoResponseDTO(String id, String nome, String descricao, String image, String linkEvento) {
    public EventoResponseDTO(Evento evento){
        this(evento.getId(), evento.getNome(), evento.getDescricao(), evento.getImage(), evento.getLinkEvento());
    }
}
