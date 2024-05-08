package br.edu.up.views;

import br.edu.up.Prompt;

public class Menu {

    public void mostrar(){

    Menu iniciar = new Menu();
    MenuTripulante menuTripulante = new MenuTripulante();
    
    System.out.println();
    System.out.println("-------------------------");
    System.out.println("      MENU INICIAL"       );
    System.out.println("-------------------------");
    System.out.println();
    System.out.println("Digite a opção desejada:");
    System.out.println();

    System.out.println("1. Menu Passageiros");
    System.out.println("2. Menu Tripulantes");
    System.out.println("3. Encerrar");
    int op = Prompt.lerInteiro();
    switch (op) {
        case 1:
            
            break;
        case 2:
            menuTripulante.mostrarTripulante();
            break;
    
        default:
            break;
    }









    }





}
