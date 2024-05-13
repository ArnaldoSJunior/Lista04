package br.edu.up.models;

public abstract class Pessoa {

    private String nome;
    private int rg;
    private int matricula;
    
    public Pessoa(String nome, int rg, int matricula) {
        this.nome = nome;
        this.rg = rg;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public int getRg() {
        return rg;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    
    
}
