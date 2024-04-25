package br.edu.up.models;

public class Estacionamento {

    private Vaga[] vagas;
    private int cont;
    private int totalVagas = 10;


    public Estacionamento() {
        this.vagas = new Vaga[totalVagas];
        incializarVagas();
    }
    public void incializarVagas(){
        vagas[0] = new Vaga(1);
        vagas[1] = new Vaga(2);
        vagas[2] = new Vaga(3);
        vagas[3] = new Vaga(4);
        vagas[4] = new Vaga(5);
        vagas[5] = new Vaga(6);
        vagas[6] = new Vaga(7);
        vagas[7] = new Vaga(8);
        vagas[8] = new Vaga(9);
        vagas[9] = new Vaga(10);
    }

    public int vagasDisponiveis(){
        int cont = 0; // Inicialize o contador dentro do método
        for(Vaga vaga : vagas){
            if(vaga != null && !vaga.ocupada()){ // Verifique se a vaga não é nula antes de verificar se está ocupada
                cont++;
            }
        }
        return cont;
    }
    public Vaga getVagas(int i) {
        return vagas[i];
    }
    public int getTotalVagas() {
        return totalVagas;
    }
    

    
}
