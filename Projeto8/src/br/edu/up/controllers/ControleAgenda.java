package br.edu.up.controllers;

import br.edu.up.models.Agenda;
import br.edu.up.models.Pessoal;

public class ControleAgenda {
    Agenda agenda = new Agenda();

    public void incluirContatoPessoal(int codigo, String nome, String telefone, String cnpj){
        Pessoal pessoal = new Pessoal(codigo, nome, telefone, cnpj);
        agenda.getContatos().add(pessoal);
        
        System.out.println("Contatos: "+ agenda.toString());
    }

}
