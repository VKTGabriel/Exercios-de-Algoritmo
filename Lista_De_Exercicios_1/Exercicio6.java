package Lista_De_Exercicios_1;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        int num, esse, prox, soma;
        Scanner ler = new Scanner(System.in);

        System.out.println("Quantos números da sequencia você deseja ver?");
        num = ler.nextInt();

        if (num > 0) {
            esse = 0;
            System.out.printf("%d", esse);
            if (num > 1) {
                prox = 1;
                System.out.printf(" %d", prox);
                for (int i = 1; i <= (num - 2); i++) {
                    soma = esse + prox;
                    System.out.printf(" %d", soma);
                    esse = prox;
                    prox = soma;
                }
            }
        }
    }
}
