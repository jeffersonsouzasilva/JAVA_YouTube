package dev.matheusIf.mastersys.domain;

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

}
