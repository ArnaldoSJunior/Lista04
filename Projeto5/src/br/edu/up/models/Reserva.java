
package br.edu.up.models;
import javax.xml.crypto.Data;

public class Reserva {

   Evento eventos;
   private String nome;
   private int quantidadePessoas;
   private String dataReserva;
   private Double valorTotal;

   public Reserva(Evento eventos, String nome, int quantidadePessoas, String dataReserva) {
      this.eventos = eventos;
      this.nome = nome;
      this.quantidadePessoas = quantidadePessoas;
      this.dataReserva = dataReserva;
     
   }



}
