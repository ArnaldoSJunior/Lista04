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
                    System.out.println("--- Inclir cliente pessoa ---");
                    String nome = Prompt.lerLinha("Digite o nome do cliente");
                    String telefone = Prompt.lerLinha("Digite a telefone: ");
                    String email = Prompt.lerLinha("Digite o email: ");
                    double vlrMaxCredito = Prompt.lerDecimal("Digite o valor máximo de crédito: ");
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
                    if (ctrlCliente.adicionarClientePessoa(nome, telefone, email, vlrMaxCredito, cpf, peso, altura, rua, bairro, numero, cep, nomeCidade, uf).equals("ok")) {
                        System.out.println("Cliente pessoa adicionado!!");
                    }else{
                        System.out.println("Falha ao adicionar cliente!!");
                    }
                break;
                case 2:
                    System.out.println("--- Inclir cliente empresa ---");
                    nome = Prompt.lerLinha("Digite o nome da empresa");
                    telefone = Prompt.lerLinha("Digite a telefone: ");
                    email = Prompt.lerLinha("Digite o email: ");
                    vlrMaxCredito = Prompt.lerDecimal("Digite o valor máximo de crédito: ");
                    String cnpj = Prompt.lerLinha("Digite o CNPJ da empresa: ");
                    String inscEstadual = Prompt.lerLinha("Digite a inscrição estadual: ");
                    int anoFundacao = Prompt.lerInteiro("Digite o ano de fundação da empresa: ");
                    if (ctrlCliente.adicionarClienteEmpresa(nome, telefone, email, vlrMaxCredito, cnpj, inscEstadual, anoFundacao).equals("ok")) {
                        System.out.println("Cliente empresa registrado com suscesso!!");
                    }else{
                        System.out.println("Falha ao cadastrar cliente!!");
                    }
                    break;
                case 3:
                    System.out.println(ctrlCliente.listarClientesPessoas());
                    break;
                case 4:
                    System.out.println(ctrlCliente.listarClientesEmpresa());
                    break;
                case 5:
                    System.out.println("--- Emprestimo para Cliente Pessoa ---");
                    cpf = Prompt.lerLinha("Digite o CPF do cliente: ");
                    double vlrEmprestado = Prompt.lerDecimal("Digite o valor desejado para o empréstimo: ");
                    if (ctrlCliente.emprestarClientePessoa(vlrEmprestado, cpf).equals("ok")) {
                            System.out.println("Valor emprestado com suscesso!!");
                    }else{
                        System.out.println("Falha ao emprestar, CPF inválido ou limite de crédito atingido!!");
                    }
                    break;
                case 6:
                    System.out.println("--- Emprréstimo para Clinte Empresa ---");
                    cnpj = Prompt.lerLinha("Digite o CNPJ da empresa: ");
                    vlrEmprestado = Prompt.lerDecimal("Digite o valor desejado para o empréstimo: ");
                    if (ctrlCliente.emprestarClienteEmpresa(vlrEmprestado, cnpj).equals("ok")) {
                        System.out.println("Valor emprestado com suscesso!!");
                    }else{
                        System.out.println("Falha ao emprestar, CNPJ inválido ou limite de crédito atingido!!");
                    }
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

        } while (op != 9);
    }

}
