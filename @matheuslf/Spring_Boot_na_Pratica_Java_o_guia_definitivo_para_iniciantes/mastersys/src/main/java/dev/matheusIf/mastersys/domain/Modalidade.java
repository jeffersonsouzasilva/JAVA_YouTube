package dev.matheusIf.mastersys.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "modalidades")
public class Modalidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
}
