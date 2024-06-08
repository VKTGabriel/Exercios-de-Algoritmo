package Lista_De_Exercicios_7;

import java.util.Random;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random  aleatorio = new Random();
        int num, n=0, resul = aleatorio.nextInt(100) + 1;
        System.out.print("Digite um numero: ");
        num = sc.nextInt();
        for (int i = 0; i < 1; i--) {
            if (num == resul) {
                System.out.println("\nVocê acertou!!!\n");
                break;
            } else if  (num > resul) {
                System.out.println("\nOpa... Você errou.\nTente um número menor que " + num + "\n");
            } else {
                System.out.println("\nOpa... Você errou.\nTente um número maior que " + num + "\n");
            }
            System.out.print("Digite um numero: ");
            num = sc.nextInt();
        }

    }
}
