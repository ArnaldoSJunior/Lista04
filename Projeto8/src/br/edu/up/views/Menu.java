package br.edu.up.views;

import br.edu.up.controllers.*;
import br.edu.up.Prompt;

public class Menu {

    public void mostrar() {

        System.out.println("================Menu================");
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

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        } while (op != 6);
    }

    public void incluirPessoal() {
        System.out.println("Informe os dados");
        int cod = Prompt.lerInteiro("Código:");
        String nome = Prompt.lerLinha("Nome:");
        String telefone = Prompt.lerLinha("Telefone:");
        String aniversario = Prompt.lerLinha("Aniversário:");
    }

    public void incluirComercial() {
        System.out.println("Informe os dados");
        int cod = Prompt.lerInteiro("Código:");
        String nome = Prompt.lerLinha("Nome:");
        String telefone = Prompt.lerLinha("Telefone:");
        String cnpj = Prompt.lerLinha("CNPJ:");
    }

}
