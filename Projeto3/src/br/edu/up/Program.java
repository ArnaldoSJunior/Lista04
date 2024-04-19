package br.edu.up;
import br.edu.up.models.*;
import br.edu.up.views.DiaView;

public class Program {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Mes mes = new Mes (28, "Fevereiro");
        mes.addCompromisso(11, 15, "Migas", "Casa", "Dormir");
        mes.consultarCompromisso(11,15);
        mes.removerCompromisso(11, 16);
        mes.consultarCompromisso(11,15);


    }
}
