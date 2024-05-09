package Lista_De_Exercicios_1;
import java.lang.Math;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio1 {
    public static void main(String[] args) {
        double a, b, c, delta;
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o valor de X^2");
        a = ler.nextDouble();

        if (a != 0){
            System.out.println("Digite o valor de X");
            b = ler.nextDouble();
            System.out.println("Digite o valor explicito");
            c = ler.nextDouble();

            delta = Math.pow(b,2) - (4*a*c);

            if (delta>=0){
                System.out.printf("R1 = %.5f", ((-b + Math.sqrt(delta))/(2*a)));
                System.out.printf("\nR2 = %.5f\n", ((-b - Math.sqrt(delta))/(2*a)));
            } else {
                System.out.println("Impossível Calcular\n");
            };

        } else {
            System.out.println("Impossível Calcular\n");
        };

    }
}
