package br.edu.up.models;

public class Vaga {
    
    private int numero;
    private  Boolean ocupada;

    public Vaga(int numero) {
        this.numero = numero;
        this.ocupada = false;
    }

    public void ocuparVaga(){
        if(!ocupada){
          ocupada = true;
        }
    }

    public void liberarVaga(){
        if(ocupada){
            ocupada = false;
        }
    }
}
