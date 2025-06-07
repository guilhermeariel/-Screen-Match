import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito");
        String filme = leitura.nextLine();

        System.out.println("Qual o ano de lançamento? ");
        int anoLançamento = leitura.nextInt();

        System.out.println("Digite sua avaliação para o filme? ");
        double avaliacao = leitura.nextDouble();

        System.out.println("Filme: " + filme);
        System.out.println("Ano se lançamento: " + anoLançamento);
        System.out.println(String.format("Nota %.2f ", avaliacao));



    }
}
