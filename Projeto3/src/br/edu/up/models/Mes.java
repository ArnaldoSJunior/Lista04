package br.edu.up.models;

public class Mes {

    private String nome;
    private int numDias;
    private Dia[] dias;

    public Mes(int dias, String nome) {
        this.numDias = dias;
        this.dias = new Dia[dias];
        this.nome = nome;

    }
}