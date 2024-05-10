package br.edu.up.views;

import br.edu.up.*;

public class Menu {


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
    }
}
