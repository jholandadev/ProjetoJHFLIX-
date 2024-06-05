import java.sql.SQLOutput;

public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        double notaDoFilme = 8.1;
        boolean incluidoNoPlano = true;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2024){
            System.out.println("Lançamento que os clientes estão curtindo ! ");
        } else {
            System.out.println("Esse é filme que vale a pena assistir ! ");

        }
        if (incluidoNoPlano == true || tipoPlano.equals("plus")){
            System.out.println("Filme Liberado");
        } else {
            System.out.println("Pagar a Locação");
        }
    }
}