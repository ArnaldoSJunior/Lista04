package br.edu.up.controllers;

import br.edu.up.models.*;

public class ControlePassageiro {

Passageiro[] passageiros = new Passageiro[10];

public String adicionarPassageiro(String nome, int rg, int idBagagem){

    for(int i=0; i < 10; i++){
    if(passageiros[i]==null){
     if(passageiros[i] == null){
        passageiros[i] = new Passageiro(nome,rg,idBagagem);
        return passageiros[i].toString();
     }
    }
}
return "null";
}


 }