package Lista_De_Exercicios_5_for;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num = 0;
        System.out.println("Digite um número maior que 20:");
        num = ler.nextInt();
        if (num > 20) {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    System.out.printf("%d\t", i);
                }
            }
        } else {
            System.out.println("Número inválido");
        }
    }
}
