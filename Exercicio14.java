import java.util.Locale;
import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        int a;
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite un n�mero inteiro:");
        a = ler.nextInt();

        if (a%2 == 0){
            System.out.println("� PAR");
        } else {
            System.out.println("� IMPAR");
        }

    }
}
