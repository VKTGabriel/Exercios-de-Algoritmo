package Lista_De_Exercicios_7;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        int num, rest;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        num = sc.nextInt();
        rest = num;
        for (int i = num; i > 1; i--) {
            rest *= (i-1);
        }
        System.out.println(rest);
    }
}
