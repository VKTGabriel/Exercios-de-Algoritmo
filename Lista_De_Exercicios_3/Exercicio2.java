package Lista_De_Exercicios_3;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio2 {
    public static void main(String[] args) {
        double b,h;
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite a base do tri�ngulo:");
        b = ler.nextDouble();
        System.out.println("Digite a altura do tri�ngulo:");
        h = ler.nextDouble();

        System.out.println("A �rea do tri�ngulo �: " + (b*h)/2);

    }
}
