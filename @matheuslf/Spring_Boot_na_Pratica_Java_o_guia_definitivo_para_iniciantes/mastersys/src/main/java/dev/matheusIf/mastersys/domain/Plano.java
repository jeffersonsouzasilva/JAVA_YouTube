package dev.matheusIf.mastersys.domain;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "planos")
public class Plano {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Column(name = "valor_mensal")
    private BigDecimal valorMensal;

}
