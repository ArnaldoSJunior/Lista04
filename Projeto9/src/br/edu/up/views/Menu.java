package br.edu.up.views;

import br.edu.up.Prompt;

public class Menu {
    public void mostrar() {

        System.out.println("----- MENU -----");
        System.out.println();
        System.out.println("1.Incluir cliente pessoa");
        System.out.println("2.Incluir cliente empresa");
        System.out.println("3.Mostrar dados cliente pessoa");
        System.out.println("4.Mostar dados cliente empresa");
        System.out.println("5.Emprestar para cliente pessoa");
        System.out.println("6.Emprestar para cliente empresa");
        System.out.println("7.Devolução de cliente pessoa ");
        System.out.println("8.Devolução de cliente empresa");
        System.out.println("9.Sair");
        System.out.println();

        int op = Prompt.lerInteiro();

        do {
            switch (op) {
                case 1:
                  
                    break;
                case 2:
                   
                    break;
                case 3:
                   
                    break;
                case 4:
                   
                    break;
                case 5:
                   
                    break;
                case 6:
                    
                    break;
                case 7:
                   
                    break;
                case 8:
                   
                    break;
                case 9:
                    System.exit(0);
                    break;

                default:
                    break;
            }
            System.out.println("----- MENU -----");
            System.out.println();
            System.out.println("1.Incluir cliente pessoa");
            System.out.println("2.Incluir cliente empresa");
            System.out.println("3.Mostrar dados cliente pessoa");
            System.out.println("4.Mostar dados cliente empresa");
            System.out.println("5.Emprestar para cliente pessoa");
            System.out.println("6.Emprestar para cliente empresa");
            System.out.println("7.Devolução de cliente pessoa ");
            System.out.println("8.Devolução de cliente empresa");
            System.out.println("9.Sair");
            System.out.println();
    
            op = Prompt.lerInteiro();

        } while (op != 6);
    }

}
