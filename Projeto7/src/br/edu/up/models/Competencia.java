package br.edu.up.models;

public class Competencia {

    private String classificacao;
    private String descricao;



    
    public Competencia(String classificacao, String resumo) {
        this.classificacao = classificacao;
        this.descricao = resumo;
    }
    public String getClassificacao() {
        return classificacao;
    }
    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }
    public String getResumo() {
        return descricao;
    }
    public void setResumo(String resumo) {
        this.descricao = resumo;
    }

    
}
