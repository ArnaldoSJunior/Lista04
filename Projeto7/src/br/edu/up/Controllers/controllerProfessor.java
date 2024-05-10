package br.edu.up.controllers;
import br.edu.up.models.*;

public class ControllerProfessor {

    Professor[] professores = new Professor[10];
    CurriculoLatte[] curriculos = new CurriculoLatte[professores.length];

    public String registrarProfessor(String nome, int rg, int matricula, int numCurriculo, String titulacao){
        for(int i=0; i< professores.length; i++){
            if (professores[i] == null) {
                professores[i] = new Professor(nome, rg, matricula, numCurriculo, titulacao);
                
                return "ok";
            }
        }
        return "null";
    }
    public String registrarCurriculo(int matricula, String nomeInstituicao, int anoDeConclusao, String tituloObtido, String trabalhoDeConclusao){
        for(int i = 0; i < curriculos.length; i++){
            if (curriculos[i] == null) {
                curriculos[i] = new CurriculoLatte(nomeInstituicao, anoDeConclusao, tituloObtido, trabalhoDeConclusao);
                for(int j = 0; j < professores.length; j++){
                    if (professores[j] != null && professores[j].getMatricula() == matricula) {
                        professores[j].setCurriculoLattes(curriculos[i]);
                        return professores[j].toString();
                    }
                }
                // Se nenhum professor corresponde à matrícula fornecida
                return "Nenhuma correspondência encontrada para a matrícula fornecida";
            }
        }
        return "Nenhum currículo vazio disponível";
    }

    public String excluirProfessor(int matricula){
        for(int i=0; i < professores.length; i++){
            if (professores[i].getMatricula() == matricula) {
                professores[i] = null;
                return "ok";
            }
        }
        return "null";
        
    }
    
}
