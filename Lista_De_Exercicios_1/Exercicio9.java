package Lista_De_Exercicios_1;

import java.util.Scanner;
import java.lang.Math;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero, cont = 0, mult = 0;
        String[] hex = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
        String saida = "";

        System.out.println("Digite um numero para converter:");
        numero = ler.nextInt();

        while (cont == 0) {
            if (Math.pow(16, mult) > numero) {
                cont++;
                mult--;
            } else {
                mult++;
            }
        }

        int[] resultado = new int[mult+1];

        for (int i = 0; i < resultado.length; i++) {
            if (mult != 0) {
                resultado[i] = numero/(int) Math.pow(16,mult);
                numero -= resultado[i] * (int) Math.pow(16,mult);
                mult--;
            } else {
                resultado[i] = numero;
            }
        }

        for (int i = 0; i < resultado.length; i++) {
            saida += hex[resultado[i]];
        }

        System.out.printf("\n%s\n", saida);

    }
}
