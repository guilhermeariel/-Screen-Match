import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite sua avaliação para o filme? ");
            nota = leitura.nextInt();
            mediaAvaliacao +=  nota;
        }

        System.out.printf("Media de avaliacoes: %.2f%n",  mediaAvaliacao/3);


    }
}
