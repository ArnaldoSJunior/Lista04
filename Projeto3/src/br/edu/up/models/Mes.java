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
        this.dias = new Dia[dias];
        this.nome = nome;
        this.cont = 0;
    }

    public void addCompromisso(int dia, int hora, String pessoa, String local, String assunto) {
        if (dia > 0 && dia <= numDias) {
            if (hora >= 1 && hora < 24) {
                if (dias[dia - 1] == null || dias[dia - 1].consultarCompromisso(hora).equals("1")) {
                    // Se não houver um dia neste índice ou se não houver compromisso nesta hora,
                    // então criamos um novo dia e agendamos o compromisso.
                    if (dias[dia - 1] == null) {
                        dias[dia - 1] = new Dia(dia);
                    }
                    dias[dia - 1].addCompromisso(hora, pessoa, local, assunto);
                } else {
                }
            } 
        } 
    }
    
    public String consultarCompromisso(int dia, int hora) {
        if (dia > 0 && dia <= this.numDias) {
            if (hora >= 0 && hora < 24) {
                if (dias[dia - 1] != null || dias[dia-1].consultarCompromisso(hora) != "1") {
                        return dias[dia - 1].consultarCompromisso(hora)  + "Dia: " + dia;
                } else {
                    return "1";
                }
            } 
        } 
        return "";
    }

    public int getNumDias() {
        return numDias;
    }

    public String removerCompromisso(int dia, int hora) {
        if (dia > 0 && dia <= numDias) {
            if (hora >= 0 && hora < 24) {
                if (dias[dia - 1] != null) {
                    if (dias[dia - 1].consultarCompromisso(hora) != "1") {
                        dias[dia - 1].removerCompromisso(hora);

                    } else {
                       return null;
                    }
                } else {
                    return null;
                }
            } else {
               return null;
            }
        } else {
           return null;
        }
        return "";
    }
    public boolean temCompromissos() {
        for (Dia dia : dias) {
            if (dia != null) {
                return true; // Se houver pelo menos um dia não nulo, há compromissos
            }
        }
        return false; // Se todos os dias forem nulos, não há compromissos
    }
    public String listarTodosCompromissos() {
        StringBuilder compromissosListados = new StringBuilder();
        for (int i = 0; i < dias.length; i++) {
            if (dias[i] != null) {
                compromissosListados.append("Compromissos do dia ").append(i + 1).append(":\n");
                compromissosListados.append(dias[i].listarCompromissos()).append("\n");
            }
        }
        return compromissosListados.toString();
    }
        public String getNomeMes() {
            return this.nome;
        }
    
        // Outros métodos aqui...
    }
    

