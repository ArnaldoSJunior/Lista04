package br.edu.up.models;

public class Vaga {
    
    private int numero;
    private  Boolean ocupada;
    private Carro carro;
    // private String carroModelo;
    // private String carroPlaca;
    // private String carroCor;

    public Vaga(int numero) {
        this.numero = numero;
        this.ocupada = false;
    }

    public void ocuparVaga(String placa, String modelo, String cor){
        if(ocupada != false){
          ocupada = true;
          carro = new Carro(modelo, placa, cor);
        }
    }

    public void liberarVaga(){
        if(ocupada){
            ocupada = false;
        }
    }

    public boolean ocupada(){
        return ocupada;
    }

    public Boolean getOcupada() {
        return ocupada;
    }
    
}
