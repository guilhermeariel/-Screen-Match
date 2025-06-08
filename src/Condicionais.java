
public class Condicionais {
    public static void main(String[] args) {
        int anoDeLancamento = 1986;
        boolean incluidoNoPlano =  false;
        double notaDoFilme = 9;
        String tipoPlano = "normal";

        if (anoDeLancamento >= 1986){
            System.out.println("Lançamento! ");
        } else {
            System.out.println("Filme retro");
        }

        if (incluidoNoPlano || tipoPlano.equals("plus")) {
            System.out.println("Filme liberado");
        } else {
            System.out.println("Deve pagar a locação");
        }
    }
}
