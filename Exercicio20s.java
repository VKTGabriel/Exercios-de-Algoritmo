import java.util.Scanner;
import java.util.Locale;

public class Exercicio20s {

    public static void main(String[] args) {
        double a,b,c;
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite a primeira nota:");
        a = ler.nextDouble();
        System.out.println("Digite a segunda nota:");
        b = ler.nextDouble();

        if ((a+b)/2>=7){
            System.out.println("Aprovado \nNota final: " + (a+b)/2);
        } else {
            System.out.println("Digite o resultado da recuperação:");
            c = ler.nextDouble();
            if ((a+c)/2>=7){
                System.out.println("Aprovado \nNota final: " + 6.00);
            } else {
                System.out.println("Reprovado");
            }
        }


    }
}