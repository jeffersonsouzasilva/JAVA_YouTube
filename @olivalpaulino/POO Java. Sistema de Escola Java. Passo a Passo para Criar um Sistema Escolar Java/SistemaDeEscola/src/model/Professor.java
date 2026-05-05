package model;

import java.util.ArrayList;

public class Professor extends Pessoa{
    private ArrayList<Turma> turmas;
    private Disciplina disciplina;

    public Professor(String nome, String id, ArrayList<Turma> turmas, Disciplina disciplina) {
        super(nome, id);
        this.turmas = turmas;
        this.disciplina = disciplina;
    }


}
