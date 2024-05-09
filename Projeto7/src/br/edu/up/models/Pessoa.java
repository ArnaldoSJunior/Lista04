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

    
}
