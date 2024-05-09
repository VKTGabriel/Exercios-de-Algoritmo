package Lista_De_Exercicios_2;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio2s {

    public static void main(String[] args) {
        double a, b, c, media;
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite 3 números:");
        a = entrada.nextDouble();
        b = entrada.nextDouble();
        c = entrada.nextDouble();

        media = (a + b + c)/3;

        System.out.println("A média é: " + media);
    }
}
