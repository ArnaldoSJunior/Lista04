package br.edu.up.models;

public class CurriculoLatte {

    private String nomeInstituicao;
    private int anoDeConclusao;
    private String tituloObtido;
    private String trabalhoDeConclusao;


    public CurriculoLatte(String nomeInstituicao, int anoDeConclusao, String tituloObtido, String trabalhoDeConclusao) {
        this.nomeInstituicao = nomeInstituicao;
        this.anoDeConclusao = anoDeConclusao;
        this.tituloObtido = tituloObtido;
        this.trabalhoDeConclusao = trabalhoDeConclusao;
    }


    public String getNomeInstituicao() {
        return nomeInstituicao;
    }


    public int getAnoDeConclusao() {
        return anoDeConclusao;
    }


    public String getTituloObtido() {
        return tituloObtido;
    }


    public String getTrabalhoDeConclusao() {
        return trabalhoDeConclusao;
    }

    public String toString(){
        return "Currículo Latte [ Nome da Instituição ="+nomeInstituicao 
        +", Titulo Obtido ="+tituloObtido 
        +", Trabalho de Conclusã ="+trabalhoDeConclusao 
        +", Ano de conclusão =" + anoDeConclusao+ " ]";
    }
    

    
}
