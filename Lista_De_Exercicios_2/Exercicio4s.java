package Lista_De_Exercicios_2;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4s {

    public static void main(String[] args) {
        double salario, percent, aumento;
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o seu sal�rio:");
        salario = entrada.nextDouble();
        System.out.println("Qual a porcentagem de crescimento:");
        percent = entrada.nextDouble();

        aumento = salario/100 * percent;

        System.out.printf("Seu sal�rio aumentou em: R$%.2f", aumento);
        System.out.printf("\nSeu novo sal�rio �: R$%.2f", (salario + aumento));
    }
}
