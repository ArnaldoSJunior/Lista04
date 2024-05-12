package br.edu.up.models;

public class Competencia {

    private String classificacao;
    private String resumo;



    
    public Competencia(String classificacao, String resumo) {
        this.classificacao = classificacao;
        this.resumo = resumo;
    }
    public String getClassificacao() {
        return classificacao;
    }
    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }
    public String getResumo() {
        return resumo;
    }
    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    
}
