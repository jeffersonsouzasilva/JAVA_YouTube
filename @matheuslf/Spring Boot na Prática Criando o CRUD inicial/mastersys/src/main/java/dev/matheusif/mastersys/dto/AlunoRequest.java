package dev.matheusif.mastersys.dto;

import dev.matheusif.mastersys.domain.enums.Aluno;

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
    public Aluno toEntity(){
        Aluno aluno = new Aluno();
        preencher(aluno);
        return aluno;
    }

    public void preencher(Aluno aluno){

    }


}
