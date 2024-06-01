package br.edu.up.views;
import br.edu.up.Prompt;
import br.edu.up.controller.ControllerSeguro;
import br.edu.up.models.Seguro;

public class MenuPrincipal {

    ControllerSeguro ctrlSeguro = new ControllerSeguro();

    public void mostrar(){
        System.out.println("----- MENU -----");
        System.out.println();
        System.out.println("1. Incluir Seguro");
        System.out.println("2. Localizar seguro");
        System.out.println("3. Excluir seguro");
        System.out.println("4. Excluir todos os seguros");
        System.out.println("5. Listar todos os seguros");
        System.out.println("6. Ver quantidade de seguros");
        System.out.println("7. Sair");

        int op = Prompt.lerInteiro();
       
        do {
             switch (op) {
                case 1:
                
                     Prompt.imprimir("Tipo de seguro?");
                     int escolha=  Prompt.lerInteiro(" 1.Seguro de vida \n 2.Seguro veiculo \n 3.Voltar");
                         if(escolha == 1){
                             incluirSegVida();
                             
                        }else if(escolha == 2){
                             incluirSeguroV();
                           
                        }else if(escolha == 3){
                             mostrar();
                        }
                             break;
                case 2:
                     localizarSeg();
                break;
                case 3:
                System.out.println("--- Excluir Seguro ---");
                String apolice = Prompt.lerLinha("Digite a apólice do seguro: ");
                if (ctrlSeguro.excluirSeguro(apolice).equals("ok")) {
                    System.out.println("Seguro excluido com sucesso!!");
                }else{
                    System.out.println("Falha ao excluir seguro!!");
                }
                break;
                case 4:
               ctrlSeguro.excluirTodosSeguros();
                      break;
                case 5:
                    System.out.println(ctrlSeguro.listarSeguros());
                break;
                case 6:
                int quantidadeSeguros = ctrlSeguro.obterQuantidadeSeguros();
                System.out.println("Quantidade de seguros: " + quantidadeSeguros);
                break;
                case 7:
                    System.exit(0);
                break;
            
                default:
                    break;
            }
            mostrar();

            op = Prompt.lerInteiro();
    } while (op != 7);

    } 

public void incluirSegVida(){
      // String apolice, String nome, String rg, String cpf, String sexo, String telefone, String endereco, String cep,
                // String cidade , double vlrApolice, String dtaInicio, String dtaFim, boolean cobreDoenca, boolean cobreAcidente
                System.out.println("--- Incluir Seguro ---");
                String apolice = Prompt.lerLinha("Digite a apólice do seguro: ");
                String nome = Prompt.lerLinha("Digite o nome do segurado: ");
                String rg = Prompt.lerLinha("Digite o RG: ");
                String cpf = Prompt.lerLinha("Digite o CPF: ");
                String sexo = Prompt.lerLinha("Digite o seu sexo: (M : Masculino / F: Feminino / O: Outros)");
                String telefone = Prompt.lerLinha("Digite o telefone: ");
                String endereco = Prompt.lerLinha("Digite o seu endereço(Rua)");
                String cep = Prompt.lerLinha("Digite o seu CEP: ");
                String cidade = Prompt.lerLinha("Digite a cidade do seu endereço: ");
                double vlrApolice = Prompt.lerDecimal("Digite o valor da apólice: ");
                String dataInicio = Prompt.lerLinha("Digite a data de início: ");
                String dataFim = Prompt.lerLinha("Digite a data de termino: ");
                String cobreDoenca = Prompt.lerLinha("Cobre doenças? (S/N)");
                boolean doenca = true;
                if (cobreDoenca.equals("S")) {
                    doenca = true;
                }else if(cobreDoenca.equals("N")){
                    doenca = false;
                }else{
                    System.out.println("Opção inválida!!");
                }
                String cobreAcidente = Prompt.lerLinha("Cobre acidentes? (S/N)");
                boolean acidente = true;
                if (cobreAcidente.equals("S")) {
                    acidente = true;
                }else if (cobreAcidente.equals("N")){
                    acidente = false;
                }else{
                    System.out.println("Opção inválida!!");
                }
                if (ctrlSeguro.incluirSeguroVida(apolice, nome, rg, cpf, sexo, telefone, endereco, cep, cidade, vlrApolice, dataInicio, dataFim, doenca, acidente).equals("ok")) {
                    System.out.println("Seguro adicionado com suscesso!!");
                }else{
                    System.out.println("Falha ao registrar seguro!!");
                } 

}

public void incluirSeguroV(){

    System.out.println("--- Incluir Seguro ---");
    String apolice = Prompt.lerLinha("Digite a apólice do seguro: ");
    String nome = Prompt.lerLinha("Digite o nome do segurado: ");
    String rg = Prompt.lerLinha("Digite o RG: ");
    String cpf = Prompt.lerLinha("Digite o CPF: ");
    String sexo = Prompt.lerLinha("Digite o seu sexo: (M : Masculino / F: Feminino / O: Outros)");
    String telefone = Prompt.lerLinha("Digite o telefone: ");
    String endereco = Prompt.lerLinha("Digite o seu endereço(Rua)");
    String cep = Prompt.lerLinha("Digite o seu CEP: ");
    String cidade = Prompt.lerLinha("Digite a cidade do seu endereço: ");
    double vlrApolice = Prompt.lerDecimal("Digite o valor da apólice: ");
    String dataInicio = Prompt.lerLinha("Digite a data de início: ");
    String dataFim = Prompt.lerLinha("Digite a data de termino: ");
    double vlrFranquia = Prompt.lerDecimal("Informe o valor da franquia: ");
    String temCarroReserva = Prompt.lerLinha("Possui carro reserva? (s)sim ou (n)nao").toLowerCase()                ;
    boolean carroReserva = true;
     if (temCarroReserva.equals("S")) {
        carroReserva = true;
    }else if(temCarroReserva.equals("N")){
        carroReserva = false;
    }else{
        System.out.println("Opção inválida!!");
    }
    String cobreVidros = Prompt.lerLinha("Cobre os vidros? (s)sim ou (n)nao?").toLowerCase();
    boolean vidros = true;
    if (cobreVidros.equals("S")) {
        vidros = true;
    }else if (cobreVidros.equals("N")){
        vidros = false;
    }else{
        System.out.println("Opção inválida!!");
    }
    if (ctrlSeguro.incluirSeguroVeiculo(apolice, nome, rg, cpf, sexo, telefone, endereco, cep, cidade, vlrApolice, dataInicio, dataFim, vlrFranquia, carroReserva, vidros).equals("ok")) {
        System.out.println("Seguro adicionado com suscesso!!");
    }else{
        System.out.println("Falha ao registrar seguro!!");
    } 


}

public void localizarSeg() {
    String numApolice = Prompt.lerLinha("Informe o número da apólice:");
    Seguro seguroEncontrado = ctrlSeguro.localizarSeguro(numApolice);
    if (seguroEncontrado != null) {
        System.out.println("Seguro encontrado:");
        System.out.println(seguroEncontrado);
    } else {
        System.out.println("Nenhum seguro encontrado com o número da apólice fornecido.");
    }
}


    




}
