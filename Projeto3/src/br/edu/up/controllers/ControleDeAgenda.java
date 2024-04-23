package br.edu.up.controllers;

import br.edu.up.models.*;
import br.edu.up.views.*;

public class ControleDeAgenda {
    private Ano model;

    
    public ControleDeAgenda(Ano model){
        this.model = model;

    }

    public String addCompromisso(int mes, int dia, int hora, String pessoa, String local, String assunto){
        model.addCompromisso(mes, dia, hora, pessoa, local, assunto);
        return "Compromisso Realizado!!";
    }

    public String consultarCompromisso(int mes, int dia, int hora){
        String str = model.consultarCompromisso(mes, dia, hora);
        if (str != null) {
             return str;
        }else{
            return "Compromisso não encontrado!!";
        }
       
    }
    public String removerCompromisso(int mes, int dia, int hora){
        model.removerCompromisso(mes, dia, hora);
        if(model.removerCompromisso(mes, dia, hora) != null){
            return "Compromisso excluído com sucesso";
        }else{
            return "Compromisso não encontrado!!";
        }

    }
    
    

}
    


