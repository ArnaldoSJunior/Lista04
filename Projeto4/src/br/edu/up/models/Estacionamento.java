package br.edu.up.models;

public class Estacionamento {

    private Vaga[] vagas;
   
    
    public Estacionamento(int totalVagas) {
        this.vagas = new Vaga[10];
        for (int i = 0; i < 10; i++) {
            vagas[i] = new Vaga(i + 1); 
        }
    }
    
}
