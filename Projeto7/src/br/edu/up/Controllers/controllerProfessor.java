package br.edu.up.Controllers;
import br.edu.up.models.*;

public class controllerProfessor {

    Professor[] professores = new Professor[10];
    CurriculoLatte[] curriculos = new CurriculoLatte[professores.length];

    public String registrarProfessor(String nome, int rg, int matricula, int numCurriculo, String titulacao){
        for(int i=0; i< professores.length; i++){
            if (professores[i] == null) {
                professores[i] = new Professor(nome, rg, matricula, numCurriculo, titulacao);

            }
        }
        return "null";
    }
    public String registrarCurriculo(int matricula, String nomeInstituicao, int anoDeConclusao, String tituloObtido, String trabalhoDeConclusao){
        for(int i =0; i < curriculos.length; i++){
            if (curriculos[i] == null) {
                curriculos[i] = new CurriculoLatte(nomeInstituicao, anoDeConclusao, tituloObtido, trabalhoDeConclusao);
                for(int j=0; j < professores.length; j++){
                    if (professores[j].getMatricula() == matricula) {
                        professores[j].setCurriculoLattes(curriculos[i]);
                        return "ok";
                    }
                }
                return "null";
            }
        }
        return "null";
    }
}
