package br.edu.up.models;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private List<Contato> contatos = new ArrayList<Contato>();

    public List<Contato> getContatos(int codigo) {
        return contatos;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    @Override
    public String toString() {
        for(Contato c: contatos){
            System.out.println(c);
        }
        return "";
    }

    
    

}
