package br.edu.up.views;

import br.edu.up.Prompt;
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
        switch (opcao) {
            case 1:{
                    mostrarVagasDisponiveis();
                }
                 break;
            case 2:{
    
                }
                 break;
            case 3:{
    
            }break;
            case 4:{
    
            }break;
            default:
                break;
        }
    
    }
     public void mostrarVagasDisponiveis(){
        Estacionamento novo = new Estacionamento();
       novo.vagasDisponiveis();
       System.out.println("Vagas: " + novo.vagasDisponiveis());
     }
}


