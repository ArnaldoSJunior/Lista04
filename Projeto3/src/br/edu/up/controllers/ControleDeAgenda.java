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
        if (model.addCompromisso(mes, dia, hora, pessoa, local, assunto) != "ok") {
            return "Compromisso Realizado!!";
        }else{
            return "Compromisso já realizado!!";
        }
        
        
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
    public String listarTodosCompromissos() {
        StringBuilder resultado = new StringBuilder(); 
        // Itera sobre todos os meses do ano
        for (int i = 0; i < model.getMeses().length; i++) {
            Mes mes = model.getMeses()[i];           
            // Verifica se o mês está inicializado e se tem compromissos agendados
            if (mes != null && mes.temCompromissos()) {
                resultado.append("Compromissos agendados para ").append(mes.getNomeMes()).append(":\n");
                resultado.append(mes.listarTodosCompromissos()).append("\n\n");
            }
        }       
        // Verifica se foram encontrados compromissos
        if (resultado.length() == 0) {
            resultado.append("Não há compromissos agendados.\n");
        }       
        return resultado.toString();
    }

    
    public String listarCompromissosDoMes(int mes) {
        StringBuilder resultado = new StringBuilder();
        
        // Verifica se o mês especificado está dentro do intervalo válido
        if (mes < 1 || mes > 12) {
            resultado.append("Mês inválido.\n");
            return resultado.toString();
        }
        
        // Obtém o mês correspondente ao índice
        Mes mesSelecionado = model.getMeses()[mes - 1];
        
        // Verifica se o mês está inicializado e se tem compromissos agendados
        if (mesSelecionado != null && mesSelecionado.temCompromissos()) {
            resultado.append("Compromissos agendados para ").append(mesSelecionado.getNomeMes()).append(":\n");
            resultado.append(mesSelecionado.listarTodosCompromissos()).append("\n\n");
        } else {
            resultado.append("Não há compromissos agendados para o mês ").append(mes).append(".\n");
        }
        
        return resultado.toString();
    }
    
    
    
    
    

}
    


