package br.edu.up.views;
import br.edu.up.Prompt;
import br.edu.up.controller.ControllerSeguro;

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

        switch (op) {
            case 1:
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
                break;
        
            default:
                break;
        }








        
    }
}
