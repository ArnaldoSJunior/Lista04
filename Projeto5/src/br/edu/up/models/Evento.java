package br.edu.up.models;


public class Evento {

    private String nome;
    private String data;
    private String local;
    private int lotacaoMax;
    private int quantIngressosVendidos;
    private Double precoIngresso;

    public Evento(String nome, String data, String local, int lotacaoMax, Double precoIngresso) {
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.lotacaoMax = lotacaoMax;
        this.quantIngressosVendidos = quantIngressosVendidos;
        this.precoIngresso = precoIngresso;
    }

    
    
}
