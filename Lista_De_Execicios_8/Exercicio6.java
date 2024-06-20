package Lista_De_Execicios_8;

import java.util.Random;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int[] numeros = new int[10];
        int soma = 0;

        for (int i = 0; i < 10; i++) {
            numeros[i] = aleatorio.nextInt(100)+1;
            soma += numeros[i];
            System.out.printf("%d ", numeros[i]);
        }

        System.out.printf("\nSoma: %d\n", soma);
    }
}
