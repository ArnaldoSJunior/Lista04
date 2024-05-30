package br.edu.up.controller;

import java.util.ArrayList;
import java.util.List;

import br.edu.up.models.*;

public class ControllerSeguro {

    List<SeguroVida> listaSeguraVida = new ArrayList<>();
    List<SeguroVeiculo> listaSeguroVeiculo = new ArrayList<>();

    public Segurado incluirSegurado(String nome, String rg, String cpf, String sexo, String telefone, String endereco, String cep,
    String cidade){
        long countSeguradoMesmoCPF = listaSeguraVida.stream().filter(x -> x.getSegurado().getCpf().equals(cpf)).count();
        if (countSeguradoMesmoCPF == 0) {
            Segurado segurado = new Segurado(nome, rg, cpf, sexo, telefone, endereco, cep, cidade);
            return segurado;
        }
        return null;
    }

    public String incluirSeguroVida(String apolice, String nome, String rg, String cpf, String sexo, String telefone, String endereco, String cep,
    String cidade , double vlrApolice, String dtaInicio, String dtaFim, boolean cobreDoenca, boolean cobreAcidente){
        Long countSeguroMesmoApolice = listaSeguraVida.stream().filter(x -> x.getApolice().equals(apolice)).count();
        if (countSeguroMesmoApolice == 0) {
            Segurado seg = incluirSegurado(nome, rg, cpf, sexo, telefone, endereco, cep, cidade);
            if (seg != null) {
                SeguroVida seguroVida = new SeguroVida(apolice, seg, vlrApolice, dtaInicio, dtaFim, cobreDoenca, cobreAcidente);
                seguroVida.setSegurado(seg);
                listaSeguraVida.add(seguroVida);
                return "ok";
            }
        }
        return "null";  
    }

    public String listarSeguros(){
        if(listaSeguraVida.size() != 0 && listaSeguroVeiculo.size() != 0){
            return "Seguro de vida: \n"+listaSeguraVida.toString()+"\nSegura de Veículos: \n"+ listaSeguroVeiculo.toString();
        }else if(listaSeguraVida.size() != 0){
            return "Seguro de vida: \n"+listaSeguraVida.toString()+"\nSegura de Veículos: \nNão há seguro de veículos registrados";
        }else if(listaSeguroVeiculo.size() != 0){
            return "Seguro de vida: \nNão há seguro de vida registradas"+"\nSegura de Veículos: \n"+ listaSeguroVeiculo.toString();
        }else{
            return "Não há clientes cadastrados!!";
        }
    }

    // public String listarClientesPessoas(){
    //     if (listaPessoas.size() == 0) {
    //         return "Não há clientes cadastrados!!";
    //     }else{
    //         return listaPessoas.toString();
    //     }
    // }

}
