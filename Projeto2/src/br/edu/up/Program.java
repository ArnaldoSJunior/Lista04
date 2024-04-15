package br.edu.up;
import br.edu.up.controllers.*;
import br.edu.up.models.*;
import br.edu.up.views.*;

public class Program {
    public static void main(String[] args) throws Exception {
        Ponto ponto1 = new Ponto();
        Ponto ponto2 = new Ponto(2.0, 5.0);
        PontoView view = new PontoView();
        PontoController controller = new PontoController(ponto1, ponto2, view);
        
        
    }
}
