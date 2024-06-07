package Lista_De_Exercicios_5_for;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num = 0, i = 0;
        System.out.println("Digite um número maior que 100:");
        num = ler.nextInt();
        if (num > 100) {
            for (i = 2; i <= (num/2); i++) {
                if (num % i == 0) {
                    System.out.println("Não é primo");
                    break;
                }
            }
            if ((i-1) == (num/2)){
                System.out.println("É primo");
            }
        } else {
            System.out.println("Número inválido");
        }
    }
}
