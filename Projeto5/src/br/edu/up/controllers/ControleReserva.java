package br.edu.up.controllers;

import br.edu.up.models.*;


public class ControleReserva {
    Reserva[] reservas = new Reserva[10];

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
            
        



    

