package Lista_De_Execicios_8;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a quantidade de números que deseja armazenar:");
        int n = ler.nextInt();
        double[] numeros = new double[n];
        double media = 0;

        for(int i = 0; i < numeros.length; i++){
            System.out.printf("[Faltam %d] Digite um número:", n - i);
            numeros[i] = ler.nextDouble();
            media += numeros[i];
        }
        media /= n;

        System.out.printf("Média: %.2f", media);

    }
}
