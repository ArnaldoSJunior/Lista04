package br.edu.up.controllers;

import br.edu.up.models.*;

public class ControllerDisciplina {

    Disciplina[] disciplinas = new Disciplina[2];

    public String registrarDisciplina(int id, String nome, String curso, Competencia[] competencias) {
        for (int i = 0; i < disciplinas.length; i++) {
            if (disciplinas[i] == null) {
                disciplinas[i] = new Disciplina(id, nome, curso, competencias);

                return "ok";
            }
        }
        return "null";
    }

    public void listarDisciplina() {

        for (int i = 0; i < disciplinas.length; i++) {
            if (disciplinas[i] != null) {
                System.out.println("--- Disciplina ---");
                System.out.println("Id " + disciplinas[i].getId());
                System.out.println("Nome " + disciplinas[i].getNome());
                System.out.println("Curso " + disciplinas[i].getCurso());
                System.out.println("-------- Competências---------");
                Competencia[] competencias = disciplinas[i].getCompetencias();
                for (int j = 0; j < competencias.length; j++) {
                    System.out.println("Tipo:  " + (j + 1) + ": " + competencias[j].getTipo());
                    System.out.println("Descrição: " + competencias[j].getDescricao());

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

}
