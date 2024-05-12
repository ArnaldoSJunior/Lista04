package br.edu.up.views;

import br.edu.up.Prompt;
import br.edu.up.db.Banco;

public class MenuProfessor {
    public void mostrarMenuProfessor(){

        
        System.out.println();
        System.out.println("-------------------------");
        System.out.println("      MENU PROFESSOR"     );
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("Digite a opção desejada:");
        System.out.println();

        System.out.println("1. Registrar Professor");
        System.out.println("2. Excluir Professor");
        System.out.println("3. Voltar para menu inicial");
        System.out.println("4. Encerrar");
        int op = Prompt.lerInteiro();
        do {
            switch (op) {
                case 1:
                    System.out.println("--- Registrar Professor ---");
                    // String nome, int rg, int matricula, int numCurriculo, String titulacao
                    String nome = Prompt.lerLinha("Digite o nome do professor: ");
                    int rg = Prompt.lerInteiro("Digite o RG do professor: ");
                    int matricula = Prompt.lerInteiro("Digite a matrícula: ");
                    int numCurriculo = Prompt.lerInteiro("Digite o número da matrícula: ");
                    String titulacao = Prompt.lerLinha("Digite a sua titulação: ");
                    if (Banco.ctlrProfessor.registrarProfessor(nome, rg, matricula, numCurriculo, titulacao).equals("ok")) {
                        System.out.println("Professor cadastrado com suscesso!!");

                        System.out.println("--- Registrar Currículo ---");
                        // String nomeInstituicao, int anoDeConclusao, String tituloObtido, String trabalhoDeConclusao
                        String nomeInstituicao = Prompt.lerLinha("Digite o nome da Instituição: ");
                        int anoDeConclusao = Prompt.lerInteiro("Digite o ano de conclusão: ");
                        String tituloObtido = Prompt.lerLinha("Digite o título obtido: ");
                        String trabalhoDeConclusao = Prompt.lerLinha("Digite o trabalho de conclusão: ");
                        String res = Banco.ctlrProfessor.registrarCurriculo(matricula, nomeInstituicao, anoDeConclusao, tituloObtido, trabalhoDeConclusao);
                        System.out.println("Currículo registrado com suscesso!!");
                            System.out.println(res);

                    }else{
                        System.out.println("Falha ao cadastar professor!!");
                    }
                    break;
                    case 2:
                        System.out.println("--- Excluir Professor ---");
                        matricula = Prompt.lerInteiro("Digite o número da matrrícula do professor que deseja excluir: ");
                        if (Banco.ctlrProfessor.excluirProfessor(matricula).equals("ok")) {
                            System.out.println("Professor");
                        }
                    break;
                default:
                    break;
            }
            System.out.println();
            System.out.println("-------------------------");
            System.out.println("      MENU PROFESSOR"     );
            System.out.println("-------------------------");
            System.out.println();
            System.out.println("Digite a opção desejada:");
            System.out.println();
    
            System.out.println("1. Registrar Professor");
            System.out.println("2. Excluir Professor");
            System.out.println("3. Voltar para menu inicial");
            System.out.println("4. Encerrar");
            op = Prompt.lerInteiro();
                    
        } while (op!=3);
        
    }
}
