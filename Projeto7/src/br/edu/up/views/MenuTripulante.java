package br.edu.up.views;

import br.edu.up.Prompt;
import br.edu.up.controllers.*;

public class MenuTripulante {
    
    public void mostrarTripulante(){
        Menu iniciar = new Menu();
      

        System.out.println();
        System.out.println("-------------------------");
        System.out.println("      MENU TRIPULANTE"    );
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("Digite a opção desejada:");
        System.out.println();
    
        System.out.println("1.");
        System.out.println("2. ");
        System.out.println("3.");
        System.out.println("4. ");
        System.out.println("5. ");
    
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
                    iniciar.mostrar();
                break;
                case 5:
                    System.exit(0);
                break;
                default:
                break;
            }
            System.out.println();
            System.out.println("-------------------------");
            System.out.println("     "    );
            System.out.println("-------------------------");
            System.out.println();
            System.out.println(":");
            System.out.println();
        
            System.out.println("1. ");
            System.out.println("2. ");
            System.out.println("3. ");
            System.out.println("4.");
            System.out.println("5. ");
        
            op = Prompt.lerInteiro();
        
        } while (op != 5);
    
    }


    
}
