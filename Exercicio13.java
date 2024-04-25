import java.util.Locale;
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        int a;
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite un número inteiro:");
        a = ler.nextInt();

        if (a==10){
            System.out.println("É 10");
        } else {
            if (a>10){
                System.out.println("É MAIOR QUE 10");
            } else {
                System.out.println("É MENOR QUE 10");
            }
        }


    }
}
