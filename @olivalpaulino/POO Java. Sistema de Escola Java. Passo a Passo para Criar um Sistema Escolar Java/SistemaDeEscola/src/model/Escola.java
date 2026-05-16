package model;

import java.util.ArrayList;

public class Escola {
    private String nome;
    private String codigo;
    private ArrayList<Turma> turmas;
    private ArrayList<Aluno> alunos;
    private ArrayList<Professor> professores;
    private ArrayList<Disciplina> disciplinas;
    private ArrayList<Caderneta> cadernetas;

    public Escola(String nome, String codigo,
                  ArrayList<Turma> turmas,
                  ArrayList<Aluno> alunos,
                  ArrayList<Professor> professores,
                  ArrayList<Disciplina> disciplinas,
                  ArrayList<Caderneta> cadernetas) {
        this.nome = nome;
        this.codigo = codigo;
        this.turmas = turmas;
        this.alunos = alunos;
        this.professores = professores;
        this.disciplinas = disciplinas;
        this.cadernetas = cadernetas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(ArrayList<Turma> turmas) {
        this.turmas = turmas;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public ArrayList<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(ArrayList<Professor> professores) {
        this.professores = professores;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public ArrayList<Caderneta> getCadernetas() {
        return cadernetas;
    }

    public void setCadernetas(ArrayList<Caderneta> cadernetas) {
        this.cadernetas = cadernetas;
    }

    @Override
    public String toString() {
        return "Escola{" +
                "nome='" + nome + '\'' +
                ", codigo='" + codigo + '\'' +
                ", turmas=" + turmas +
                ", alunos=" + alunos +
                ", professores=" + professores +
                ", disciplinas=" + disciplinas +
                ", cadernetas=" + cadernetas +
                '}';
    }
}
