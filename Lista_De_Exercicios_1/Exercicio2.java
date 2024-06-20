package Lista_De_Exercicios_1;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        double nota1, nota2, media;
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);
        Locale.setDefault(Locale.US);

        System.out.println("Digite a primeira nota:");
        nota1 = ler.nextDouble();
        System.out.println("Digite a segunda nota:");
        nota2 = ler.nextDouble();

        media = ((nota1*3.5) + (nota2*7.5))/11;

        System.out.printf("\nMEDIA = %.5f\n", media);

    }
}
