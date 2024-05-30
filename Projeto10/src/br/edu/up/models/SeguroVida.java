package br.edu.up.models;

import java.time.LocalDate;

public class SeguroVida extends Seguro{

    private boolean cobreDoenca;
    private boolean cobreAcidente;

    
    public SeguroVida(String apolice, Segurado segurado, double vlrApolice, String dtaInicio, String dtaFim,
            boolean cobreDoenca, boolean cobreAcidente) {
        super(apolice, segurado, vlrApolice, dtaInicio, dtaFim);
        this.cobreDoenca = cobreDoenca;
        this.cobreAcidente = cobreAcidente;
    }

    public boolean getCobreDoenca() {
        return cobreDoenca;
    }
    public void setCobreDoenca(boolean cobreDoenca) {
        this.cobreDoenca = cobreDoenca;
    }
    public boolean getCobreAcidente() {
        return cobreAcidente;
    }
    public void setCobreAcidente(boolean cobreAcidente) {
        this.cobreAcidente = cobreAcidente;
    }
    @Override
    public String toString() {
        return "SeguroVida [Apólice:" +  super.getApolice()
                +"\n " + getSegurado()
                +"\n Valor da Apólice: "+ super.getVlrApolice()
                +", Data de Início: "+ super.getDtaInicio()
                +", Data do Fim: "+ super.getDtaFim()
                +", Cobre Doenças: "+ getCobreDoenca()
                +", Cobre Acidentes: "+ getCobreAcidente()+" ]";
    }
    


    
}
