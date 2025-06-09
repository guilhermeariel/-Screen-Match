import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String nome = "Guilherme";
        String tipoConta = "Corrente";
        Double saldo = 2000.95;
        int opcao = 0;

        System.out.println("********************************");
        System.out.println("\nCiente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        //System.out.println("Saldo atual " + saldo);
        System.out.println("\n********************************");

        String menu = """
                ** Digite uma opção ou digite 4 para sair **
                1 - Consultar saldo
                2 - Transferir
                3 - Receber valor
                4 - Sair
                """;

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("Saldo em conta: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja transferir? ");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Saldo insuficiente, seu saldo é de " + saldo);
                } else {
                    saldo -= valor;
                };
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valorRecebido = leitura.nextDouble();
                saldo += valorRecebido;
            } else if(opcao != 4) {
                System.out.println("Opção invalida");
            }
        }

        leitura.close();
    }
}
