package br.edu.up.models;

import br.edu.up.views.MesView;

public class Mes {

    private String nome;
    private int numDias;
    private Dia[] dias;
    private MesView view = new MesView();

    public Mes(int dias, String nome) {
        this.numDias = dias;
        this.dias = new Dia[dias];
        this.nome = nome;

    }
    public void addCompromisso(int dia, int hora, String pessoa, String local, String assunto){
        if (dia > 0 && dia <= numDias) {
            if (dias[dia-1] == null) {
                dias[dia-1] = new Dia(dia);
                dias[dia -1].addCompromisso(hora, pessoa, local, assunto);
                view.notificarCompromissoRealizado(dia, hora, pessoa, local, assunto);
            }else{
                view.notificarCompromissoJaAgendado(dia, hora);
            }
        }else{
            System.out.println("Dia inválida!!");
        }
    }
    public void consultarCompromisso(int dia, int hora){
        if (dia > 0 && dia<= numDias) {
            if (hora >=0 && hora<24) {
                System.out.println("Dia: "+ dia+ ""+ dias[dia-1].consultarCompromisso(hora));
            }else{
                System.out.println("Hora Inválida!!");
            }
        }else{
            System.out.println("Dia Inválido!!");
        }
    }
}