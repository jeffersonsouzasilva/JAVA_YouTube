package model;

import java.util.ArrayList;

public class Turma {
    private String nome;
    private String codigo;
    private ArrayList<Disciplina> disciplinas;
    private ArrayList<Professor> professores;
    private ArrayList<Aluno> alunos;

    public Turma(String nome, String codigo,
                 ArrayList<Disciplina> disciplinas,
                 ArrayList<Professor> professores,
                 ArrayList<Aluno> alunos) {
        this.nome = nome;
        this.codigo = codigo;
        this.disciplinas = disciplinas;
        this.professores = professores;
        this.alunos = alunos;
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

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public ArrayList<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(ArrayList<Professor> professores) {
        this.professores = professores;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    @Override
    public String toString() {
        return "Turma{" +
                "nome='" + nome + '\'' +
                ", codigo='" + codigo + '\'' +
                ", disciplinas=" + disciplinas +
                ", professores=" + professores +
                ", alunos=" + alunos +
                '}';
    }
}
