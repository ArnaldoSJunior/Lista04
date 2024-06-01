package br.edu.up.controller;

import java.util.ArrayList;
import java.util.List;

import br.edu.up.models.*;

public class ControllerSeguro {

    List<SeguroVida> listaSeguroVida = new ArrayList<>();
    List<SeguroVeiculo> listaSeguroVeiculo = new ArrayList<>();

    public Segurado incluirSegurado(String nome, String rg, String cpf, String sexo, String telefone, String endereco, String cep,
    String cidade){
        long countSeguradoMesmoCPF = listaSeguroVida.stream().filter(x -> x.getSegurado().getCpf().equals(cpf)).count();
        if (countSeguradoMesmoCPF == 0) {
            Segurado segurado = new Segurado(nome, rg, cpf, sexo, telefone, endereco, cep, cidade);
            return segurado;
        }
        return null;
    }

    public String incluirSeguroVida(String apolice, String nome, String rg, String cpf, String sexo, String telefone, String endereco, String cep,
    String cidade , double vlrApolice, String dtaInicio, String dtaFim, boolean cobreDoenca, boolean cobreAcidente){
        Long countSeguroMesmoApolice = listaSeguroVida.stream().filter(x -> x.getApolice().equals(apolice)).count();
        if (countSeguroMesmoApolice == 0) {
            Segurado seg = incluirSegurado(nome, rg, cpf, sexo, telefone, endereco, cep, cidade);
            if (seg != null) {
                SeguroVida seguroVida = new SeguroVida(apolice, seg, vlrApolice, dtaInicio, dtaFim, cobreDoenca, cobreAcidente);
                seguroVida.setSegurado(seg);
                listaSeguroVida.add(seguroVida);
                return "ok";
            }
        }
        return "null";  
    }


    public String incluirSeguroVeiculo(String apolice, String nome, String rg, String cpf, String sexo, String telefone, String endereco, String cep,
    String cidade , double vlrApolice, String dtaInicio, String dtaFim, double vlrFranquia, boolean temCarroReserva, boolean cobreVidros){
        Long countSeguroMesmoApolice = listaSeguroVida.stream().filter(x -> x.getApolice().equals(apolice)).count();
        if(countSeguroMesmoApolice == 0){
            Segurado veiculo = incluirSegurado(nome, rg, cpf, sexo, telefone, endereco, cep, cidade);
            if(veiculo != null){
                SeguroVeiculo seguroVeiculo = new SeguroVeiculo(apolice, veiculo, vlrApolice, dtaInicio, dtaFim, vlrFranquia, temCarroReserva, cobreVidros);
                seguroVeiculo.setSegurado(veiculo);
                listaSeguroVeiculo.add(seguroVeiculo);
                return "ok"; // Alteração aqui
            }
        }
        return "null";
    }

    public  Seguro localizarSeguro(String apolice) {
        for (Seguro seguro : listaSeguroVida) {
            if (seguro.getApolice().equals(apolice)) {
                return seguro;
            }
        }
        for (Seguro seguro : listaSeguroVeiculo) {
            if (seguro.getApolice().equals(apolice)) {
                return seguro; 
            }
        }
        return null; 
    }


    public String excluirSeguro(String apolice){
        SeguroVida seguroVida = listaSeguroVida.stream().filter(x ->x.getApolice().equals(apolice)).findFirst().orElse(null);
        SeguroVeiculo seguroVeiculo = listaSeguroVeiculo.stream().filter(x ->x.getApolice().equals(apolice)).findFirst().orElse(null);
        if (seguroVida != null) {
            listaSeguroVida.remove(seguroVida);
            return "ok";
        }
        if(seguroVeiculo != null){
            listaSeguroVeiculo.remove(seguroVeiculo);
            return "ok";
        }
        return "null";

    }

    public void excluirTodosSeguros(){
        System.out.println("Excluindo todos os seguros...");
        listaSeguroVida.clear();
        listaSeguroVeiculo.clear();
        System.out.println("Todos os seguros foram excluídos.");
    }
    


    public String listarSeguros(){
        if(listaSeguroVida.size() != 0 && listaSeguroVeiculo.size() != 0){
            return "Seguro de vida: \n"+listaSeguroVida.toString()+"\nSeguro de Veículos: \n"+ listaSeguroVeiculo.toString();
        }else if(listaSeguroVida.size() != 0){
            return "Seguro de vida: \n"+listaSeguroVida.toString()+"\nSeguro de Veículos: \nNão há seguro de veículos registrados";
        }else if(listaSeguroVeiculo.size() != 0){
            return "Seguro de vida: \nNão há seguro de vida registradas"+"\nSegura de Veículos: \n"+ listaSeguroVeiculo.toString();
        }else{
            return "Não há clientes cadastrados!!";
        }
    }

    public int obterQuantidadeSeguros() {
        return listaSeguroVida.size() + listaSeguroVeiculo.size();
    }
    
    






    // public String listarClientesPessoas(){
    //     if (listaPessoas.size() == 0) {
    //         return "Não há clientes cadastrados!!";
    //     }else{
    //         return listaPessoas.toString();
    //     }
    // }

}
