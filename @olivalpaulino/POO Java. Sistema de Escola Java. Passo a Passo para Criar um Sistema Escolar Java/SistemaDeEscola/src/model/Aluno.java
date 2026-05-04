package model;

import java.util.ArrayList;

public class Aluno extends Pessoa{
    private Turma turma;
    private ArrayList<Disciplina> disciplinas;

    public Aluno(Turma turma, ArrayList<Disciplina> disciplinas) {
        this.turma = turma;
        this.disciplinas = disciplinas;
    }
}
