package br.edu.up.models;

import br.edu.up.views.MesView;

public class Mes {

    private String nome;
    private int numDias;
    private Dia[] dias;
    private Compromisso[] compromissos;
    private int cont;
    private MesView view = new MesView();

    

    public Mes(int dias, String nome) {
        this.numDias = dias;
        this.compromissos = new Compromisso[24];
        this.dias = new Dia[dias];
        this.nome = nome;
        this.cont = 0;
    }
    public void addCompromisso(int dia, int hora, String pessoa, String local, String assunto){
        if (dia > 0 && dia <= numDias) {
            if (dias[dia-1] == null) {
                dias[dia-1] = new Dia(dia);
                dias[dia -1].addCompromisso(hora, pessoa, local, assunto);
            }else{
                view.notificarCompromissoJaAgendado(dia, hora);
            }
        }else{
            System.out.println("Dia inválida!!");
        }
    }

    public String consultarCompromisso(int dia, int hora){
        if (dia > 0 && dia<= numDias) {
            if (hora >=0 && hora<24) {
                if (dias[dia-1] != null) {              
                        System.out.print("Dia: " + dia + dias[dia-1].consultarCompromisso(hora));
                }else{  
                    System.exit(dia);
                }   
            }else{
                System.out.println("Hora Inválida!!");
            }
        }else{
            System.out.println("Dia Inválido!!");
        }
        return "";
    }
    public int getNumDias() {
        return numDias;
    }
    
    public void removerCompromisso(int hora, int dia){
        if (dia > 0 && dia<= numDias) {
        if(hora >= 0 && hora < 24 && compromissos[hora]!= null){
            compromissos[hora] = null;
            cont--;
            System.out.println("Compromisso removido!!");
        }
        }
    }
    public Compromisso[] listarCompromissos(){
        System.out.println();
        System.out.println("--- Lista dos Compromissos --- ");
        for(int i =0; i < 24; i++){
            if (compromissos[i] != null) {
                System.out.println("Dia: "+ i+" "+ compromissos[i]);
            }
        }
        return compromissos; 
    }
}