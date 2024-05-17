package br.edu.up.models;

import br.edu.up.db.Banco;

public class Disciplina {
    
    private int id;
    private String nome;
    private String curso;
    private Competencia[] competencias;
    private Professor professor;
    private Aluno[] alunos = new Aluno[Banco.ctlrAluno.getAlunos().length];

    public Disciplina(int id, String nome, String curso, Competencia[] competencias) {
        this.id = id;
        this.nome = nome;
        this.curso = curso;
        this.competencias = competencias;
    }
    public void adicionatAluno(int k, Aluno aluno){
        alunos[k] = aluno;
    }

    
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Competencia[] getCompetencias() {
        return competencias;
    }

    public void setCompetencias(Competencia[] competencias) {
        this.competencias = competencias;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurriculo() {
        return curso;
    }

    public void setCurriculo(String curriculo) {
        this.curso = curriculo;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }


    public Aluno[] getAlunos() {
        return alunos;
    }


    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
    public void setAluno(Aluno aluno){
        for(int i=0; i < alunos.length; i++){
            if (alunos[i] == null) {
                alunos[i] = aluno;
            }
        }
    }

    public Aluno getAlunos(int i) {
        return alunos[i];
    }
    

 
}
