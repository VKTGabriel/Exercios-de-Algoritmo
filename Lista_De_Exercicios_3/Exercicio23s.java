package Lista_De_Exercicios_3;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio23s {

    public static void main(String[] args) {
        double num;

        Scanner ler = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite um n�mero:");
        num = ler.nextDouble();

        if(num == 0){
            System.out.println("O n�mero � 0");
        } else if (num <0){
            System.out.println("O n�mero � negativo");
        } else {
            System.out.println("O n�mero � positivo");
        };


    }
}
