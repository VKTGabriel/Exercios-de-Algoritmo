package Lista_De_Exercicios_3;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        double custoFabrica;
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o pre�o de f�brica do ve�culo:");
        custoFabrica = ler.nextDouble();

        System.out.printf("Digite o valor final do ve�culo para o consumidor �: R$%.2f", ((custoFabrica*1.28)*1.45));

    }
}
