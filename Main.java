public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        double notaDoFilme = 8.1;
        boolean incluidoNoPlano = true;
        // estrelas calculada com a media de 3 pessoas
        double media = (9.8 + 6.3 + 7.0) / 3;
        int classificacao = (int) (media /2);
        System.out.println(classificacao + " estrelas");
        String sinopse;
        sinopse = "Filme de aventura com galã dos anos 80 \nLançado em: ";
        System.out.println( sinopse + anoDeLancamento);


    }
}
