package Lista_De_Execicios_8;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] numeros = new int[20];
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("[Faltam %d] Digite um número: ", numeros.length - i);
            numeros[i] = ler.nextInt();
        }

        String par = "", impar = "";

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                par += numeros[i] + " ";
            } else {
                impar += numeros[i] + " ";
            }
        }

        System.out.printf("\nPares: %s\nImpar: %s\n", par, impar);

    }
}
