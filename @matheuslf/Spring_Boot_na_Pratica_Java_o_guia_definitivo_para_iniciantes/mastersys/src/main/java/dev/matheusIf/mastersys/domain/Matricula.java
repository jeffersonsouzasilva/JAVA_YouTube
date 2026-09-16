package dev.matheusIf.mastersys.domain;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "matriculas")
public class Matricula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "data_matricula")
    private LocalDate dataMatricula;
}
