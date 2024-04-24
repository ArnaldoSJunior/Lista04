package br.edu.up.models;

public class Estacionamento {

    private Vaga[] vagas;
    private int cont = 0;
    
    public Estacionamento(int totalVagas) {
        this.vagas = new Vaga[totalVagas]; 
        for (int i = 0; i < totalVagas; i++) {
            vagas[i] = new Vaga(i + 1); 
        }
    }

    public int vagasDisponiveis(){
       for(Vaga vaga : vagas){
          if( ! vaga.ocupada()){
            cont++;
          }
       }
       return cont;
    }
}
