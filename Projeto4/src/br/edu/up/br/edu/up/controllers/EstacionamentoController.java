package br.edu.up.controllers;

import br.edu.up.models.*;

public class EstacionamentoController {
    Estacionamento est = new Estacionamento();

    public String registrarEntrada(String placa, String modelo, String cor) {
        int vagaDisponivel = encontrarVagaDisponivel();
        if (vagaDisponivel != -1) {
            est.getVagas(vagaDisponivel).ocuparVaga(placa, modelo, cor);
            return "Entrada registrada com sucesso na vaga " + vagaDisponivel;
        } else {
            return "Não há vagas disponíveis no momento.";
        }
    }
    
    private int encontrarVagaDisponivel() {
        for (int i = 0; i < est.getTotalVagas(); i++) {
            if (!est.getVagas(i).ocupada()) {
                return i;
            }
        }
        return -1; // Retorna -1 se não houver vagas disponíveis
    }
}
 
