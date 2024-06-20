package Lista_De_Execicios_8;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        int[] numeros = new int[10], saida = new int[10];
        int deslocamento;
        Scanner ler = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("[Faltam %d] Digite um valor: ", numeros.length - i);
            numeros[i] = ler.nextInt();
        }

        System.out.printf("\nDigite um valor de deslocamento:");
        deslocamento = ler.nextInt();

        deslocamento %= 10;
        String resultado = "";

        for (int i = 0; i < numeros.length; i++) {
            if (deslocamento < 10) {
                saida[i] = numeros[deslocamento];
                deslocamento++;
                resultado += saida[i] + " ";
            } else {
                saida[i] = numeros[deslocamento - 10];
                deslocamento++;
                resultado += saida[i] + " ";
            }
        }

        System.out.printf("\nNovo vetor: %s\n", resultado);
    }
}
