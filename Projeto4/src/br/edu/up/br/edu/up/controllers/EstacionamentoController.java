package br.edu.up.controllers;

import br.edu.up.models.*;



public class EstacionamentoController {

    private int contEntrada = 0;
    

    Estacionamento est = new Estacionamento();

    public String registrarEntrada(String placa, String modelo, String cor) {
        int vagaDisponivel = est.encontrarVagaDisponivel();
        if (vagaDisponivel != -1) {
            est.getVagas(vagaDisponivel).ocuparVaga(placa, modelo, cor);
            contEntrada++;
                return  "OK";
                
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
    public Double finalizarPeriodo(){
        Double valorFinal = contEntrada*5.00;
        return valorFinal;
    }

    public int getContEntrada() {
        return contEntrada;
    }

   
    
}
 
