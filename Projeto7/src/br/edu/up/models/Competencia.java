package br.edu.up.models;

public class Competencia {

    private String tipo;
    private String descricao;

    public Competencia(String descricao, String resumo) {
        this.descricao = descricao;
        this.descricao = resumo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String descricao) {
        this.tipo = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String resumo) {
        this.descricao = resumo;
    }

}
