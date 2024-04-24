package br.edu.up.models;

public class Estacionamento {

    private Vaga[] vagas;
    private int cont;
    private int totalVagas = 10;

    public Estacionamento() {
        this.vagas = new Vaga[totalVagas]; 
        for (int i = 0; i < totalVagas; i++) {
            vagas[i] = new Vaga(i + 1); 
        }
    }

    public int vagasDisponiveis(){
       cont = 0;
       for(Vaga vaga : vagas){
          if( ! vaga.ocupada()){
            cont++;
          }
       }
       return cont;
    }
}
