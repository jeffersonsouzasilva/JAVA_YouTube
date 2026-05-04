package model;

import java.util.ArrayList;

public class Aluno extends Pessoa{
    private Turma turma;
    private ArrayList<Disciplina> disciplinas;

    public Aluno(String nome, String id, Turma turma, ArrayList<Disciplina> disciplinas) {
        super(nome, id);
        this.turma = turma;
        this.disciplinas = disciplinas;
    }
}
