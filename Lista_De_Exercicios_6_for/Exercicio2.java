package Lista_De_Exercicios_6_for;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);
        double maior = 0, menor = 0, num;
        System.out.println("[Faltam 10] Digite um número:");
        maior = ler.nextDouble();
        menor = maior;
        for (int i = 0; i<9; i++){
            System.out.printf("[Faltam %d] Digite um número:", (9-i));
            num = ler.nextDouble();
            if (num > maior){
                maior = num;
            } else if (num < menor){
                menor = num;
            }
        }
        System.out.println("Maior: " + maior + "\nMenor: " + menor);
    }
}
