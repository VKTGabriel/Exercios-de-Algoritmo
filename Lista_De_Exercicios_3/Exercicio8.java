package Lista_De_Exercicios_3;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        char a;
        int val1;

        Scanner ler = new Scanner(System.in);
        System.out.println("Escreva um caractere maiusculo de [A - Z]:");
        a = ler.nextLine().charAt(0);
        val1 = a;

        if (val1 > 64 && val1 < 91){
            a = (char) (val1 + 32);
            System.out.println("Caractere minusculo: " + a);
        } else {
            System.out.println("Caractere inválido");
        }

    }
}
