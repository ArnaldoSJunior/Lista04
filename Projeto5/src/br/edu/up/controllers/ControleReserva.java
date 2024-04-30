package br.edu.up.controllers;

import br.edu.up.models.*;


public class ControleReserva {
    Reserva[] reservas = new Reserva[10];

    public void incluirReserva(String nome, int quantidadePessoas, String dataReserva){
        for(int i = 0; i < reservas.length; i++){
            if (reservas[i] == null){
                reservas[i] = new Reserva(null, nome, quantidadePessoas, dataReserva);
                break;
            }
        }
    }
 


    public ControleReserva(Reserva[] reservas) {
        this.reservas = reservas;
    }

    public Reserva[] getReservas() {
        return reservas;
    }

    public void setReservas(Reserva[] reservas) {
        this.reservas = reservas;
    }


    
}
