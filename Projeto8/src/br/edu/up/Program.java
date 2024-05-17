package br.edu.up;

import br.edu.up.controllers.ControleAgenda;

public class Program {
    public static void main(String[] args) {
        ControleAgenda ctrlAgenda = new ControleAgenda();

        ctrlAgenda.incluirContatoPessoal(11, "migas", "41997786784", "09608709970");
    }
}
