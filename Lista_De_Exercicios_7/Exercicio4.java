package Lista_De_Exercicios_7;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        String palavra, inversa = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        palavra = sc.nextLine().replace(" ","").toLowerCase();
        for (int i = palavra.length()-1; i >= 0; i--) {
            inversa += palavra.charAt(i);
        }

        if (palavra.equals(inversa)) {
            System.out.println("É um palíndromo");
        } else {
            System.out.println("não é um palíndromo");
        }
    }
}
