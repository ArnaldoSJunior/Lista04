package br.edu.up.controllers;

import javax.xml.crypto.Data;
import br.edu.up.models.*;

public class ControleEvento {

       Evento[] eventos = new Evento[10];



    public String incluirEvento(String nome, String data, String local, int lotacaoMax, Double precoIngresso){
          for(int i = 0; i < 10; i++){
             if(eventos[i] == null){
                eventos[i] = new Evento(nome, data, local, lotacaoMax, precoIngresso);
                return "ok";
            } 
        }
        return "null";
    }

    public String listagemDeEventos(){
        StringBuilder res = new StringBuilder();
        for(int i =0; i < eventos.length; i++){
            if (eventos[i] != null) { 
                res.append("\nNome do Evento: ").append(eventos[i].getNome()).append(", Local: ").append(eventos[i].getLocal()).append(", Data: ").append(eventos[i].getData()).append(" Lotação máxima: ").append(eventos[i].getLotacaoMax());
            }
        }
        if (eventos.length ==0) {
            res.append("Não há eventos adicionados!!");
        }
        return res.toString();
    }



}
