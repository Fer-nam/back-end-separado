package com.example.auth.domain.evento;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "evento")
@Entity(name = "evento")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String nome;

    private String descricao;

    private String image;

    private String linkEvento;


    public Evento(EventoRequestDTO data){
      this.nome = data.nome();
      this.descricao = data.descricao();
      this.image = data.image();
      this.linkEvento = data.linkEvento();
    }
}