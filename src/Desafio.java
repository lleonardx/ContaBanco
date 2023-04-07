import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Leonardo";
        String tipoConta = "Corrente";
        double saldo = 1599.99;
        int opcao = 0;

        System.out.println("*********************************");
        System.out.println("Nome do Cliente: " + nome);
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("Saldo Atual: " + saldo);
        System.out.println("*********************************");

        String menu = """
                *** Digite sua opção ***
                1 - Consultar Saldo
                2 - Transferir Valor
                3 - Receber Valor
                4 - Sair            
                """;
        Scanner leitura = new Scanner(System.in);

        //loop
        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            //condicional
            if (opcao == 1) {
                System.out.println("O saldo atualizado é: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual valor para transferencia ? : ");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo para realizar transferência");
                } else {
                    saldo -= valor;
                    System.out.println("Novo Saldo: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo Saldo: " + saldo);
            }else if (opcao != 4){
                System.out.println("Opção Inválida.");
            }

        }
    }
}