
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
        if (pessoa == null) {
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
        return null;
    }

    public Cidade adicionarCidade(String nome, String uF){
        Cidade cidade = new Cidade(nome, uF);
        return cidade;
    }

    public String listarClientesPessoas(){
        if (listaPessoas.size() == 0) {
            return "Não há clientes cadastrados!!";
        }else{
            return listaPessoas.toString();
        }
    }

    public String adicionarClienteEmpresa(String nome, String telefone, String email, double vlrMaxCredito, double vlrEmprestado,
    String cnpj, String inscEstadual, int anoFundacao){
        ClienteEmpresa empresa = listaEmpresas.stream().filter(x -> x.getCnpj() == cnpj).findFirst().orElse(null);
        if (empresa == null) {
            ClienteEmpresa clienteEmpresa = new ClienteEmpresa(nome, telefone, email, vlrMaxCredito, vlrEmprestado, cnpj, inscEstadual, anoFundacao);
            listaEmpresas.add(clienteEmpresa);
            return "ok";
        }
        return "null";
    }

    public String listarClientesEmpresa(){
        if (listaEmpresas.size() == 0) {
            return "Não há clientes cadastrados!!";
        }else{
            return listaEmpresas.toString();
        }
    }

 
}
