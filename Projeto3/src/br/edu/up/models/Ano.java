package br.edu.up.models;

import br.edu.up.views.AnoView;

public class Ano {

    private int num;
    private String[] nomeMes;
    private Dia[] numDias;
    private Mes[] meses;
    private AnoView view = new AnoView();

    public Ano(int num) {
        this.num = num;
        this.meses = new Mes[12];
        inicializarMeses();

    }

    private void inicializarMeses() {
        meses[0] = new Mes(31, "Janeiro");
        meses[1] = new Mes(28, "Fevereiro");
        meses[2] = new Mes(31, "Março");
        meses[3] = new Mes(30, "Abril");
        meses[4] = new Mes(31, "Maio");
        meses[5] = new Mes(30, "Junho");
        meses[6] = new Mes(31, "Julho");
        meses[7] = new Mes(31, "Agosto");
        meses[8] = new Mes(30, "Setembro");
        meses[9] = new Mes(31, "Outubro");
        meses[10] = new Mes(30, "Novembro");
        meses[11] = new Mes(31, "Dezembro");
    }

    public void addCompromisso(int mes, int dia, int hora, String pessoa, String local, String assunto) {
        if (mes >= 1 && mes <= 12) {
            if (meses[mes - 1] == null) {
                meses[mes - 1] = new Mes(31, nomeMes[mes - 1]);
            }
            meses[mes - 1].addCompromisso(dia, hora, pessoa, local, assunto);
            view.notificarCompromissoRealizado(this.num, mes, dia, hora, pessoa, local, assunto);
        } else {
            System.out.println("Mês Inválido!!");
        }
    }
    public void consultarCompromisso(int mes, int dia, int hora){
        if(mes >= 1 && mes <=12){
            if (dia > 0 && dia<= meses[mes-1].getNumDias()) {
                if (hora >=0 && hora<24) {
                    if (meses[mes-1] != null) {
                        System.out.println("Ano: " + this.num + " Mês: " + mes + " " + meses[mes - 1].consultarCompromisso(dia, hora));

                    }
                }else{
                    System.out.println("Hora Inválida!!");
                }
            }else{
                System.out.println("Dia Inválido!!");
            }
        }else{
            System.out.println("Mês Inválido!!");
        }
    }

}
