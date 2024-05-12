package br.edu.up.models;

public class Aluno extends Pessoa{

    
    private String curso;
    private String turno;
    private int anoDeIngresso;

    public Aluno(String nome, int rg, int matricula, String curso, String turno, int anoDeIngresso) {
        super(nome, rg, matricula);
        this.curso = curso;
        this.turno = turno;
        this.anoDeIngresso = anoDeIngresso;
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
    public void setNome(String novoNome) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setNome'");
    }
    public void setRg(int novoRG) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setRg'");
    }

}
 