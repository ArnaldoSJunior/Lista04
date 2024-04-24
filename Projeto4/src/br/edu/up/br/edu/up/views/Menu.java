package br.edu.up.views;

import br.edu.up.Prompt;
import br.edu.up.models.Carro;
import br.edu.up.models.Estacionamento;
public class Menu {
   
    public void mostrar(){
   
    
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
            case 1:{
                mostrarVagasDisponiveis();
                }
                 break;
            case 2:{
                Prompt.lerDecimal("Digite o modelo: ");
                Prompt.lerDecimal("Digite a placa : ");
                Prompt.lerDecimal("Digite a cor: ");
                }
                 break;
            case 3:{
                Prompt.lerDecimal("Digite a placa : ");
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
                        
                            break;
                        case 2:
                        
                             break;
                        case 3:
                        
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
    } while (opcao != 5);
    }
     public void mostrarVagasDisponiveis(){
       Estacionamento novo = new Estacionamento();
       novo.vagasDisponiveis();
       System.out.println("Vagas: " + novo.vagasDisponiveis());
     }

     
     
}


