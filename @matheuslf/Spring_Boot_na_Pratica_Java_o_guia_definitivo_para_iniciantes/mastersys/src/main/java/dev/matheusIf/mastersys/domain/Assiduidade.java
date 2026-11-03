package dev.matheusIf.mastersys.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "assiduidade")
public class Assiduidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


}
