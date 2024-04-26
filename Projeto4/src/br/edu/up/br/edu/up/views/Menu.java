package br.edu.up.views;

import br.edu.up.Prompt;
import br.edu.up.controllers.EstacionamentoController;
import br.edu.up.models.Carro;
import br.edu.up.models.Estacionamento;
public class Menu {
    EstacionamentoController controller = new EstacionamentoController();
    Mensagem msg = new Mensagem();
   
    public void mostrar(){
        Estacionamento est = new Estacionamento();
   
    
        System.out.println();
        System.out.println("-------------------------");
        System.out.println("      MENU INICIAL"       );
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("Digite a opção desejada:");
        System.out.println();
    
        System.out.println("1. Verificar vagas disponíveis");
        System.out.println("2. Registrar entrada");
        System.out.println("3. Registrar saída");
        System.out.println("4. Emitir relatório");
        System.out.println();
    
        int opcao = Prompt.lerInteiro();
        do {
        switch (opcao) {
            case 1:
                int vagasDisponiveis = controller.contarVagasDisponiveis();
                System.out.println("Vagas: " + vagasDisponiveis);

                break; 
            case 2:{
                String modelo = Prompt.lerLinha("Digite o modelo: ");
                String placa = Prompt.lerLinha("Digite a placa : ");
                String cor = Prompt.lerLinha("Digite a cor: ");
                if (!controller.registrarEntrada(placa, modelo, cor).equals("null")) {
                    msg.mensagem("Carro estacionado na vaga: "+ controller.consultarVaga(placa) );
                }else{
                    msg.mensagem("Vaga já ocupada ou dados inseridos incorretamente!!");
                }

                }
                 break;
            case 3:{
                String placa = Prompt.lerLinha("Digite a placa : ");
                if (controller.registarSaida(placa).equals("OK")){
                    msg.mensagem("Registro de saída realizado!!");
                }else{
                    msg.mensagem("Placa não encontrada ou erro de digitação");
                }
            }break;
            case 4:{
                System.out.println("Escolha o período: ");
                System.out.println("1. Manhã");
                System.out.println("2. Tarde");
                System.out.println("3. Noite");
                System.out.println("4. Retornar ao Menu principal");

                int emitir = Prompt.lerInteiro();
                    switch (emitir) {
                        case 1:
                        controller.finalizarPeriodo();
                        System.out.println("------------ Relatório --------------");
                        System.out.println("Quantidade de entradas: " + controller.getContEntrada());
                        System.out.println("Total: R$" + controller.finalizarPeriodo());
                        controller.setContEntrada(0);
                        controller.carrosSegundoPeriodo();
                        
                            break;
                        case 2:
                        controller.finalizarPeriodo();
                        System.out.println("------------ Relatório --------------");
                        System.out.println("Carros em segundo período: "+ controller.getCarrosSegundoPeriodo());
                        System.out.println("Quantidade de entradas: " + controller.getContEntrada());
                        System.out.println("Total: R$" + controller.finalizarPeriodoTarde());
                             break;
                        case 3:
                        controller.finalizarPeriodo();
                        System.out.println("------------ Relatório --------------");
                        System.out.println("Quantidade de entradas: " + controller.getContEntrada());
                        System.out.println("Total: R$" + controller.finalizarPeriodo());
                             break;
                        case 4:{
                         mostrar();
                        }
                            break;
                
                    default:
                        break;
                }
    
            }break;
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
    
        System.out.println("1. Verificar vagas disponíveis");
        System.out.println("2. Registrar entrada");
        System.out.println("3. Registrar saída");
        System.out.println("4. Emitir relatório");
        System.out.println();
    
        opcao = Prompt.lerInteiro();
    } while (opcao != 5);
    }

     
     
}


