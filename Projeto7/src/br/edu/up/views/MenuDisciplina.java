package br.edu.up.views;

import br.edu.up.Prompt;
import br.edu.up.db.*;
import br.edu.up.models.Competencia;

public class MenuDisciplina {

public void mostrarDisciplina(){
 Menu menuInicial =  new Menu();

 System.out.println();
        System.out.println("-------------------------");
        System.out.println("      MENU DISCIPLINA"    );
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("Digite a opção desejada:");
        System.out.println();

        System.out.println("1. Registrar Disciplina");
        System.out.println("2. Listar Disciplinas");
        System.out.println("3. Alterar Disciplina");
        System.out.println("4. Excluir Disciplina");
        System.out.println("5. Voltar ao Menu Inicial");
        System.out.println("6. Encerrar");

        int op = Prompt.lerInteiro();
        switch (op) {
            case 1:
               registrarDisciplina();
                 break;
            case 2:
                 break;
            case 3:
                  break;
            case 4:
                  break;
            case 5:
                 menuInicial.mostrar();
                 break;
            case 6:
                 System.exit(0);
                 break;
            default:
                break;
        }
    }


    public void registrarDisciplina(){
        System.out.println("--- Registrar Disciplina ---");
    
       
        int id = Prompt.lerInteiro("Id: ");
        String nome = Prompt.lerLinha("Nome: ");
        String curso = Prompt.lerLinha("Curso: ");
    
        int numCompetencias = Prompt.lerInteiro("Quantidade de competências: ");
        Competencia[] competencias = new Competencia[numCompetencias];
        for (int i = 0; i < numCompetencias; i++) {
            competencias[i] = Prompt.lerLinha("Competência " + (i+1) + ": ");
            
        }
    
      
        String resultado = Banco.ctlrDisciplina.registrarDisciplina(id, nome, curso, competencias);
    
      
        if (resultado.equals("ok")) {
            System.out.println("Disciplina registrada com sucesso!!");
        } else {
            System.out.println("Erro ao registrar disciplina: " + resultado);
        }
    }
    




}
