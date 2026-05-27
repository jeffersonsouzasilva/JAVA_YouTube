package dev.matheusif.mastersys.dto;

import java.time.LocalDate;

public record AlunoRequest (
    String nome,
    LocalDate dataNascimento,
    String sexo,
    String telefone,
    String celular,
    String email,
    String observacao,
    String endereco,
    String numero,
    String complemento,
    String bairro,
    String cidade,
    String estado,
    String cep
){

}
