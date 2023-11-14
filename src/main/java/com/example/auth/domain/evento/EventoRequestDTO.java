package com.example.auth.domain.evento;

import jakarta.validation.constraints.NotBlank;

public record EventoRequestDTO(
        @NotBlank
        String nome,

        @NotBlank
        String descricao,

        @NotBlank
        String image,
        @NotBlank
        String linkEvento




) {
}
