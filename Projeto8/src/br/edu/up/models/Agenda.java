package br.edu.up.models;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private List<Contato> contatos = new ArrayList<Contato>();

    public List<Contato> getContatos(int codigo) {
        return contatos;
    }

}
