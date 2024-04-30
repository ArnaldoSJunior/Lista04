package br.edu.up.views;

import javax.swing.text.View;
import javax.xml.crypto.Data;

import br.edu.up.Prompt;
import br.edu.up.controllers.*;


public class Menu {

    public void mostrar(){

        MenuEvento eventoMenu = new MenuEvento();
        MenuReserva eventoReserva = new MenuReserva();

        int escolha;
        System.out.println();
        System.out.println("-------------------------");
        System.out.println("      MENU INICIAL"       );
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("Digite a opção desejada:");
        System.out.println();
    
        System.out.println("1. Eventos ");
        System.out.println("2. Reservas ");
        System.out.println("3. Encerrar");
  
   
        escolha = Prompt.lerInteiro();
        switch (escolha) {
            case 1:
            {
                eventoMenu.mostrarEvento();
            }break;
            case 2:{
                eventoReserva.mostrarReserva();
            }break;
            case 3:{
                System.exit(escolha);
            }
            break;         
            default: 
            break;
        }
           
    
    }
}