package br.edu.up.models;

public class Professor extends Pessoa{

    private String titulacao;
    private CurriculoLatte curriculoLattes;


    public Professor(String nome, int rg, int matricula,  String titulacao){
        super(nome, rg, matricula);
        this.titulacao = titulacao;
    }

    public void setCurriculoLattes(CurriculoLatte curriculoLattes) {
        this.curriculoLattes = curriculoLattes;
    }


    public String getTitulacao() {
        return titulacao;
    }


    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
    
    @Override
    public String toString(){
        super.getNome();
        super.getMatricula();
        super.getRg();
        return "Professor [Nome ="+ super.getNome()
        +", RG = "+super.getRg()
        +", Matricula = "+ super.getMatricula()
        +", Titulação = "+ titulacao
        +", "+ curriculoLattes.toString();

    }
    public String listarProfessor(){
        super.getNome();
        super.getMatricula();
        super.getRg();
        return "Professor [Nome ="+ super.getNome()
        +", RG = "+super.getRg()
        +", Matricula = "+ super.getMatricula()
        +", Titulação = "+ titulacao
        +" ]\n";

    }

    public CurriculoLatte getCurriculoLattes() {
        return curriculoLattes;
    }
    

    
    

}
