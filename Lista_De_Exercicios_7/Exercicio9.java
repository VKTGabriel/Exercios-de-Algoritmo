package Lista_De_Exercicios_7;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, n = 0;
        System.out.println("Digite um número inteiro positivo:");
        num = sc.nextInt();
        if (num > 0) {
            System.out.printf("%d", num);
            for (int i = num; i != 1; i = n) {
                if (i % 2 == 0) {
                    n = i / 2;
                    System.out.printf(", %d", n);
                } else {
                    n = i * 3 + 1;
                    System.out.printf(", %d", n);
                }
            }
        } else {
            System.out.println("Número inválido");
        }
    }
}
