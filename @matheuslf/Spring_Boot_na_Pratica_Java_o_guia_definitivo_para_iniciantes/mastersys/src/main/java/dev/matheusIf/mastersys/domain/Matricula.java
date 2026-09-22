package dev.matheusIf.mastersys.domain;

import dev.matheusIf.mastersys.domain.enums.StatusMatricula;
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

    @Column(name = "dia_vencimento")
    private Integer diaVencimento;

    @Column(name = "data_encerramento")
    private LocalDate dataEncerramento;

    @Enumerated(EnumType.STRING)
    private StatusMatricula status = StatusMatricula.ATIVA;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;
}
