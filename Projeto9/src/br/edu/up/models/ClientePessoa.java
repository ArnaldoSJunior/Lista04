package br.edu.up.models;

public class ClientePessoa extends Cliente{

    private String cpf;
    private double peso;
    private double altura;

    public ClientePessoa(String nome, String telefone, String email, double vlrMaxCredito, String cpf, double peso, double altura) {
        super(nome, telefone, email, vlrMaxCredito);
        this.cpf = cpf;
        this.peso = peso;
        this.altura = altura;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    @Override
    public String toString() {
        return "\nClientePessoa = Nome: "+ super.getNome()
                +", Telefone: "+ super.getTelefone()
                +", Email: "+ super.getEmail()
                +", CPF: "+ getCpf()
                +", Peso: "+ getPeso()
                +", Altura: "+ getAltura()
                +", Valor máximo de crédtio: "+ super.getVlrMaxCredito()
                +", Valor emprestado: "+ super.getVlrEmprestado()
                +"\nEndereço: "+ super.getEndereco();
                
    }

    

}
