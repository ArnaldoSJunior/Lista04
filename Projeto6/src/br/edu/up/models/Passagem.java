package br.edu.up.models;

public class Passagem {

    private String nomePassageiro;
    private String acento;
    private String classe;
    private String datas;
    private String voos;
   
    public Passagem(String nome, String acento, String classe, String datas, String voos) {
        this.nomePassageiro = nome;
        this.acento = acento;
        this.classe = classe;
        this.datas = datas;
        this.voos = voos;
    }

    public String getAcento() {
        return acento;
    }

    public void setAcento(String acento) {
        this.acento = acento;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }
    

    public String getNomePassageiro() {
        return nomePassageiro;
    }

    @Override
    public String toString() {
        return "Passagem [acento=" + acento + ", classe=" + classe + ", datas=" + datas + ", voos=" + voos + "]";
    }
    


}
