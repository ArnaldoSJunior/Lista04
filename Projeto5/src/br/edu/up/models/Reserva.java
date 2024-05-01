package br.edu.up.models;
import javax.xml.crypto.Data;

public class Reserva {

   Evento[] eventos;
   private String nome;
   private int quantidadePessoas;
   private String dataReserva;
   private Double valorTotal;

   public Reserva(String nome, int quantidadePessoas, String dataReserva) {
      this.nome = nome;
      this.quantidadePessoas = quantidadePessoas;
      this.dataReserva = dataReserva;
   }

   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public int getQuantidadePessoas() {
      return quantidadePessoas;
   }

   public void setQuantidadePessoas(int quantidadePessoas) {
      this.quantidadePessoas = quantidadePessoas;
   }

   public String getDataReserva() {
      return dataReserva;
   }

   public void setDataReserva(String dataReserva) {
      this.dataReserva = dataReserva;
   }

   public Double getValorTotal() {
      return valorTotal;
   }

   public void setValorTotal(Double valorTotal) {
      this.valorTotal = valorTotal;
   }
   

   


}
