package br.edu.up.models;

public class Disciplina {
    
    private int id;
    private String nome;
    private String curriculo;
    private Competencia[] competencias;



    
    public Disciplina(int id, String nome, String curriculo) {
        this.id = id;
        this.nome = nome;
        this.curriculo = curriculo;
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
        return curriculo;
    }
    public void setCurriculo(String curriculo) {
        this.curriculo = curriculo;
    }

    
    
}
