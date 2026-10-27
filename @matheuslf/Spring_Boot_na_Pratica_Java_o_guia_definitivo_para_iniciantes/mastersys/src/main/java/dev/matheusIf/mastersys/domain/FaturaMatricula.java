package dev.matheusIf.mastersys.domain;

import dev.matheusIf.mastersys.domain.enums.StatusFatura;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "faturas_matriculas")
public class FaturaMatricula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "data_vencimento")
    private LocalDate dataVencimento;

    private BigDecimal valor;

    @Column(name = "data_pagemento")
    private LocalDateTime dataPagamento;

    @Column(name = "data_cancelamento")
    private LocalDate dataCancelamento;

    @Enumerated(EnumType.STRING)
    private StatusFatura status = StatusFatura.ABERTA;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "matricula_id")
//    private Matricula matricula;
}
