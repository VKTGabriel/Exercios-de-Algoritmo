import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double num = 0, maior = 0, menor = 0;
        int i = 1;
        System.out.printf("[Faltam %d] Digite um número:", (11-i));
        num = ler.nextDouble();
        maior = num;
        menor = num;

        while (i<=9){
            System.out.printf("[Faltam %d] Digite um número:", (10-i));
            num = ler.nextDouble();
            if (num < menor){
                menor = num;
            } else if (num > maior){
                maior = num;
            }
            i++;
        }

        System.out.printf("\nMaior número: %.1f\nMenor número: %.1f\n", maior, menor);

    }
}
