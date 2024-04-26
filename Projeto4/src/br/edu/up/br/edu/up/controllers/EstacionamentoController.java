package br.edu.up.controllers;

import java.util.regex.Pattern;

import br.edu.up.models.*;

public class EstacionamentoController {
    Estacionamento est = new Estacionamento();

    public String registrarEntrada(String placa, String modelo, String cor) {
        int vagaDisponivel = est.encontrarVagaDisponivel();
        if (vagaDisponivel != -1) {
            if (validarPlaca(placa) == true) {
                est.getVagas(vagaDisponivel).ocuparVaga(placa, modelo, cor);
                return  "OK";
            }else{
                return "null";
            }
        } else {
            return "null";
        }
    }

    public String registarSaida(String placa){
        for(int i = 0; i < 10; i++){
            if (est.verificarPlaca(placa) != null && est.verificarPlaca(placa).equals("1")) {
                if (est.getVagas(i).getCarroPlaca() != null && est.getVagas(i).getCarroPlaca().equals(placa)) {
                    est.getVagas(i).liberarVaga();
                    return "OK"; // Retorna "OK" se a placa for encontrada e a vaga for liberada
                }
            }
        }
        return "OFF"; // Retorna "OFF" se a placa não for encontrada ou se a vaga não estiver ocupada por esse veículo
    }
    


    public int contarVagasDisponiveis() {
        int contador = 0;
        for (Vaga vaga : est.getVagas()) {
            if (!vaga.ocupada()) { 
                contador++; 
            }
        }
        return contador;
    }
    public int consultarVaga(String placa){
        for(int i=0; i<10; i++){
            if (est.getVagas(i).getCarroPlaca().equals(placa)) {
                return est.getVagas(i).getNumero();
            }
            
        }
        return 0;
    }
    public boolean validarPlaca(String placa){
        String[] partes = placa.split("-");
        if(partes.length != 2 || partes[0].length() != 3) {
            return false;
        }
        // Verifica se a segunda parte consiste apenas em dígitos ou letras
        if (!partes[1].matches("[0-9a-zA-Z]+")) {
            return false;
        }
        return true;
    }
}
 
