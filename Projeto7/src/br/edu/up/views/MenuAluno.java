package br.edu.up.views;

import br.edu.up.Prompt;
import br.edu.up.controllers.ControllerAluno;
import br.edu.up.db.Banco;

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
    System.out.println("3. Alterar");
    System.out.println("4. Excluir Aluno ");
    System.out.println("5. Voltar para menu inicial");
    System.out.println("6. Encerrar");


    op = Prompt.lerInteiro();
    
    switch (op) {
        case 1:
            registrarAluno();
            break;
        case 2:
        Banco.ctlrAluno.listarAlunos();
            break;
        case 3:
         //   alterarAluno();
            break;
        case 4:
          //  excluirAluno();
            break;
        case 5:
            menuInicial.mostrar();
            break;
        case 6:
            System.exit(0);
            break;
    
        default:
            break;
    
        }
    } while (op!=6);

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

  

}
