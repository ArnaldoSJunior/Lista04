package br.edu.up.views;

import javax.xml.crypto.Data;

import br.edu.up.Prompt;
import br.edu.up.controllers.*;


public class Menu {

    public void mostrar(){

        ControleEvento controllerEvento = new ControleEvento();
        Mensagem msg = new Mensagem();
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
   do {
    

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
                            System.out.println("-------------------------");
                            System.out.println("    MENU DE ALTERAÇÃO"    );
                            System.out.println("-------------------------");
                            System.out.println();
                            System.out.println("Digite oque deseja alterar:");
                            System.out.println();
                        
                            System.out.println("1. Nome");
                            System.out.println("2. Local");
                            System.out.println("3. Data");
                            System.out.println("4. Lotação Máxima");
                            System.out.println("5. Preço do Ingresso");
                            System.out.println("6. Voltar");
                            do {
                                escolha = Prompt.lerInteiro();
                                switch (escolha) {
                                    case 1:
                                        System.out.println("--- Alterar Nome ---");
                                        String nomeAntigo = Prompt.lerLinha("Digite o nome que deseja mudar: ");
                                        String nomeNovo = Prompt.lerLinha("Digite o nome novo: ");
                                        if (controllerEvento.alterarNomeEvento(nomeAntigo, nomeNovo).equals("null")) {
                                            msg.mensagem("Falha ao alterar nome do evento!!");
                                        }else{
                                            msg.mensagem("Nome do evento alterado com suscesso!!");
                                        }
                                        break;
                                    case 2:
                                        System.out.println("--- Alterar Local ---");
                                        String localAntigo = Prompt.lerLinha("Digite o local que deseja mudar: ");
                                        String localNovo = Prompt.lerLinha("Digite o local novo: ");
                                        if (controllerEvento.alterarLocalEvento(localAntigo, localNovo).equals("null")) {
                                            msg.mensagem("Falha ao alterar local do evento!!");
                                        }else{
                                            msg.mensagem("Local do evento alterado com suscesso!!");
                                        }
                                        break;
                                    case 3:
                                        System.out.println("--- Alterar Data ---");
                                        String dataAntigo = Prompt.lerLinha("Digite a data que deseja mudar: ");
                                        String dataNovo = Prompt.lerLinha("Digite a data novo: ");
                                        if (controllerEvento.alterarDataEvento(dataAntigo, dataNovo).equals("null")) {
                                            msg.mensagem("Falha ao alterar data do evento!!");
                                        }else{
                                            msg.mensagem("Data do evento alterado com suscesso!!");
                                        }
                                        break;
                                    case 4:
                                        System.out.println("--- Alterar Lotação ---");
                                        int lotacaoAntigo = Prompt.lerInteiro("Digite a lotação que deseja mudar: ");
                                        int lotacaoNovo = Prompt.lerInteiro("Digite a lotação novo: ");
                                        if (controllerEvento.alterarLotacaoEvento(lotacaoAntigo, lotacaoNovo).equals("null")) {
                                            msg.mensagem("Falha ao alterar lotação do evento!!");
                                        }else{
                                            msg.mensagem("Lotação do evento alterado com suscesso!!");
                                        }
                                        break;
                                    case 5:
                                        System.out.println("--- Alterar Preço do Ingresso ---");
                                        int precoAntigo = Prompt.lerInteiro("Digite o preço do ingresso que deseja mudar: ");
                                        int precoNovo = Prompt.lerInteiro("Digite o preço do ingresso novo: ");
                                        if (controllerEvento.alterarPrecoEvento(precoAntigo, precoNovo).equals("null")) {
                                            msg.mensagem("Falha ao alterar o preço do ingresso do evento!!");
                                        }else{
                                            msg.mensagem("Preço do ingresso do evento alterado com suscesso!!");
                                        }
                                        break;
                                    default:
                                        break;
                                }
                                System.out.println("-------------------------");
                                System.out.println("    MENU DE ALTERAÇÃO"    );
                                System.out.println("-------------------------");
                                System.out.println();
                                System.out.println("Digite oque deseja alterar:");
                                System.out.println();
                            
                                System.out.println("1. Nome");
                                System.out.println("2. Local");
                                System.out.println("3. Data");
                                System.out.println("4. Lotação Máxima");
                                System.out.println("5. Preço do Ingresso");
                                System.out.println("6. Voltar");
                            } while (escolha != 6);
                            
                            break;
                        case 3:
                            {System.out.println("--- Listagem dos Eventos ---");
                            msg.mensagem(controllerEvento.listagemDeEventos());
                            break;}
                            
                        case 4:
                            System.out.println("--- Excluir Evento ---");
                            nome = Prompt.lerLinha("Nome: ");
                            data = Prompt.lerLinha("Data: ");
                            local = Prompt.lerLinha("Local: ");
                            if (controllerEvento.excluirEvento(nome, data, local).equals("ok")) {
                                msg.mensagem("Evento excluído com suscesso!!");
                            }else{
                                msg.mensagem("Erro ao excluir evento!!");
                            }

                            
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
    
        System.out.println("1. Eventos ");
        System.out.println("2. Reservas ");
        System.out.println("3. Encerrar");

        escolha = Prompt.lerInteiro();
    }while (escolha != 3);
    
        
       
 }
}
