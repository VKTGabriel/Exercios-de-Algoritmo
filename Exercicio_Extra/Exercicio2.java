package Exercicio_Extra;

import java.util.Scanner;
import java.lang.Math;

public class Exercicio2 {
    public static void main(String[] args) {
        double x1, x2, y1, y2, valor;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o valor de X1:");
        x1 = ler.nextInt();
        System.out.println("Digite o valor de Y1:");
        y1 = ler.nextInt();

        System.out.println("Digite o valor de X2:");
        x2 = ler.nextInt();
        System.out.println("Digite o valor de Y2:");
        y2 = ler.nextInt();

        valor = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        System.out.printf("Distância = %.4f", valor);

    }
}
