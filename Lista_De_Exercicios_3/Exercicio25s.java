package Lista_De_Exercicios_3;

import java.util.Scanner;

public class Exercicio25s {

    public static void main(String[] args) {

        int a,b;
        String at,bt;

        Scanner ler = new Scanner(System.in);
        System.out.println("Qual o nome do primeiro time?");
        at = ler.nextLine();
        System.out.println("Qual o nome do segundo time?");
        bt = ler.nextLine();

        System.out.println("Quantos gols o time " + at + " marcou?");
        a = ler.nextInt();
        System.out.println("Quantos gols o time " + bt + " marcou?");
        b = ler.nextInt();

        if(a==b){
            System.out.println("Empate");
        } else if (a>b) {
            System.out.println("Time vencedor: " + at + "\nPlacar: " + a + "x" + b);
        } else {
            System.out.println("Time vencedor: " + bt + "\nPlacar: " + b + "x" + a);
        }

    }
}