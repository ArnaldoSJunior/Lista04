package br.edu.up.controllers;

import br.edu.up.models.*;
import javax.xml.crypto.Data;

public class ControleReserva {
    ControleEvento controleEvento = new ControleEvento();
    Reserva[] reservas = new Reserva[controleEvento.eventos.length];


    public String incluirReserva( String nome, int quantidadePessoas, String data) {
        for (int i = 0; i < reservas.length; i++) {
            if (reservas[i] == null) {
                reservas[i] = new Reserva(nome, quantidadePessoas, data);
                return "ok";
            }
        }
        return "null";
    }
}
            
        



    

