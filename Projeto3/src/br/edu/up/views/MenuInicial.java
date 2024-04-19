package br.edu.up.views;

import java.util.Scanner;

public class MenuInicial {
    

    Scanner leitor = new Scanner(System.in);

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
        switch (opcao) {
            case 1:{

            }
                  break;
            case 2:{

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


    }
 }