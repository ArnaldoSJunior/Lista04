package br.edu.up.views;

import br.edu.up.Prompt;
import br.edu.up.db.Banco;
import br.edu.up.views.Menu;

public class MenuProfessor {
    
    public void mostrarMenuProfessor(){
        Menu menuInicial =  new Menu();
        
        System.out.println();
        System.out.println("-------------------------");
        System.out.println("      MENU PROFESSOR"     );
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("Digite a opção desejada:");
        System.out.println();

        System.out.println("1. Registrar Professor");
        System.out.println("2. Excluir Professor");
        System.out.println("3. Listar Professores");
        System.out.println("4. Alterar Professor");
        System.out.println("5. Voltar para menu inicial");
        System.out.println("6. Encerrar");
        int op = Prompt.lerInteiro();
        do {
            switch (op) {
                case 1:
                    System.out.println("--- Registrar Professor ---");
                    // String nome, int rg, int matricula, int numCurriculo, String titulacao
                    String nome = Prompt.lerLinha("Digite o nome do professor: ");
                    int rg = Prompt.lerInteiro("Digite o RG do professor: ");
                    int matricula = Prompt.lerInteiro("Digite a matrícula: ");
                    String titulacao = Prompt.lerLinha("Digite a sua titulação: ");
                    if (Banco.ctlrProfessor.registrarProfessor(nome, rg, matricula, titulacao).equals("ok")) {
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
                            System.out.println("Professor excluído com suscesso!!");
                        }
                    break;
                    case 3:
                        System.out.println("--- Listagem dos professores ---");
                        System.out.println(Banco.ctlrProfessor.listarProfessores());
                    break;
                    case 4:
                        System.out.println();
                        System.out.println("----------------------------------");
                        System.out.println("  MENU DE ALTERAÇÃO DE PROFESSOR"  );
                        System.out.println("----------------------------------");
                        System.out.println();
                        System.out.println("Digite a opção desejada:");
                        System.out.println();
                
                        System.out.println("1. Nome");
                        System.out.println("2. Rg");
                        System.out.println("3. Matrícula");
                        System.out.println("4. Titulação");
                        System.out.println("5. Voltar Menu");
                        System.out.println("6. Encerrar");
                        op = Prompt.lerInteiro();
                        do {
                            switch (op) {
                                case 1:
                                    System.out.println("--- Alterar Nome ---");
                                    String nomeAntigo = Prompt.lerLinha("Digite o nome antigo do professor: ");
                                    String nomeNovo = Prompt.lerLinha("Digite o nome novo do professor: ");
                                    if (Banco.ctlrProfessor.alterarNome(nomeAntigo, nomeNovo).equals("ok")) {
                                        System.out.println("Nome alterado com suscesso!!");
                                    }else{
                                        System.out.println("Falha ao alterar nome!!");
                                    }
                                    break;
                                case 2:
                                    System.out.println("--- Alterar Rg ---");
                                    int rgAntigo = Prompt.lerInteiro("Digite o RG antigo do professor: ");
                                    int rgNovo = Prompt.lerInteiro("Digite o RG novo: ");
                                    if (Banco.ctlrProfessor.alterarRg(rgAntigo, rgNovo).equals("ok")) {
                                        System.out.println("RG alterado com suscesso!!");
                                    }else{
                                        System.out.println("Falha ao alterar RG!!");
                                    }
                                break;
                                case 3: 
                                    System.out.println("--- Alterar Matícula ---");
                                    int matriculaAntiga = Prompt.lerInteiro("Digite a matrícula nova do professor: ");
                                    int matriculaNova = Prompt.lerInteiro("Digite a matrpicula nova: ");
                                    if (Banco.ctlrProfessor.alterarMatricula(matriculaAntiga, matriculaNova).equals("ok")) {
                                        System.out.println("Matrícula alterada com suscesso!!");
                                    }else{
                                        System.out.println("Falha ao alterar a matrícula!!");
                                    }
                                break;
                                case 4:
                                    System.out.println("--- Alterar a Titulação ---");
                                    String titulacaoAntiga = Prompt.lerLinha("Digite a titulação antiga: ");
                                    String tirulacaoNova = Prompt.lerLinha("Digite a titulação nova: ");
                                    if (Banco.ctlrProfessor.alterarTitulção(titulacaoAntiga, tirulacaoNova).equals("ok")) {
                                        System.out.println("Titulação alterada com suscesso!!");
                                    }else{
                                        System.out.println("Falha ao alterar titulação!!");
                                    }
                                break;
                                case 5:
                                    menuInicial.mostrar();
                                break;
                            
                                default:
                                System.out.println("Opção inválida!!");
                                    break;
                                
                                
                            }
                            System.out.println();
                            System.out.println("----------------------------------");
                            System.out.println("  MENU DE ALTERAÇÃO DE PROFESSOR"  );
                            System.out.println("----------------------------------");
                            System.out.println();
                            System.out.println("Digite a opção desejada:");
                            System.out.println();
                    
                            System.out.println("1. Nome");
                            System.out.println("2. Rg");
                            System.out.println("3. Matrícula");
                            System.out.println("4. Titulação");
                            System.out.println("5. Voltar Menu");
                            System.out.println("6. Encerrar");
                            op = Prompt.lerInteiro();
                        } while (op != 6);
                        System.exit(0);
                    case 5:
                    menuInicial.mostrar();
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
            System.out.println("3. Listar Professores");
            System.out.println("4. Alterar Professor");
            System.out.println("5. Voltar para menu inicial");
            System.out.println("6. Encerrar");
            op = Prompt.lerInteiro();
                    
        } while (op!=6);
        System.exit(0);
        
    }
}
