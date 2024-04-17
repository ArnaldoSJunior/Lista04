package br.edu.up.views;

public class MesView {
    public void notificarCompromissoRealizado(int dia, int hora, String pessoa, String local, String assunto){
        System.out.println("Compromisso agendado para o dia: "+dia+ " as " + hora + " horas " +
        "[Pessoa: " + pessoa + ", Local: " + local + ", Assunto: " + assunto+"]");
    }

    public void notificarCompromissoJaAgendado(int dia, int hora){
        System.out.println("Já existe um compromisso agendado para às " + hora + "h. do dia: "+ dia);
    }
}
