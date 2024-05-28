
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

    public String adicionarClientePessoa(String nome, String telefone, String email, double vlrMaxCredito, String cpf, double peso, double altura, String rua, String bairro, int numero, String cep, String nomeCidade, String uF){
        long countClientesMesmoCPF = listaPessoas.stream().filter(x -> x.getCpf().equals(cpf)).count();
        if (countClientesMesmoCPF == 0) {
            Endereco end = adicionarEndereço(cpf, rua, bairro, numero, cep, nomeCidade, uF);
            ClientePessoa clientePessoa = new ClientePessoa(nome, telefone, email, vlrMaxCredito, cpf, peso, altura);
            //Adicionar endereço no cliente
            if (end != null) {
                clientePessoa.setEndereco(end);
                listaPessoas.add(clientePessoa);
                return "ok";
            }else{
                return "null";
            }
        }
        return "null";
    }

    public Endereco adicionarEndereço(String cpf,String rua, String bairro, int numero, String cep, String nomeCidade, String uF){
        long countClientesMesmoCPF = listaPessoas.stream().filter(x -> x.getCpf().equals(cpf)).count();
        if (countClientesMesmoCPF == 0) {
            //Adicionar cidade no endereço
            Cidade cid = adicionarCidade(cpf, nomeCidade, uF);
            if (cid != null) {
                Endereco endereco = new Endereco(rua, bairro, numero, cep);
                endereco.setCidade(cid);
                return endereco;
            }
        }

        return null;
    }

    public Cidade adicionarCidade(String cpf,String nome, String uF){
        long countClientesMesmoCPF = listaPessoas.stream().filter(x -> x.getCpf().equals(cpf)).count();
        if (countClientesMesmoCPF == 0) {
            Cidade cidade = new Cidade(nome, uF);
            return cidade;
        }
        return null;
        
    }

    public String listarClientesPessoas(){
        if (listaPessoas.size() == 0) {
            return "Não há clientes cadastrados!!";
        }else{
            return listaPessoas.toString();
        }
    }

    public String adicionarClienteEmpresa(String nome, String telefone, String email, double vlrMaxCredito,
    String cnpj, String inscEstadual, int anoFundacao){
        ClienteEmpresa empresa = listaEmpresas.stream().filter(x -> x.getCnpj() == cnpj).findFirst().orElse(null);
        if (empresa == null) {
            ClienteEmpresa clienteEmpresa = new ClienteEmpresa(nome, telefone, email, vlrMaxCredito, cnpj, inscEstadual, anoFundacao);
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

    public String emprestarClientePessoa(double vlrEmpr, String cpf) {
        ClientePessoa pessoa = listaPessoas.stream()
                                          .filter(x -> x.getCpf().equals(cpf))
                                          .findFirst()
                                          .orElse(null);
    
        if (pessoa != null) {
            if (pessoa.getVlrMaxCredito() >= pessoa.getVlrEmprestado() + vlrEmpr) {
                pessoa.setVlrEmprestado(pessoa.getVlrEmprestado() + vlrEmpr);
                return "ok";
            } else {
                return "Limite de crédito insuficiente";
            }
        } else {
            return "Cliente não encontrado";
        }
    }
    
    public String emprestarClienteEmpresa(double vlrEmpr, String cnpj) {
        ClienteEmpresa empresa = listaEmpresas.stream()
                                              .filter(x -> x.getCnpj().equals(cnpj))
                                              .findFirst()
                                              .orElse(null);
    
        if (empresa != null) {
            if (empresa.getVlrEmprestado() + vlrEmpr <= empresa.getVlrMaxCredito()) {
                empresa.setVlrEmprestado(empresa.getVlrEmprestado() + vlrEmpr);
                return "ok";
            } else {
                return "Limite de crédito insuficiente";
            }
        } else {
            return "Empresa não encontrada";
        }
    }
    public String devolucaoClientePessoa(String cpf, double vlr){
        ClientePessoa pessoa = listaPessoas.stream()
                                          .filter(x -> x.getCpf().equals(cpf))
                                          .findFirst()
                                          .orElse(null);
        if (pessoa != null) {
            if (pessoa.getVlrEmprestado() - vlr >= 0) {
                pessoa.setVlrEmprestado(pessoa.getVlrEmprestado() - vlr);
                return "ok";
            }
        }
        return "null";
    }
    public String devolucaoClienteEmpresa(String cnpj, double vlr){
        ClienteEmpresa empresa = listaEmpresas.stream()
                                              .filter(x -> x.getCnpj().equals(cnpj))
                                              .findFirst()
                                              .orElse(null);
        if (empresa != null) {
            if (empresa.getVlrEmprestado() - vlr >= 0) {
                empresa.setVlrEmprestado(empresa.getVlrEmprestado() - vlr);
                return "ok";
            }
        }
        return "null";
    }

 
}
