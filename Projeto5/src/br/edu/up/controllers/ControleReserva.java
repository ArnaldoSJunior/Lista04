package br.edu.up.controllers;

import br.edu.up.models.*;
import javax.xml.crypto.Data;

public class ControleReserva {
    Reserva[] reservas = new Reserva[10];

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
