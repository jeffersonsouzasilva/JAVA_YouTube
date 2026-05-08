package model;

import java.util.ArrayList;

public class Disciplina {
    private String codigo;
    private ArrayList<Aluno> alunos;
    private Professor professor;
    private ArrayList<Caderneta> cadernetas;

    public Disciplina(String codigo, ArrayList<Aluno> alunos,
                      Professor professor,
                      ArrayList<Caderneta> cadernetas) {
        this.codigo = codigo;
        this.alunos = alunos;
        this.professor = professor;
        this.cadernetas = cadernetas;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public ArrayList<Caderneta> getCadernetas() {
        return cadernetas;
    }

    public void setCadernetas(ArrayList<Caderneta> cadernetas) {
        this.cadernetas = cadernetas;
    }

}