package br.edu.up;
import br.edu.up.models.*;
import br.edu.up.views.DiaView;

public class Program {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
       // Mes mes = new Mes (28, "Fevereiro");
       // mes.addCompromisso(11, 5, "Migas", "Casa", "Dormir");
        //mes.addCompromisso(11, 6, "Migas", "Casa", "Dormir");
        //mes.addCompromisso(12, 16, "Migas", "Casa", "Jogar");
        
       // mes.listarTodosCompromissos();


        Ano ano = new Ano(2024);
        ano.addCompromisso(1, 11, 15, "Migas", "Casa", "Dormir");
        ano.addCompromisso(1, 11, 20, "Migas", "Casa", "Dormir");
        ano.addCompromisso(1, 12, 15, "Migas", "Casa", "Dormir");
        ano.addCompromisso(1, 12, 19, "Migas", "Casa", "Dormir");
        ano.addCompromisso(3, 12, 16, "Migas", "Casa", "Jogar");
        ano.addCompromisso(3, 18, 16, "Migas", "Casa", "Jogar");
        System.out.println("--- Lista ---\n");
        ano .listarCompromissosAgendados();

        ano.removerCompromisso(1, 11, 15);
        System.out.println("--- Lista --- \n");
        ano .listarCompromissosAgendados();

        System.out.println("--- Lista Mês Específico ---");
        ano.listarCompromissosAgendadosMes(3);

        
       
        

    }
}
