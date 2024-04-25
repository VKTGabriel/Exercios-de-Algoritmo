package Lista_De_Exercicios_2;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5s {
    public static void main(String[] args) {
        double salario,gratificacao,imposto,total;
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o seu salário:");
        salario = entrada.nextDouble();

        gratificacao = salario*0.05;
        imposto = (salario+gratificacao)*0.07;
        total = salario+gratificacao-imposto;

        System.out.printf("Total recebido: R$%.2f", total);
        System.out.printf("\nSalário base: R$%.2f", salario);
        System.out.printf("\nGratificação: R$%.2f", gratificacao);
        System.out.printf("\nImposto Pago: R$%.2f", imposto);
    }
}