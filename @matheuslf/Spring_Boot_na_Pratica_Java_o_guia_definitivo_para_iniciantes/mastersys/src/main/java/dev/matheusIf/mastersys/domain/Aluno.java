package dev.matheusIf.mastersys.domain;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "alunos")
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Column(name = "data_nascimento")
    private LocalDate dataNascimento;

}
