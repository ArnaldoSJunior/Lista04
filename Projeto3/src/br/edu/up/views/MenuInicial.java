package br.edu.up.views;
import br.edu.up.controllers.*;
import br.edu.up.models.*;
import br.edu.up.views.*;

import java.util.Scanner;

public class MenuInicial {

      Ano ano = new Ano(2024);
      AnoView view = new AnoView();


      Scanner leitor = new Scanner(System.in);
      ControleDeAgenda controller = new ControleDeAgenda(ano, view);

      public void mostrar() {

        System.out.println();
        System.out.println("-------------------------");
        System.out.println("      MENU INICIAL"       );
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("Digite a opção desejada:");
        System.out.println();

        System.out.println("1. Adicionar Compromisso");
        System.out.println("2. Consultar Compromisso");
        System.out.println("3. Remover Compromisso");
        System.out.println("4. Listar Compromissos");
        System.out.println();

        int opcao = leitor.nextInt();
        do {
            
            switch (opcao) {
            case 1:{
                  System.out.println("--- Adicionar Compromisso ---");
                  controller.addCompromisso(11, 5, 10, "Migas", "Casa", "Dormir");
                  view.mensagem(controller.addCompromisso(11, 5, 10, "Migas", "Casa", "Dormir"));
            }
                  break;
            case 2:{    
                  System.out.println("--- Consultar Compromissos");
                  controller.consultarCompromisso(11, 5, 10);


            }
                  break;
             case 3:{

            }
                  break; 
            case 4:{

            }
                  break;
            default:
                break;
            }
            System.out.println();
            System.out.println("-------------------------");
            System.out.println("      MENU INICIAL"       );
            System.out.println("-------------------------");
            System.out.println();
            System.out.println("Digite a opção desejada:");
            System.out.println();

            System.out.println("1. Adicionar Compromisso");
            System.out.println("2. Consultar Compromisso");
            System.out.println("3. Remover Compromisso");
            System.out.println("4. Listar Compromissos");
            System.out.println("5. Encerrar Programa");
            System.out.println();
            opcao = leitor.nextInt();
        } while (opcao != 5);
        }

        public void mostrarListarprodutos(){

            System.out.println();
            System.out.println("-------------------------");
            System.out.println("   Listar Compromissos   ");
            System.out.println("-------------------------");
            System.out.println();
            System.out.println("Digite a opção desejada:");
           

            System.out.println("1. Compromissos do mês ");
            System.out.println("2. Todos os compromissos");
            System.out.println();
        }
 }