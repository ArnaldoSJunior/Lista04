package br.edu.up.views;

import br.edu.up.Prompt;
import br.edu.up.controllers.*;

public class Menu {

    ControleCliente ctrlCliente = new ControleCliente();

    public void mostrar() {

        System.out.println("----- MENU -----");
        System.out.println();
        System.out.println("1.Incluir cliente pessoa");
        System.out.println("2.Incluir cliente empresa");
        System.out.println("3.Mostrar dados cliente pessoa");
        System.out.println("4.Mostar dados cliente empresa");
        System.out.println("5.Emprestar para cliente pessoa");
        System.out.println("6.Emprestar para cliente empresa");
        System.out.println("7.Devolução de cliente pessoa ");
        System.out.println("8.Devolução de cliente empresa");
        System.out.println("9.Sair");
        System.out.println();

        int op = Prompt.lerInteiro();

        do {
            switch (op) {
                case 1:
                //String nome, String telefone, String email, double vlrMaxCredito, double vlrEmprestado, String cpf, double peso, double altura, String rua, String bairro, int numero, String cep, String nomeCidade, String uF
                    System.out.println("--- Inclir cliente pessoa ---");
                    String nome = Prompt.lerLinha("Digite o nome do cliente");
                    String telefone = Prompt.lerLinha("Digite a telefone: ");
                    String email = Prompt.lerLinha("Digite o email: ");
                    double vlrMaxCredito = Prompt.lerDecimal("Digite o valor máximo de crédito: ");
                    double vlrEmprestado = Prompt.lerDecimal("Digite o valor emprestado: ");
                    String cpf = Prompt.lerLinha("Digite o seu CPF: ");
                    double peso = Prompt.lerDecimal("Digite o seu peso: ");
                    double altura = Prompt.lerDecimal("Digite a sua altura: ");
                    System.out.println("\n\n--- Incluir endereço da pessoa ---");
                    String rua = Prompt.lerLinha("Digite a sua rua: ");
                    String bairro = Prompt.lerLinha("Digite o bairro: ");
                    int numero = Prompt.lerInteiro("Digite o número: ");
                    String cep = Prompt.lerLinha("Digite o CEP: ");
                    String nomeCidade = Prompt.lerLinha("Digite o nome da sua cidade: ");
                    String uf = Prompt.lerLinha("Digite a UF do estado: ");
                    if (ctrlCliente.adicionarClientePessoa(nome, telefone, email, vlrMaxCredito, vlrEmprestado, cpf, peso, altura, rua, bairro, numero, cep, nomeCidade, uf).equals("ok")) {
                        System.out.println("Cliente pessoa adicionado!!");
                    }else{
                        System.out.println("Falha ao adicionar cliente!!");
                    }
                case 2:
                   
                    break;
                case 3:
                   
                    break;
                case 4:
                   
                    break;
                case 5:
                   
                    break;
                case 6:
                    
                    break;
                case 7:
                   
                    break;
                case 8:
                   
                    break;
                case 9:
                    System.exit(0);
                    break;

                default:
                    break;
            }
            System.out.println("----- MENU -----");
            System.out.println();
            System.out.println("1.Incluir cliente pessoa");
            System.out.println("2.Incluir cliente empresa");
            System.out.println("3.Mostrar dados cliente pessoa");
            System.out.println("4.Mostar dados cliente empresa");
            System.out.println("5.Emprestar para cliente pessoa");
            System.out.println("6.Emprestar para cliente empresa");
            System.out.println("7.Devolução de cliente pessoa ");
            System.out.println("8.Devolução de cliente empresa");
            System.out.println("9.Sair");
            System.out.println();
    
            op = Prompt.lerInteiro();

        } while (op != 6);
    }

}
