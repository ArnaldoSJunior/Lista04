package br.edu.up.views;

import br.edu.up.Prompt;
import br.edu.up.db.*;
import br.edu.up.models.Competencia;

public class MenuDisciplina {

    public void mostrarDisciplina() {
        Menu menuInicial = new Menu();
        int op;
        do {
            System.out.println();
            System.out.println("-------------------------");
            System.out.println("      MENU DISCIPLINA");
            System.out.println("-------------------------");
            System.out.println();
            System.out.println("Digite a opção desejada:");
            System.out.println();

            System.out.println("1. Registrar Disciplina");
            System.out.println("2. Listar Disciplinas");
            System.out.println("3. Alterar Disciplina");
            System.out.println("4. Excluir Disciplina");
            System.out.println("5. Voltar ao Menu Inicial");
            System.out.println("6. Encerrar");

            op = Prompt.lerInteiro();
            switch (op) {
                case 1:
                    registrarDisciplina();
                    break;
                case 2:
                    Banco.ctlrDisciplina.listarDisciplina();
                    break;
                case 3:
                    break;
                case 4:
                    excluirDisciplina();
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
        } while (op != 6);
    }

    public void registrarDisciplina() {
        System.out.println("--- Registrar Disciplina ---");

        int id = Prompt.lerInteiro("Id: ");
        String nome = Prompt.lerLinha("Nome: ");
        String curso = Prompt.lerLinha("Curso: ");

        int numCompetencias = Prompt.lerInteiro("Quantidade de competências: ");
        Competencia[] competencias = new Competencia[numCompetencias];
        for (int i = 0; i < numCompetencias; i++) {
            String tipo = Prompt.lerLinha("Tipo" + (i + 1) + ": ");
            String comp = Prompt.lerLinha("Competência " + (i + 1) + ": ");
            Competencia novaCompetencia = new Competencia(tipo, comp);
            novaCompetencia.setTipo(tipo);
            competencias[i] = novaCompetencia;

        }

        String resultado = Banco.ctlrDisciplina.registrarDisciplina(id, nome, curso, competencias);

        if (resultado.equals("ok")) {
            System.out.println("Disciplina registrada com sucesso!!");
        } else {
            System.out.println("Erro ao registrar disciplina: " + resultado);
        }
    }

    public String excluirDisciplina() {
        System.out.println("--- Excluir Disciplina ---");
        int id = Prompt.lerInteiro("Informa o Id da disciplina: ");
        String resultado = Banco.ctlrDisciplina.excluirDisciplina(id);
        if (resultado.equals("ok")) {
            System.out.println("Disciplina deletada!");
        } else if (resultado.equals("null")) {
            System.out.println("Disciplina näo encontrada!");
        } else {
            System.out.println("Disciplina deletada! " + resultado);
        }
        return "Excluida com sucesso!";
    }

}
