package Lista_De_Exercicios_7;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        int inicial, razao;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha o primeiro termo da Progressão:");
        inicial = sc.nextInt();
        System.out.println("Digite a razão da Progressão:");
        razao = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t", inicial + (i*razao));
        }
    }
}
