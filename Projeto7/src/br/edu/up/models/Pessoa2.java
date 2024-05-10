package br.edu.up.models;

public abstract class Pessoa2 {

    private String nome;
    private int rg;
    private int matricula;
    
    public Pessoa2(String nome, int rg, int matricula) {
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
    
    
}
