package br.edu.up.views;

import javax.xml.crypto.Data;

import br.edu.up.Prompt;
import br.edu.up.controllers.*;


public class Menu {

    public void mostrar(){

        ControleEvento controllerEvento = new ControleEvento();
        Mensagem msg = new Mensagem();
        
   
    
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
                        System.out.println("--- Incluir EVENTO ---");
                        String nome = Prompt.lerLinha("Nome: ");
                        String data = Prompt.lerLinha("Data: ");
                        String local = Prompt.lerLinha("Local: ");
                        int lotacaoMax = Prompt.lerInteiro("Lotação máxima: ");
                        Double precoIngresso = Prompt.lerDecimal("Preço do ingresso: ");
                        if (controllerEvento.incluirEvento(nome, data, local, lotacaoMax, precoIngresso).equals("null")) {
                            msg.mensagem("Falha ao adicionar evento!!");
                        }else{
                            msg.mensagem("Evento adicionada com suscesso!!");
                        }
                        ;
                        
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
