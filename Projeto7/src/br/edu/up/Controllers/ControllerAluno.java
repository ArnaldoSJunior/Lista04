package br.edu.up.controllers;

import br.edu.up.db.*;
import br.edu.up.models.*;

public class ControllerAluno {

Aluno[] alunos = new Aluno[2];

public String registrarAluno(String nome, int rg, int matricula, String curso, String turno, int anoDeIngresso ){

    for(int i=0; i< alunos.length; i++){
        if (alunos[i] == null) {
            alunos[i] = new Aluno(nome, rg, matricula, curso, turno, anoDeIngresso);
            
            return "ok";
        }
    }
    return "null";


}

public void listarAlunos(){
    for(int i=0; i< alunos.length; i++){
        if (alunos[i] != null) {
            System.out.println("Nome: " + alunos[i].getNome());
            System.out.println("RG: " + alunos[i].getRg());
            System.out.println("Matrícula: " + alunos[i].getMatricula());
            System.out.println("Curso: " + alunos[i].getCurso());
            System.out.println("Turno: " + alunos[i].getTurno());
            System.out.println("Ano de Ingresso: " + alunos[i].getAnoDeIngresso());
            System.out.println("----------");
        }

    }

}

public void alterarAluno(int matricula, String novoNome, int novoRG, String novoCurso, String novoTurno, int novoAnoDeIngresso) {
    for(int i = 0; i < alunos.length; i++) {
        if (alunos[i] != null && alunos[i].getMatricula() == matricula) {
            // Realiza a alteração dos dados do aluno
            alunos[i].setNome(novoNome);
            alunos[i].setRg(novoRG);
            alunos[i].setCurso(novoCurso);
            alunos[i].setTurno(novoTurno);
            alunos[i].setAnoDeIngresso(novoAnoDeIngresso);
            System.out.println("Aluno alterado com sucesso!");
            return;
        }
    }
    System.out.println("Aluno não encontrado com a matrícula fornecida.");
}



public String excluirAluno(int matricula){
    for(int i=0; i < alunos.length; i++){
       
        if (alunos[i] != null && alunos[i].getMatricula() == matricula) {
            alunos[i] = null;
            return "ok";
        }
    }
    return "null";
    
}



}
