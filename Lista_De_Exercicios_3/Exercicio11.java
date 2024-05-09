package Lista_De_Exercicios_3;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        double salario, ajuste;
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o salário do funcionário:");
        salario = ler.nextDouble();
        System.out.println("Digite o percentual de reajuste salarial:");
        ajuste = ler.nextDouble();

        System.out.printf("Novo salário: R$%.2f", (salario+(salario*ajuste/100)));
    }
}
