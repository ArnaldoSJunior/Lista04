package br.edu.up;
import br.edu.up.models.*;
import br.edu.up.views.DiaView;

public class Program {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Ano ano = new Ano(2024);
        ano.addCompromisso(12, 11, 9, "Miguel Viapiana", "São Roque", "Nascimento do Miguel");
    }
}
