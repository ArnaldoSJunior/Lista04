package br.edu.up.controllers;

import javax.xml.crypto.Data;
import br.edu.up.models.*;

public class ControleEvento {

       Evento[] eventos = new Evento[10];
      
       
       

    public ControleEvento(Evento[] eventos, Reserva[] reservas) {
        this.eventos = eventos;

    }


    public Evento[] getEventos() {
        return eventos;
    }


    public void setEventos(Evento[] eventos) {
        this.eventos = eventos;
    }



    public void incluirEvento(String nome, Data data, String local, int lotacaoMax, int quantIngressosVendidos,
    Double precoIngresso){
        
          for(int i = 0; i < 10; i++){
             if(eventos[i] == null){
                eventos[i] = new Evento(nome, data, local, lotacaoMax, quantIngressosVendidos, precoIngresso);
        }
    }

    




    }



}
