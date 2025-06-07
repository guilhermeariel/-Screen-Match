public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int ano = 2025;
        System.out.println("Ano de lançamento: " + ano);
        boolean incluidoPlano = true;
        double notaDoFilme = 8.1;

        double media = (8 + 6.81 + 10) /3;
        // Média calculada pelas 3 notas no Globo Rewards
        String formatado =  String.format("%.2f", media);
        System.out.println("Nota do filme: " + formatado);
        String sinopse = """ 
                Filme de ação com o Brabo
                Ano de lançamento
                """ + ano;
        System.out.println(sinopse);

        float classificacao = (float) (media /2);
        System.out.println(String.format("%.2f", classificacao));




//        String nome = "Maria";
//        int idade = 30;
//        double valor = 55.9999;
//        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));




    }
}