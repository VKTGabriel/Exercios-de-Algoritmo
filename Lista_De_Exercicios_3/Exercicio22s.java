package Lista_De_Exercicios_3;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio22s {

    public static void main(String[] args) {
        double salario, vendas;

        Scanner ler = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o salário do vendedor:");
        salario = ler.nextDouble();
        System.out.println("Digite o valor das vendas:");
        vendas = ler.nextDouble();

        if (vendas > 1500){
            System.out.printf("Salário total: R$ %.2f", (salario + (1500*0.03) + ((vendas-1500)*0.05)));
        } else {
            System.out.printf("Salário total: R$ %.2f", (salario + (vendas*0.03)));
        };


    }
}