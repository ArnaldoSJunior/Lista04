package br.edu.up.views;

import br.edu.up.Prompt;

public class MenuPassageiro {
    public void mostrarPassageiro(){

        Menu iniciar = new Menu();
        
        System.out.println();
        System.out.println("-------------------------");
        System.out.println("      MENU PASSAGEIRO"    );
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("Digite a opção desejada:");
        System.out.println();
    
        System.out.println("1. Cadastrar Passageiro");
        System.out.println("2. Voltar ao Menu Inicial");
        System.out.println("3. Encerrar");
    
    
    
        int op = Prompt.lerInteiro();
    switch (op) {
        case 1:
            
            break;
        case 2:
            iniciar.mostrar();
            break;
        case 3:
            System.exit(0);
            break;
        default:
            break;
    }
    
    
    
    
    
    
        }
    
}
