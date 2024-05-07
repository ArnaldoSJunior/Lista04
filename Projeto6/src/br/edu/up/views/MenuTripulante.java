package br.edu.up.views;

import br.edu.up.Prompt;

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
    
        System.out.println("1. Comandantes");
        System.out.println("2. Comissários");
        System.out.println("3. Voltar ao Menu Inicial");
        System.out.println("4. Encerrar");
    
    int op = Prompt.lerInteiro();
    switch (op) {
        case 1:
            
            break;
        case 2:
            
            break;
        case 3:
            iniciar.mostrar();
            break;
        case 4:
            System.exit(0);
            break;
        default:
            break;
    }
    
    
    
    
    
    
        }


    
}
