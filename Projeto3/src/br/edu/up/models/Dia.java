package br.edu.up.models;

import br.edu.up.views.DiaView;

public class Dia {
    private int num;
    private int cont;
    private Compromisso[] compromissos;
    private DiaView view = new DiaView();

    public Dia(int num) {
        this.num = num;
        this.compromissos = new Compromisso[24];
        this.cont = 0;
    }

    public void addCompromisso(int hora, String pessoa, String local, String assunto) {
        if (hora >= 1 && hora < 24) {
            if (compromissos[hora-1] == null) {
                compromissos[hora-1] = new Compromisso(pessoa, local, assunto);
                cont++;
            } else {
                view.notificarCompromissoJaAgendado(hora);
            }
        } else {
            System.out.println("Hora Inválida!!");
        }
    }

    public String consultarCompromisso(int hora) {
        if (hora >= 1 && hora < 24) {
            if (compromissos[hora - 1] != null) {
                return compromissos[hora-1] + "Horario: " + hora + ", ";

            } else {
                return "1";
            }
        } else {
            System.out.println("\nHora Inválida!");
            return null;
        }
    }

    public void removerCompromisso(int hora) {
        if (hora >= 0 && hora < 24) {
            if (compromissos[hora-1] != null) {
                compromissos[hora-1] = null;
                cont--;
                System.out.println("\nCompromisso removido!!");
            }else{
                System.out.println("\nNão tem compromisso para as "+ hora + " horas!");
                return;
            }
        } else {
            System.out.println("Compromisso não encontrado!!");
            return;
        }
    }

    public Compromisso[] listarCompromissos() {
        for (int i = 0; i < 24; i++) {
            if (compromissos[i] != null) {
                System.out.println("Hora: " + (i+1) + " " + compromissos[i]);
            }
        }
        return compromissos;
    }

}
