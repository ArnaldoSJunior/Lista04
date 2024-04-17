package br.edu.up;
import br.edu.up.models.*;
import br.edu.up.views.DiaView;

public class Program {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Mes fev = new Mes(29, "Fevereiro");
        fev.addCompromisso(12, 10, "Migas", "Universidade Positivo", "Prova de JAVA");
        fev.addCompromisso(12, 10, "Migas", "Universidade Positivo", "Prova de JAVA");
    }
}
