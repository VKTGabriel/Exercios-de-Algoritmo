import java.util.Locale;
import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);
        Locale.setDefault(Locale.US);
        double num = 0;
        int i = 1;
        while (i<=10){
            System.out.printf("[Faltam %d] Digite um número:", (11-i));
            num += ler.nextDouble();
            i++;
        }

        System.out.printf("Média: %.1f", num/(i-1));
    }
}