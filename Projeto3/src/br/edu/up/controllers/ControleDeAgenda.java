package br.edu.up.controllers;

import br.edu.up.models.*;
import br.edu.up.views.*;

public class ControleDeAgenda {
    private Ano model;
    private AnoView view;

    
    public ControleDeAgenda(Ano model, AnoView view){
        this.model = model;
        this.view = view;
    }

    public String addCompromisso(int mes, int dia, int hora, String pessoa, String local, String assunto){
        model.addCompromisso(mes, dia, hora, pessoa, local, assunto);
        return "Compromisso Realizado!!";
    }

    public void consultarCompromisso(int mes, int dia, int hora){
        String str = model.consultarCompromisso(mes, dia, hora);
        if (str != null) {
             view.mensagem(str);
        }else{
            view.mensagem("Compromisso não encontrado!!");
        }
       
    }
    
    

}
