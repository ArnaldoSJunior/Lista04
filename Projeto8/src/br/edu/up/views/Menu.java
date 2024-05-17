package br.edu.up.views;

import br.edu.up.controllers.*;
import br.edu.up.Prompt;

public class Menu {
    ControleAgenda ctrlAgenda = new ControleAgenda();


    public void mostrar() {

        System.out.println("----- MENU -----");
        System.out.println();
        System.out.println("1.Incluir contato pessoal");
        System.out.println("2.Incluir contato comercial");
        System.out.println("3.Excluir um contato pelo código");
        System.out.println("4.Consultar um contato pelo código");
        System.out.println("5.Listar todos os contatos");
        System.out.println("6.Sair do programa ");
        System.out.println();

        int op = Prompt.lerInteiro();

        do {
            switch (op) {
                case 1:
                    incluirPessoal();
                    break;
                case 2:
                    incluirComercial();
                    break;
                case 3:
                    excluirContato();
                    break;
                case 4:

                    break;
                case 5:
                    System.out.println(ctrlAgenda.listarContatos());
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    break;
            }
            System.out.println("----- MENU -----");
            System.out.println();
            System.out.println("1.Incluir contato pessoal");
            System.out.println("2.Incluir contato comercial");
            System.out.println("3.Excluir um contato pelo código");
            System.out.println("4.Consultar um contato pelo código");
            System.out.println("5.Listar todos os contatos");
            System.out.println("6.Sair do programa ");
            System.out.println();
    
            op = Prompt.lerInteiro();

        } while (op != 6);
    }

    public void incluirPessoal() {
        System.out.println("Informe os dados");
        int cod = Prompt.lerInteiro("Código:");
        String nome = Prompt.lerLinha("Nome:");
        String telefone = Prompt.lerLinha("Telefone:");
        String aniversario = Prompt.lerLinha("Aniversário:");
        if (ctrlAgenda.incluirContatoPessoal(cod, nome, telefone, aniversario).equals("ok")) {
            System.out.println("Contato Pessoal adicionado com suscesso!!");
        }else{
            System.out.println("Falha ao adicionar contato!!");
        }
        
    }

    public void incluirComercial() {
        System.out.println("Informe os dados");
        int cod = Prompt.lerInteiro("Código:");
        String nome = Prompt.lerLinha("Nome:");
        String telefone = Prompt.lerLinha("Telefone:");
        String cnpj = Prompt.lerLinha("CNPJ:");
        if (ctrlAgenda.incluirContatoComercial(cod, nome, telefone, cnpj).equals("ok")) {
            System.out.println("Contato Pessoal adicionado com suscesso!!");
        }else{
            System.out.println("Falha ao adicionar contato!!");
        }
    }

    public void excluirContato(){
        System.out.println("Informe o código do contato que deseja excluir: ");
        int cod = Prompt.lerInteiro();
        if (ctrlAgenda.removerContato(cod).equals("ok")) {
            System.out.println("Contato removido com suscesso!!");
        }else{
            System.out.println("Falha ao remover contato!!");
        }
    }

}
