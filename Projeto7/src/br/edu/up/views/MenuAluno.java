package br.edu.up.views;

import br.edu.up.Prompt;
import br.edu.up.controllers.*;
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
    System.out.println("3. Alterar aluno");
    System.out.println("4. Excluir Aluno ");
    System.out.println("5. Voltar para Menu Inicial");
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
            alterarAluno();
            break;
        case 4:
            excluirAluno();
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
  

}
