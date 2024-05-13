package br.edu.up.controllers;
import br.edu.up.models.*;
import br.edu.up.db.*;

public class ControllerProfessor {

    Professor[] professores = new Professor[10];
    CurriculoLatte[] curriculos = new CurriculoLatte[professores.length];

    public String registrarProfessor(String nome, int rg, int matricula, String titulacao){
        for(int i=0; i< professores.length; i++){
            if (professores[i] == null) {
                professores[i] = new Professor(nome, rg, matricula, titulacao);
                
                return "ok";
            }
        }
        return "null";
    }
    public String registrarCurriculo(int matricula, String nomeInstituicao, int anoDeConclusao, String tituloObtido, String trabalhoDeConclusao){
        for(int i = 0; i < curriculos.length; i++){
            if (curriculos[i] == null) {
                curriculos[i] = new CurriculoLatte(matricula, nomeInstituicao, anoDeConclusao, tituloObtido, trabalhoDeConclusao);
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
                for(int j=0; j<curriculos.length; j++){
                    if (curriculos[j] != null && curriculos[i].getMatriculaProfessor() == matricula) {
                        curriculos[j] = null;
                        return "ok";
                    }
                }
            }
        }
        return "null";
        
    }
    public String listarProfessores(){
        int num =0;
        StringBuffer res = new StringBuffer();
        for(int i=0; i < professores.length; i++){
            if (professores[i] != null) {
                res.append(professores[i].toString()).append("\n");
                num++;
            }
        }
        if (num ==0) {
            res.append("Não professores cadastrados!!");
        }
        return res.toString();
    }

    public String alterarNome(String nomeAntigo, String nomeNovo){
        for(int i=0; i< professores.length; i++){
            if (professores[i].getNome().equals(nomeAntigo)) {
                professores[i].setNome(nomeNovo);
                return"ok";
            }
        }
        return "null";
    }
    public String alterarRg(int rgAntigo, int rgNovo){
        for(int i=0; i < professores.length; i++){
            if (professores[i].getRg() == rgAntigo) {
                professores[i].setRg(rgNovo);
                return "ok";
            }
        }
        return "null";
    }
    public String alterarMatricula(int matriculaAntiga, int matriculaNova){
        for(int i=0; i< professores.length; i++){
            if (professores[i].getMatricula() == matriculaAntiga) {
                professores[i].setMatricula(matriculaNova);
                for(int j=0; j < curriculos.length; j++){
                    if (curriculos[j].getMatriculaProfessor() == matriculaAntiga) {
                        curriculos[j].setMatriculaProfessor(matriculaNova);
                        return "ok";
                    }
                }
            }
        }
        return "null";
    }
    public String alterarTitulção(String tirulacaoAntiga, String titulacaoNova){
        for(int i=0; i< professores.length; i++){
            if (professores[i].getTitulacao().equals(tirulacaoAntiga)) {
                professores[i].setTitulacao(titulacaoNova);
                return "ok";
            }
        }
        return "null";
    }
    public Professor retornarProfessor(int matricula){
        for(int i=0; i< professores.length; i++){
            if (professores[i].getMatricula() == matricula) {
                return professores[i];
            }
        }
        return null;
    }

}
