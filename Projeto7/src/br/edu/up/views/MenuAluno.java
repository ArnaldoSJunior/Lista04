package br.edu.up.views;

import br.edu.up.Prompt;
import br.edu.up.controllers.*;
import br.edu.up.db.Banco;
import br.edu.up.models.Aluno;
import br.edu.up.models.Disciplina;

public class MenuAluno {

    public void mostrarMenuAluno(){
        
        Menu menuInicial = new Menu();
        int op;
        do {
            System.out.println();
            System.out.println("-------------------------");
            System.out.println("      MENU Aluno"         );
            System.out.println("-------------------------");
            System.out.println();
            System.out.println("Digite a opção desejada:");
            System.out.println();

            System.out.println("1. Registrar Aluno");
            System.out.println("2. Listar Alunos ");
            System.out.println("3. Alterar aluno");
            System.out.println("4. Excluir Aluno ");
            System.out.println("5. Menu Notas");
            System.out.println("6. Voltar para Menu Inicial");
            System.out.println("7. Encerrar");


            op = Prompt.lerInteiro();
            
            switch (op) {
                case 1:
                    registrarAluno();
                    break;
                case 2:
                    Banco.ctlrAluno.listarAlunos();
                    break;
                case 3:
                    alterarAluno();
                    break;
                case 4:
                    excluirAluno();
                    break;
                case 5:
                    menuNotas();
                    break;
                case 6:
                    menuInicial.mostrar();
                    break;
                case 7:
                    System.exit(0);
                break;
            
                default:
                    break;
            
            }
        } while (op!=7);

    }

    public String registrarAluno(){

        System.out.println("=====Registrar Aluno=========");
     
        String nome = Prompt.lerLinha("Nome: ");
        int rg = Prompt.lerInteiro("RG: ");
        int matricula = Prompt.lerInteiro("Matrícula: ");
        String curso = Prompt.lerLinha("Curso: ");
        String turno = Prompt.lerLinha("Turno: ");
        int anoDeIngresso = Prompt.lerInteiro("Ano de ingresso: ");
        String resultado = Banco.ctlrAluno.registrarAluno(nome, rg, matricula, curso, turno, anoDeIngresso);
        if(resultado.equals("ok"))
        {
            System.out.println("Aluno cadastrado com sucesso!!");
        }else{
            System.out.println("Erro ao cadastrar!!" + resultado);
        }
        return resultado;
    }

    public String alterarAluno() {
        System.out.println("=====Alterar Aluno=========");
        int matricula = Prompt.lerInteiro("Informe o número de matrícula: ");
        
        System.out.println("Qual atributo deseja alterar? (nome, rg, curso, turno, anoDeIngresso)");
        String atributo = Prompt.lerLinha("Informe o atributo: ");

        Object novoValor = null;
        switch (atributo.toLowerCase()) {
            case "nome":
                novoValor = Prompt.lerLinha("Informe o novo nome: ");
                break;
            case "rg":
                novoValor = Prompt.lerInteiro("Informe o novo RG: ");
                break;
            case "curso":
                novoValor = Prompt.lerLinha("Informe o novo curso: ");
                break;
            case "turno":
                novoValor = Prompt.lerLinha("Informe o novo turno: ");
                break;
            case "anodeingresso":
                novoValor = Prompt.lerInteiro("Informe o novo ano de ingresso: ");
                break;
            default:
                System.out.println("Atributo inválido.");
                return atributo;
        }
        String resultado = Banco.ctlrAluno.alterarAluno(matricula, atributo, novoValor);
        return resultado;
    }


    public String excluirAluno(){
        System.out.println("--- Excluir Aluno ---");
        int matricula = Prompt.lerInteiro("Informa número de matrícula: ");
        String resultado = Banco.ctlrAluno.excluirAluno(matricula);
        if(resultado.equals("ok")){
            System.out.println("Aluno deletado!");
        }else if(resultado.equals("null")){
            System.out.println("Aluno näo encontrado!");
        }else{
            System.out.println("Aluno deletado! " + resultado); 
        }
        return "Excluido com sucesso!";
    }

    public void menuNotas(){
        Menu menuInicial = new Menu();
        System.out.println();
        System.out.println("-------------------------");
        System.out.println("     MENU NOTAS ALUNO"    );
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("Digite a opção desejada:");
        System.out.println();

        System.out.println("1. Lançar as notas");
        System.out.println("2. Listar situação de alunos ");
        System.out.println("3. Voltar para Menu Inicial");
        System.out.println("4. Encerrar");

        int op = Prompt.lerInteiro();
        do {
            switch (op) {
                case 1:

                    System.out.println("--- Lançar notas de alunos ---");
                    for (Disciplina disciplina : Banco.ctlrDisciplina.getDisciplinas()) {
                        // Verifica se a disciplina não é nula
                        if (disciplina != null) {
                            // Iterar sobre os alunos da disciplina
                            for (Aluno aluno : disciplina.getAlunos()) {
                                // Verifica se o aluno não é nulo
                                if (aluno != null) {
                                    System.out.println("Matrícula do aluno: " + aluno.getMatricula());
                    
                                    int cont = 0;
                    
                                    // Verifica se as competências não são nulas e se há competências
                                    if (disciplina.getCompetencias() != null) {
                                        // Iterar sobre as competências da disciplina
                                        for (int k = 0; k < disciplina.getCompetencias().length; k++) {
                                            System.out.println("Competência " + (k + 1) + ": ");
                                            System.out.println("Aprovado na competência? (S/N)");
                                            String opcao = Prompt.lerLinha();
                                            if (opcao.equals("S")) {
                                                cont++;
                                            }
                                        }
                                    } else {
                                        System.out.println("A disciplina não possui competências.");
                                    }
                    
                                    // Definir a situação do aluno
                                    if (disciplina.getCompetencias() != null) {
                                        if (cont == disciplina.getCompetencias().length) {
                                            aluno.setSituacao("Aprovado");
                                        } else if (cont <= (disciplina.getCompetencias().length) / 2) {
                                            aluno.setSituacao("Reprovado");
                                        }
                                    } else {
                                        System.out.println("Não foi possível definir a situação do aluno: competências não encontradas.");
                                    }
                                } else {
                                    System.out.print("");
                                }
                            }
                        } else {
                            System.out.print("");
                        }
                    }
                    
                    
                    break;
                    case 2:
                        for(int i=0; i < Banco.ctlrAluno.getAlunos().length; i++){
                            if (Banco.ctlrAluno.getAlunos(i)!= null) {
                                System.out.println("Nome: "+ Banco.ctlrAluno.getAlunos(i).getNome());
                                System.out.println("Matrícula: "+Banco.ctlrAluno.getAlunos(i).getMatricula());
                                System.out.println("Situação: "+Banco.ctlrAluno.getAlunos(i).getSituacao()+"\n");
                            }
                        }
                    break;
                    case 3:
                    menuInicial.mostrar();
                    break;
                default:
                    break;
            }
            System.out.println();
            System.out.println("-------------------------");
            System.out.println("     MENU NOTAS ALUNO"    );
            System.out.println("-------------------------");
            System.out.println();
            System.out.println("Digite a opção desejada:");
            System.out.println();

            System.out.println("1. Lançar as notas");
            System.out.println("2. Listar situação de alunos ");
            System.out.println("3. Voltar para Menu Inicial");
            System.out.println("4. Encerrar");

            op = Prompt.lerInteiro();
        } while (op != 4);
        System.exit(0);

    }

}
