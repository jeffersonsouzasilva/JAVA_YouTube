package dev.matheusIf.mastersys.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "graduações")
public class Graduacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
}
