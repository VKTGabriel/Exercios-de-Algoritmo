package Lista_De_Execicios_8;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] vetor1 = new int[5], vetor2 = new int[5];
        for (int i = 0; i < vetor1.length; i++) {
            System.out.printf("[Vetor 1 - Faltam %d] Digite um valor:", vetor1.length - i);
            vetor1[i] = ler.nextInt();
        }

        System.out.println("-----------------------------");

        for (int i = 0; i < vetor2.length; i++) {
            System.out.printf("[Vetor 2 - Faltam %d] Digite um valor:", vetor2.length - i);
            vetor2[i] = ler.nextInt();
        }

        String comuns = "Comuns aos dois vetores: ";

        for (int i = 0; i < vetor1.length; i++) {
            if (!comuns.contains(vetor1[i]+"")){
                for (int j = 0; j < vetor2.length; j++) {
                    if (vetor1[i] == vetor2[j]) {
                        comuns += vetor1[i] + " ";
                        break;
                    }
                }
            }
        }

        System.out.println("\n" + comuns);
    }
}
