package Exercicio_Extra;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        int x;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        x = ler.nextInt();

        if (x%2 == 0){
            x+=1;
        }

        System.out.println(x);
        System.out.println(x+2);
        System.out.println(x+4);
        System.out.println(x+6);

    }
}
