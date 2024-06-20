package Lista_De_Execicios_8;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] numeros = new int[15];
        int maior = 0, menor = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("[Faltam %d] Digite um numero:", numeros.length - i);
            numeros[i] = ler.nextInt();
        }

        maior = numeros[0];
        menor = numeros[0];

        int i = 1;

        while (i < numeros.length) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            } else if (numeros[i] < menor) {
                menor = numeros[i];
            }
            i++;
        }

        System.out.printf("\nMaior: %d\nMenor: %d\n", maior, menor);

    }
}
