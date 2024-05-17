package br.edu.up.models;

public class Aluno extends Pessoa{

    
    private String curso;
    private String turno;
    private int anoDeIngresso;
    private String situacao;

    public Aluno(String nome, int rg, int matricula, String curso, String turno, int anoDeIngresso) {
        super(nome, rg, matricula);
        this.curso = curso;
        this.turno = turno;
        this.anoDeIngresso = anoDeIngresso;
        this.situacao = "Pendente";
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }
    public int getAnoDeIngresso() {
        return anoDeIngresso;
    }
    public void setAnoDeIngresso(int anoDeIngresso) {
        this.anoDeIngresso = anoDeIngresso;
    }
    public String isSituacao() {
        return situacao;
    }
    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    @Override
    public void setNome(String nome) {
    super.setNome(nome);
    }
    


    @Override
    public String toString() {
      return "Aluno [Nome ="+ super.getNome()
        +", RG = "+ super.getRg()
        +", Matricula = "+ super.getMatricula() 
        +", Curso = " + this.getCurso()
        +", Turno = " + this.getTurno()
        +", Ano de ingresso = " + this.getAnoDeIngresso()
        ;
    }
    public String getSituacao() {
        return situacao;
    }
    
   

}
 