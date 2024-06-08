package Lista_De_Exercicios_7;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + num + " = " + num * i);
        }
    }
}
