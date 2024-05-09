package Lista_De_Exercicios_2;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4s {

    public static void main(String[] args) {
        double salario, percent, aumento;
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o seu salário:");
        salario = entrada.nextDouble();
        System.out.println("Qual a porcentagem de crescimento:");
        percent = entrada.nextDouble();

        aumento = salario/100 * percent;

        System.out.printf("Seu salário aumentou em: R$%.2f", aumento);
        System.out.printf("\nSeu novo salário é: R$%.2f", (salario + aumento));
    }
}
