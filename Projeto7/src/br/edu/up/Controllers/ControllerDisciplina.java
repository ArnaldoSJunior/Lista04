package br.edu.up.controllers;

import br.edu.up.db.Banco;
import br.edu.up.models.*;

public class ControllerDisciplina {

    Disciplina[] disciplinas = new Disciplina[2];

    public String registrarDisciplina(int id, String nome, String curso, Competencia[] competencias, int idProfessor) {
        for (int i = 0; i < disciplinas.length; i++) {
            if (disciplinas[i] == null) {
                disciplinas[i] = new Disciplina(id, nome, curso, competencias);
                for(int j=0; j < Banco.ctlrProfessor.getProfessores().length; j++){
                    if (Banco.ctlrProfessor.getProfessores(j).getMatricula() == idProfessor) {
                        disciplinas[i].setProfessor(Banco.ctlrProfessor.getProfessores(j));
                        disciplinas[i].setAlunos(Banco.ctlrAluno.getAlunos());
                        return "ok";
                    }
                }
                return "null";
            }
        }
        return "null";
    }

    public void listarDisciplina() {

        for (int i = 0; i < disciplinas.length; i++) {
            if (disciplinas[i] != null) {
                System.out.println("-------- Disciplina ---------");
                System.out.println("Id " + disciplinas[i].getId());
                System.out.println("Nome " + disciplinas[i].getNome());
                System.out.println("Curso " + disciplinas[i].getCurso());
                System.out.println("Professor "+ disciplinas[i].getProfessor().getNome());
                System.out.println("-------- Competências---------");
                Competencia[] competencias = disciplinas[i].getCompetencias();
                for (int j = 0; j < competencias.length; j++) {
                    System.out.println("Tipo:  " + (j + 1) + ": " + competencias[j].getTipo());
                    System.out.println("Descrição: " + competencias[j].getDescricao());

                }
                System.out.println("-------- Alunos ---------");
                for(int k=0; k < disciplinas[i].getAlunos().length; k++){
                    if (disciplinas[i].getAlunos(k) != null) {
                        System.out.println("Matrícula "+ disciplinas[i].getAlunos(k).getMatricula());
                        System.out.println("Nome "+ disciplinas[i].getAlunos(k).getNome());
                        System.out.println("Turno "+ disciplinas[i].getAlunos(k).getTurno()+ "\n");
                    }
                    
                }
            }

        }
    }

    public String excluirDisciplina(int id) {
        for (int i = 0; i < disciplinas.length; i++) {
            if (disciplinas[i] != null && disciplinas[i].getId() == id) {
                disciplinas[i] = null;
                return "ok";
            }
        }
        return "null";

    }
    public String alterarNome(String nomeAntigo, String nomeNovo){
        for(int  i=0; i < disciplinas.length; i++){
            if (disciplinas[i].getNome().equals(nomeAntigo)) {
                disciplinas[i].setNome(nomeNovo);
                return "ok";
            }
        }
        return "null";
    }
    public String alterarId(int idAntiga, int idNova){
        for(int i=0; i < disciplinas.length; i++){
            if (disciplinas[i].getId() == idAntiga) {
                disciplinas[i].setId(idNova);
                return "ok";
            }
        }
        return "null";
    }
    public String alterarCurso(String cursoAntigo, String cursoNovo){
        for(int  i=0; i < disciplinas.length; i++){
            if (disciplinas[i].getCurso().equals(cursoAntigo)) {
                disciplinas[i].setCurso(cursoNovo);
                return "ok";
            }
        }
        return "null";
    }

    public Disciplina[] getDisciplinas() {
        return disciplinas;
    }
    public Disciplina getDisciplinas(int i) {
        return disciplinas[i];
    }

    public void registrarAluno(int matriculaAluno){
        for(int i=0; i < disciplinas.length; i++){
            for(int j=0; j < Banco.ctlrAluno.getAlunos().length; j++){
                if (Banco.ctlrAluno.getAlunos(j).getMatricula() == matriculaAluno) {
                    disciplinas[i].setAluno(Banco.ctlrAluno.getAlunos(j));
                }
            }
        }
    }
    


}
