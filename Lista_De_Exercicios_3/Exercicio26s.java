package Lista_De_Exercicios_3;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio26s {

    public static void main(String[] args) {

        double a,b;

        Scanner ler = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Qual o Primeiro valor?");
        a = ler.nextDouble();
        System.out.println("Qual o Segundo valor?");
        b = ler.nextDouble();

        if(a==b){
            System.out.println("Igual");
        } else if (a>b) {
            System.out.println("Primeiro maior");
        } else {
            System.out.println("Segundo maior");
        }

    }
}