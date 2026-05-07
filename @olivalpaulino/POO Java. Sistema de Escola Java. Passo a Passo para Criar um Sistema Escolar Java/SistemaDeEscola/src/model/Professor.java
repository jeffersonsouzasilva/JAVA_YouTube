package model;

import java.util.ArrayList;

public class Professor extends Pessoa{
    private ArrayList<Turma> turmas;
    private Disciplina disciplina;

    public Professor(String nome, String id,
                     ArrayList<Turma> turmas,
                     Disciplina disciplina) {
        super(nome, id);
        this.turmas = turmas;
        this.disciplina = disciplina;
    }

    public ArrayList<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(ArrayList<Turma> turmas) {
        this.turmas = turmas;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "turmas=" + turmas +
                ", disciplina=" + disciplina +
                '}';
    }
}
