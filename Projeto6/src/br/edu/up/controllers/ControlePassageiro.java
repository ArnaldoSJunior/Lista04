package br.edu.up.controllers;

import br.edu.up.models.*;

public class ControlePassageiro {

    Passageiro[] passageiros = new Passageiro[10];

    public String adicionarPassageiro(String nome, int rg, int idBagagem, String acento, String classe, String data, String voo){
        for(int i=0; i < 10; i++){
            if(passageiros[i]==null){
                passageiros[i] = new Passageiro(nome,rg,idBagagem);
                passageiros[i].registrarPassagem(nome,  acento,  classe,  data, voo);
                return passageiros[i].toString();
        }
    }
    return "null";
    }


 }