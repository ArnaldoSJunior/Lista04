package br.edu.up.models;

import javax.xml.crypto.Data;

public class Evento {

    private String nome;
    private Data data;
    private String local;
    private int lotacaoMax;
    private int quantIngressosVendidos;
    private Double precoIngresso;

    public Evento(String nome, Data data, String local, int lotacaoMax, int quantIngressosVendidos,
            Double precoIngresso) {
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.lotacaoMax = lotacaoMax;
        this.quantIngressosVendidos = quantIngressosVendidos;
        this.precoIngresso = precoIngresso;
    }

    
    
}
