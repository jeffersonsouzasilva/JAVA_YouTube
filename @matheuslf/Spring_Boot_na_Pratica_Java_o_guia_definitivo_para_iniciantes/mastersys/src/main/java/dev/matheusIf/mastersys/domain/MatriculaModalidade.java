package dev.matheusIf.mastersys.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "matriculas_modalidades")
public class MatriculaModalidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
