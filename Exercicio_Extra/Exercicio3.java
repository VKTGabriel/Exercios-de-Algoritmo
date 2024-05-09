package Exercicio_Extra;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio3 {
    public static void main(String[] args) {
        double valor;
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);
        Locale.setDefault(Locale.US);

        System.out.println("Digite o seu salário:");
        valor = ler.nextDouble();

        if (valor > 4500){
            System.out.printf("Valor a pagar R$%.2f", (((valor - 4500) * 0.28) + 350));
        } else {
            if  (valor > 3000){
                System.out.printf("Valor a pagar R$%.2f", (((valor - 3000) * 0.18) + 80));
            } else {
                if (valor > 2000) {
                    System.out.printf("Valor a pagar R$%.2f", ((valor - 2000) * 0.08));
                } else {
                    System.out.println("Isento");
                }
            }
        }

    }
}
