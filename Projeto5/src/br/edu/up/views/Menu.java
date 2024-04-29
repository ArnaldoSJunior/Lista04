package br.edu.up.views;

import br.edu.up.Prompt;

public class Menu {

    public void mostrar(){
        
   
    
        System.out.println();
        System.out.println("-------------------------");
        System.out.println("      MENU INICIAL"       );
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("Digite a opção desejada:");
        System.out.println();
    
        System.out.println("1.Eventos ");
        System.out.println("2.Reservas ");

        int escolha = Prompt.lerInteiro();
        switch (escolha) {
            case 1:
            System.out.println();
            System.out.println("-------------------------");
            System.out.println("      MENU EVENTOS"       );
            System.out.println("-------------------------");
            System.out.println();
            System.out.println("Digite a opção desejada:");
            System.out.println();
        
            System.out.println("1. Incluir");
            System.out.println("2. Alterar");
            System.out.println("3. Listar");
            System.out.println("4. Excluir");
                

             int escolher = Prompt.lerInteiro();
                switch (escolher) {
                    case 1:
                        
                        break;
                        case 2:
                        
                        break;
                        case 3:
                        
                        break;
                        case 4:
                        
                        break;
                    default:
                        break;
                }

                case 2:
                System.out.println();
                System.out.println("-------------------------");
                System.out.println("      MENU RESERVAS"       );
                System.out.println("-------------------------");
                System.out.println();
                System.out.println("Digite a opção desejada:");
                System.out.println();

                System.out.println("1. Incluir");
                System.out.println("2. Alterar");
                System.out.println("3. Listar");
                System.out.println("4. Excluir");

                int escolher2 = Prompt.lerInteiro();
                switch (escolher2) {
                        case 1:
                        
                        break;
                        case 2:
                        
                        break;
                        case 3:
                        
                        break;
                        case 4:
                        
                        break;
                    default:
                        break;
                }

            default:
                break;
        }
       
 }
}
