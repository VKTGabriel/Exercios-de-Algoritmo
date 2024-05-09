package Lista_De_Exercicios_3;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        double custoFabrica;
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o preço de fábrica do veículo:");
        custoFabrica = ler.nextDouble();

        System.out.printf("Digite o valor final do veículo para o consumidor é: R$%.2f", ((custoFabrica*1.28)*1.45));

    }
}
