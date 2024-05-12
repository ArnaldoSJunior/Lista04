package br.edu.up.models;

public class Disciplina {
    
    private int id;
    private String nome;
    private String curso;
    private Competencia[] competencias;



    
 
    public Disciplina(int id, String nome, String curso, Competencia[] competencias) {
        this.id = id;
        this.nome = nome;
        this.curso = curso;
        this.competencias = competencias;
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

 
   
    
    
}
