package br.edu.up.controllers;
import br.edu.up.models.*;
import br.edu.up.views.*;

public class PontoController {
    private Ponto ponto1;
    private Ponto ponto2;
    private PontoView view;

    public PontoController(Ponto ponto1, Ponto ponto2, PontoView view){
        this.ponto1 = ponto1;
        this.ponto2 = ponto2;
        this.view = view;
    }

    public void executarPrograma(){
        double distanciaPonto1Ponto2 = ponto1.calcularDistancia(ponto2);

        Ponto destino = new Ponto(7.0, 2.0);
        double distanciaPonto2Destino = ponto2.calcularDistancia(destino);

        view.exebirDistancias(distanciaPonto1Ponto2, distanciaPonto2Destino);

        ponto1.setX(10.0);

        ponto1.setY(3.0);

    }
}
