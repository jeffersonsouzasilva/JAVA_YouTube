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
}
