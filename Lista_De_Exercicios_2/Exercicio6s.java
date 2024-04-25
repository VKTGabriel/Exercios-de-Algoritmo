package Lista_De_Exercicios_2;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6s {
    public static void main(String[] args) {
        double prodA, prodB, prodC, prodD, totalProvisorio;
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o valor do primeiro produto: ");
        prodA = entrada.nextDouble();
        System.out.println("Digite o valor do segundo produto: ");
        prodB = entrada.nextDouble();
        System.out.println("Digite o valor do terceiro produto: ");
        prodC = entrada.nextDouble();
        System.out.println("Digite o valor do quarto produto: ");
        prodD = entrada.nextDouble();

        totalProvisorio = prodA + prodB + prodC + prodD;

        if (totalProvisorio <= 100){
            System.out.printf("Valor a pagar: R$%.2f", totalProvisorio);
        } else if (totalProvisorio <= 200){
            System.out.printf("Valor a pagar: R$%.2f", (totalProvisorio - (prodA * 0.1)));
            System.out.printf("\nTotal de desconto: R$%.2f", (prodA * 0.1));
        } else if (totalProvisorio <= 500){
            System.out.printf("Valor a pagar: R$%.2f", (totalProvisorio - ((prodA+prodB) * 0.15)));
            System.out.printf("\nTotal de desconto: R$%.2f", ((prodA+prodB) * 0.15));
        } else {
            System.out.printf("Valor a pagar: R$%.2f", (totalProvisorio * 0.75));
            System.out.printf("\nTotal de desconto: R$%.2f", (totalProvisorio * 0.25));
        }
    }
}
