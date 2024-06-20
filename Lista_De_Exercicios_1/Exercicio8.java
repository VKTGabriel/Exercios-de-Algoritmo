package Lista_De_Exercicios_1;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        int num, soma;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número:");
        num = ler.nextInt();

        soma = 0;
        for (int i = (num - 1); i > 0; i--) {
            if (num%i == 0) {
                soma += i;
            }
        }

        if (soma == num) {
            System.out.printf("\n%d e perfeito\n", num);
        } else {
            System.out.printf("\n%d nao e perfeito\n", num);
        }
    }
}
