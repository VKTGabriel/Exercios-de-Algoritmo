package Lista_De_Execicios_8;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Scanner ler = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("[Faltam %d] Digite um numero:", numeros.length - i);
            numeros[i] = ler.nextInt();
        }

        String trava = "";

        for (int i = 0; i < numeros.length; i++) {
            int analise = numeros[i], cont = 0;
            String verifica = analise + " ";
            if (!trava.contains(verifica)) {
                for (int j = 0; j < numeros.length; j++) {
                    if (numeros[j] == analise) {
                        cont++;
                        trava += analise + " ";
                    }
                }
                System.out.printf("\nNúmero %d: %d", analise, cont);
            }
        }
    }
}
