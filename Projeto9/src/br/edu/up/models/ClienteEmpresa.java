package br.edu.up.models;

public class ClienteEmpresa extends Cliente {
    
    private String cnpj;
    private String inscEstadual;
    private int anoFundacao;

    
    public ClienteEmpresa(String nome, String telefone, String email, double vlrMaxCredito,
            String cnpj, String inscEstadual, int anoFundacao) {
        super(nome, telefone, email, vlrMaxCredito);
        this.cnpj = cnpj;
        this.inscEstadual = inscEstadual;
        this.anoFundacao = anoFundacao;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getInscEstadual() {
        return inscEstadual;
    }
    public void setInscEstadual(String inscEstadual) {
        this.inscEstadual = inscEstadual;
    }
    public int getAnoFundacao() {
        return anoFundacao;
    }
    public void setAnoFundacao(int anoFundacao) {
        this.anoFundacao = anoFundacao;
    }
    @Override
    public String toString() {
        return "\nClienteEmpresa [ Nome: "+ super.getNome()
                +", Telefone: "+ super.getTelefone()
                +", Email: "+ super.getEmail()
                +", CNPJ: "+ getCnpj()
                +", Inscrição estadual: "+ getInscEstadual()
                +", Ano da fundação da empresa: "+ getAnoFundacao()
                +", Valor máximo de crédito: "+ getVlrMaxCredito()
                +", Valor emprestado: "+ getVlrEmprestado()+" ]";
    }

    

}
