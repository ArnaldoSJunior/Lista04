package br.edu.up;
import br.edu.up.models.*;
public class App {
    public static void main(String[] args)  {
      Estacionamento estacionar = new Estacionamento(10);
      estacionar.vagasDisponiveis();


      System.out.println("Vagas disponíveis" + estacionar.vagasDisponiveis());
    }
}
