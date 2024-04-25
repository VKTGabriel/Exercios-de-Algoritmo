import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class Exercicio9 {
    public static void main(String[] args) {
        double x,y,z;
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o valor de X:");
        x = ler.nextDouble();
        y = 1+(1/x);
        z = Math.abs(x) + 1;

        System.out.printf("a) x^3 + 5x^7 + 2x^9 = %.2f", (Math.pow(x,3) + (5*Math.pow(x,7)) + (2*Math.pow(x,9))));
        System.out.printf("\nb) Sen(x)/x = %.2f", Math.sin(x)/x);
        System.out.printf("\nc) (1 + (1/x))^x = %.2f", Math.pow(y,x));
        System.out.printf("\nd) Raiz->[Ln(|x| + 1) + log2(|x| + 1)] = %.2f", Math.sqrt(Math.log(z)+(Math.log(z)/Math.log(2))));
        if (x >= -1 && x <= 1) {
            System.out.printf("\ne) arcSen(x) + arcCos(x) = %.2f", (Math.asin(x) + Math.acos(x)));
        } else {
            System.out.println("\ne) arcSen(x) + arcCos(x) = Valor de X deve estar entre [-1 <-> 1]");
        }

    }
}
