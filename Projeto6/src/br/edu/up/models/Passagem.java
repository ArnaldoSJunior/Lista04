package br.edu.up.models;

public class Passagem {

   private String acento;
   private String classe;
   private Data[] datas;
   private Voo[] voos;
   
public Passagem(String acento, String classe, Data[] datas, Voo[] voos) {
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

}
