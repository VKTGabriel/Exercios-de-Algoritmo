package Lista_De_Exercicios_3;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args){
        char a,b,c;
        int val1, val2, val3;

        Scanner ler = new Scanner(System.in);
        System.out.println("Escreva um caractere:");
        a = ler.nextLine().charAt(0);

        val1 = a;
        val2 = val1-1;
        val3 = val1+1;

        b = (char) val2;
        c = (char) val3;



        System.out.println("Caractere digitado: " + a + "\n"+ "Antecessor: " + b + "\n"+ "Sucessor: " + c);

    }
}
