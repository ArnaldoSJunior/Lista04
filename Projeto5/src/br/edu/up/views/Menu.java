package br.edu.up.views;

import javax.xml.crypto.Data;

import br.edu.up.Prompt;
import br.edu.up.controllers.*;


public class Menu {

    public void mostrar(){

        ControleEvento controllerEvento = new ControleEvento();
        Mensagem msg = new Mensagem();
        int escolha;
   do {
    System.out.println();
        System.out.println("-------------------------");
        System.out.println("      MENU INICIAL"       );
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("Digite a opção desejada:");
        System.out.println();
    
        System.out.println("1. Eventos ");
        System.out.println("2. Reservas ");

        escolha = Prompt.lerInteiro();
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
                    
                escolha = Prompt.lerInteiro();
                do {
                    switch (escolha) {
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
                            
                            
                            break;
                        case 2:
                            
                            break;
                        case 3:
                            {System.out.println("--- Listagem dos Eventos ---");
                            msg.mensagem(controllerEvento.listagemDeEventos());
                            break;}
                            
                        case 4:
                            
                            break;
                        default:

                        break;
                   
                } 
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
                System.out.println("5. Voltar");
                
                escolha = Prompt.lerInteiro(); 
            
            }while (escolha != 5);
            
        }
        System.out.println();
        System.out.println("-------------------------");
        System.out.println("      MENU INICIAL"       );
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("Digite a opção desejada:");
        System.out.println();
    
        System.out.println("1.Eventos ");
        System.out.println("2.Reservas ");
        System.out.println("3. Encerrar");

        escolha = Prompt.lerInteiro();
    }while (escolha != 3);
    
        
       
 }
}
