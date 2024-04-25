package Lista_De_Exercicios_3;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args){
        double temp;
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite a temperatura em Fahrenheit:");
        temp = ler.nextDouble();

        System.out.printf("A temperatura em Celcius é: %.1f", ((temp-32)/9)*5);
    }
}
