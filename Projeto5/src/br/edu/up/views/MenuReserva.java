package br.edu.up.views;

import br.edu.up.Prompt;
import br.edu.up.controllers.ControleReserva;
import br.edu.up.models.Evento;

public class MenuReserva {
    public void mostrarReserva(){
     
     ControleReserva controllReserva = new ControleReserva(null);
     Menu menuInicial = new Menu();
     
     System.out.println();
     System.out.println("-------------------------");
     System.out.println("      MENU RESERVA"       );
     System.out.println("-------------------------");
     System.out.println();
     System.out.println("Digite a opção desejada:");
     System.out.println();
 
     System.out.println("1. Incluir");
     System.out.println("2. Alterar");
     System.out.println("3. Listar");
     System.out.println("4. Excluir");
     System.out.println("5  Voltar ao MENU INICIAL");    


     int  escolha = Prompt.lerInteiro();
     switch (escolha) {
        case 1:
        System.out.println("--- Incluir RESERVA ---");
        String nome = Prompt.lerLinha("Nome: ");
        int quantidadePessoas = Prompt.lerInteiro("quantidade de pessoas: ");
        String dataReserva = Prompt.lerLinha("Ïnforme a data: ");
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
        default:
            break;
     }


    }
}
