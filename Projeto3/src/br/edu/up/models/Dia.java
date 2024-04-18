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
        this.cont =0;
    }
    public void addCompromisso(int hora, String pessoa, String local, String assunto){
            if(hora >= 0 && hora < 24){
                if (compromissos[hora] == null) {
                    compromissos[hora] = new Compromisso(pessoa, local, assunto);
                    cont++;
                }else{
                    view.notificarCompromissoJaAgendado(hora);
                }
            }else{
                System.out.println("Hora Inválida!!");
            }
    }

    public String consultarCompromisso(int hora){
        if (hora >= 0 && hora < 24) {
            if (compromissos[hora] != null) {
                System.out.print(compromissos[hora]+"Horario: "+hora+", ");

            }else{
                System.exit(hora);
            }
        } else {
            System.out.println("Hora Inválida!!");
            return null;
        }
        return "";
    }

    public void removerCompromisso(int hora){
        if(hora >= 0 && hora < 24 && compromissos[hora]!= null){
            compromissos[hora] = null;
            cont--;
            System.out.println("Compromisso removido!!");
        }
    }

    public Compromisso[] listarCompromissos(){
        System.out.println("--- Lista dos Compromissos --- ");
        for(int i =0; i < 24; i++){
            if (compromissos[i] != null) {
                System.out.println("Hora: "+ i+" "+ compromissos[i]);
            }
        }
        return compromissos; 
    }
    
    
}
