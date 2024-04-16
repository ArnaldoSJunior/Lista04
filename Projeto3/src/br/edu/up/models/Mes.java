package br.edu.up.models;

public class Mes {

    private String nome;
    private int numDias;
    private Dia[] dias;

    public Mes(Dia[] dias) {
        this.dias = dias;
        this.numDias = dias.length; 
}
 }