package br.edu.up.models;



public class Passageiro extends Pessoa {

    private Pessoa[] pessoas;
    private int idBagagem;
    private Passagem[] passagens;

    

    public Passageiro(String nome ,int rg, int idBagagem) {
        super(nome,rg);
        this.idBagagem = idBagagem;
       
    }

    public int getIdBagagem() {
        return idBagagem;
    }
    public void setIdBagagem(int idBagagem) {
        this.idBagagem = idBagagem;
    }
  
  @Override
  public String toString() {
      super.getNome();
      super.getRg();
    
      return super.toString();
  }
}
