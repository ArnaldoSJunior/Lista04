package br.edu.up.controllers;

import br.edu.up.models.*;

public class ControllerDisciplina {

Disciplina[] disciplinas = new Disciplina[2];

public String registrarDisciplina(int id, String nome, String curso, Competencia[] competencias){
    for(int i=0; i< disciplinas.length; i++){
        if(disciplinas[i] == null){
            disciplinas[i] = new Disciplina(id, nome, curso, competencias);
            return "ok";
        }
  }
  return "null";   
}





}
