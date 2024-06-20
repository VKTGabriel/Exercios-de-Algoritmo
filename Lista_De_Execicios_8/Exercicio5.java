package Lista_De_Execicios_8;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("[Faltam %d] Digite um número: ", numeros.length - i);
            numeros[i] = ler.nextInt();
        }

        int pos = 0, neg = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                pos += 1;
            } else if (numeros[i] < 0) {
                neg += 1;
            }
        }

        System.out.printf("\nPositivos: %s\nNegativos: %s\n", pos, neg);

    }
}