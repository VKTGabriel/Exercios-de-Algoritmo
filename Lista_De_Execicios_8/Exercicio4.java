package Lista_De_Execicios_8;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] numero = new int[5];
        for (int i = 0; i < numero.length; i++) {
            System.out.printf("[Faltam %d] Digite um numero:", numero.length - i);
            numero[i] = ler.nextInt();
        }

        String inverso = "Array inverso: ";

        for (int j = numero.length - 1; j >= 0 ; j--) {
            inverso += numero[j] + " ";
        }

        System.out.printf("\n%s\n", inverso);
    }
}
