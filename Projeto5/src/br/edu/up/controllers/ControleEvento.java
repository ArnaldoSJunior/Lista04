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
        int num = 0;
        StringBuilder res = new StringBuilder();
        for(int i =0; i < eventos.length; i++){
            if (eventos[i] != null) { 
                res.append("\nNome do Evento: ").append(eventos[i].getNome()).append(", Local: ").append(eventos[i].getLocal()).append(", Data: ").append(eventos[i].getData()).append(" Lotação máxima: ").append(eventos[i].getLotacaoMax());
                num++;
            }
        }
        if (num == 0) {
            res.append("Não há eventos adicionados!!");
        }
        return res.toString();
    }

    public String excluirEvento(String nome, String data, String local){
        for(int i=0; i < eventos.length; i++){
            if (eventos[i].getNome().equals(nome) && eventos[i].getData().equals(data) && eventos[i].getLocal().equals(local)) {
                eventos[i] = null;
                return "ok";
            }
        }
        return "null";
    }
    public String alterarNomeEvento(String nomeAntigo, String nomeNovo){
        for (int i = 0; i < eventos.length; i++) {
            if (eventos[i] != null && eventos[i].getNome().equals(nomeAntigo)) {
                eventos[i].setNome(nomeNovo);
                return "OK";
            }
        }
        return "null";
    }
    public String alterarDataEvento(String dataAntiga, String dataNova){
        for (int i = 0; i < eventos.length; i++) {
            if (eventos[i] != null && eventos[i].getData().equals(dataAntiga)) {
                eventos[i].setData(dataNova);;
                return "OK";
            }
        }
        return "null";

    }
    public String alterarLocalEvento(String localAntigo, String localNovo){
        for (int i = 0; i < eventos.length; i++) {
            if (eventos[i] != null && eventos[i].getLocal().equals(localAntigo)) {
                eventos[i].setLocal(localNovo);
                return "OK";
            }
        }
        return "null";
    }
    public String alterarLotacaoEvento(int lotacaoAntiga, int lotacaoNova){
        for (int i = 0; i < eventos.length; i++) {
            if (eventos[i] != null && eventos[i].getLotacaoMax() == lotacaoAntiga) {
                eventos[i].setLotacaoMax(lotacaoNova);
                return "OK";
            }
        }
        return "null";
    }
    public String alterarPrecoEvento(double precoAntigo, double precoNovo){
        for (int i = 0; i < eventos.length; i++) {
            if (eventos[i] != null && eventos[i].getPrecoIngresso() ==precoAntigo) {
                eventos[i].setPrecoIngresso(precoNovo);
                return "OK";
            }
        }
        return "null";

    }

    public Evento[] getEventos() {
        return eventos;
    }

    public String conferirNomeEvento(String nome){
        for(int i=0; i< eventos.length; i++){
            if (eventos[i] != null &&  eventos[i].getNome().equals(nome)) {
                return "ok";
            }
        }
        return "null";
    }
    public String conferirDataEvento(String data){
        for(int i=0; i< eventos.length; i++){
            if ( eventos[i] != null &&eventos[i].getData().equals(data)) {
                return "ok";
            }
        }
        return "null";
    }

    public String ingressosDisponiveis(String nome, int qtd){
        for(int i=0; i < eventos.length; i++){
            if ( eventos[i] != null && eventos[i].getNome().equals(nome)) {
                if (qtd > eventos[i].getIngressosDisponiveis()) {
                    eventos[i].setIngressosDisponiveis(eventos[i].getIngressosDisponiveis() - qtd);
                    return "ok";
                }
            }
        }
        return "null";
    }

}
