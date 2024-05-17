package br.edu.up.controllers;

import java.util.List;


import br.edu.up.models.*;

public class ControleAgenda {
    Agenda agenda = new Agenda();

    public String incluirContatoPessoal(int codigo, String nome, String telefone, String aniversario){
        Contato codigoBuscado = agenda.getContatos().stream().filter(x -> x.getCodigo() == codigo).findFirst().orElse(null);
        if (codigoBuscado == null) {
            Pessoal pessoal = new Pessoal(codigo, nome, telefone, aniversario);
            agenda.getContatos().add(pessoal);
            return "ok";
        }
        return "null";
        
    }
    public String incluirContatoComercial(int codigo, String nome, String telefone, String cnpj){
        Contato codigoBuscado = agenda.getContatos().stream().filter(x -> x.getCodigo() == codigo).findFirst().orElse(null);
        if (codigoBuscado == null) {
            Comercial comercial = new Comercial(codigo, nome, telefone, cnpj);
            agenda.getContatos().add(comercial);
            return "ok";
        }
        return "null";
        
    }
    public String listarContatos(){
        if (agenda.getContatos().size() == 0) {
            return "Não há contatos registrados!!";
        }else{
            return agenda.getContatos().toString();
        }
    }
    public String removerContato(int codigo){
        Contato codigoBuscado = agenda.getContatos().stream().filter(x -> x.getCodigo() == codigo).findFirst().orElse(null);
        if (codigoBuscado != null) {
            agenda.getContatos().remove(codigoBuscado);
            return "ok";
        }
        return "null";
    }
}
