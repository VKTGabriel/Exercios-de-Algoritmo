package Lista_De_Exercicios_6_for;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);
        double num = 0;
        for (int i = 0; i<10; i++){
            System.out.printf("[Faltam %d] digite um número:", (10 - i));
            num += ler.nextDouble();
        }
        System.out.println("Média = " + num/10);
    }
}
