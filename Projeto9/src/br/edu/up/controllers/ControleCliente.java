
// The type java.io.ObjectOutputStream cannot be resolved. It is indirectly referenced from required type java.util.ArrayListJava(16777563)
package br.edu.up.controllers;
import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.List;
import br.edu.up.models.*;
//import java.io.ObjectOutputStream;


public class ControleCliente {

    List<ClientePessoa> listaPessoas = new ArrayList<>();
    List<ClienteEmpresa> listaEmpresas = new ArrayList<>();

    public String adicionarClientePessoa(String nome, String telefone, String email, double vlrMaxCredito, double vlrEmprestado, String cpf, double peso, double altura, String rua, String bairro, int numero, String cep, String nomeCidade, String uF){
        //Procura pessoa possivel pessoa com o cpf inserido
        ClientePessoa pessoa = listaPessoas.stream().filter(x -> x.getCpf() == cpf).findFirst().orElse(null);
        if (pessoa != null) {
            ClientePessoa clientePessoa = new ClientePessoa(nome, telefone, email, vlrMaxCredito, vlrEmprestado, cpf, peso, altura);
            //Adicionar endereço no cliente
            Endereco end = adicionarEndereço(rua, bairro, numero, cep, nomeCidade, uF);
            if (end != null) {
                clientePessoa.setEndereco(end);
            }else{
                return "null";
            }
            listaPessoas.add(clientePessoa);
            return "ok";
        }
        return "null";
    }

    public Endereco adicionarEndereço(String rua, String bairro, int numero, String cep, String nomeCidade, String uF){
        //Adicionar cidade no endereço
        Cidade cid = adicionarCidade(nomeCidade, uF);
        if (cid != null) {
            Endereco endereco = new Endereco(rua, bairro, numero, cep);
            endereco.setCidade(cid);
            return endereco;
        }
        
    }

    public Cidade adicionarCidade(String nome, String uF){
        Cidade cidade = new Cidade(nome, uF);
        return cidade;
    }

 
}
