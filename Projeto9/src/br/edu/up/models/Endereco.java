package br.edu.up.models;

public class Endereco {
    private String rua;
    private String bairro;
    private int numero;
    private String cep;
    private Cidade cidade;

    

    public Endereco(String rua, String bairro, int numero, String cep) {
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
        this.cep = cep;
    }
    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public Cidade getCidade() {
        return cidade;
    }
    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
    @Override
    public String toString() {
        return " [Rua: " + rua + ", Bairro: " + bairro + ", Numero: " + numero + ", CEP: " + cep + ", Cidade: "
                + cidade;
    }
    

    
}
