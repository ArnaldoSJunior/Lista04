package br.edu.up.models;

public class Professor extends Pessoa{

    private int numCurriculo;
    private String titulacao;
    private CurriculoLatte curriculoLattes;


    public Professor(String nome, int rg, int matricula, int numCurriculo, String titulacao){
        super(nome, rg, matricula);
        this.numCurriculo = numCurriculo;
        this.titulacao = titulacao;
    }

    public void setCurriculoLattes(CurriculoLatte curriculoLattes) {
        this.curriculoLattes = curriculoLattes;
    }

    public int getNumCurriculo() {
        return numCurriculo;
    }


    public void setNumCurriculo(int numCurriculo) {
        this.numCurriculo = numCurriculo;
    }


    public String getTitulacao() {
        return titulacao;
    }


    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
    
    

    // @Override
    // public String toString(){
    //     super.getNome();
    //     super.getRg();
    //     super.getIdAeronautica();
    //     super.getMatrculafunc();
    //     return "Comissário [Nome ="+ super.getNome()
    //     + ", RG ="+super.getRg()
    //     + ", Id ="+super.getIdAeronautica()
    //     + ", Matricula ="+ super.getMatrculafunc()
    //     + ", Idiomas =" + idiomas +"]";
    // }
    @Override
    public String toString(){
        super.getNome();
        super.getMatricula();
        super.getRg();
        return "Professor [Nome ="+ super.getNome()
        +", RG = "+super.getRg()
        +", Matricula = "+ super.getMatricula()
        +", Titulação = "+ titulacao
        +", Número de Currículo = "+ numCurriculo
        +", "+ curriculoLattes.toString();


    }

    public CurriculoLatte getCurriculoLattes() {
        return curriculoLattes;
    }

    
    

}
