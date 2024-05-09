package Exercicio_Extra;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio1 {
    public static void main(String[] args) {
        double a,b;
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite 2 números:");
        a = ler.nextDouble();
        b = ler.nextDouble();

        if (b>a){
            double c = a;
            a = b;
            b = c;
        }

        if (a>=(b*2)){
            System.out.println("Resultado: " + a%b);
        } else {
            System.out.println("Resultado: " + a*b);
        }
    }
}
