package Lista_De_Exercicios_1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        double a, b ,c, x1, x2, x3;
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);
        Locale.setDefault(Locale.US);

        System.out.println("Digite o valor dos três lados do triângulo:");
        x1 = ler.nextDouble();
        x2 = ler.nextDouble();
        x3 = ler.nextDouble();

        b = x1 + x2 + x3;
        a = Math.max(Math.max(x1,x2),x3);
        c = Math.min(Math.min(x1,x2),x3);
        b -= (a + c);

        if (a<b+c){
            if (Math.pow(a,2)==Math.pow(b,2)+Math.pow(c,2)){
                System.out.println("\nTRIANGULO RETANGULO");
            } else if (Math.pow(a,2)>Math.pow(b,2)+Math.pow(c,2)) {
                System.out.println("\nTRIANGULO OBTUSANGULO");
            } else {
                System.out.println("\nTRIANGULO ACUTANGULO");
            }

            if (a == b && b == c){
                System.out.println("TRIANGULO EQUILATERO");
            } else if (a == b || b == c) {
                System.out.println("TRIANGULO ISOSCELES");
            }

        } else {
            System.out.println("\nNAO FORMA TRIANGULO");
        }


    }
}
