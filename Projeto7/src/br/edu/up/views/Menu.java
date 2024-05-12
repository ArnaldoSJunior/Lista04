package br.edu.up.views;

import br.edu.up.Prompt;
import br.edu.up.db.Banco;

public class Menu {

    MenuProfessor menuProfessor = new MenuProfessor();
    MenuAluno menuAluno = new MenuAluno();
    MenuDisciplina menuDisciplina = new MenuDisciplina();

    public void mostrar(){
        System.out.println();
        System.out.println("-------------------------");
        System.out.println("      MENU INICIAL"       );
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("Digite a opção desejada:");
        System.out.println();

        System.out.println("1. Menu Professor");
        System.out.println("2. Menu Aluno");
        System.out.println("3. Menu Disciplina");
        System.out.println("4. Encerrar");

        int op = Prompt.lerInteiro();
        switch (op) {
            case 1:
                menuProfessor.mostrarMenuProfessor();
                break;
            case 2:
                menuAluno.mostrarMenuAluno();
                break;
            case 3:
                menuDisciplina.mostrarDisciplina();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                break;
        }




    }




}

