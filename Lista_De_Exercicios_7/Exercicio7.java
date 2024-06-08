package Lista_De_Exercicios_7;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        int num, soma;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        num = sc.nextInt();
        soma = 0;
        for (int i = 1; i <= num/2; i++) {
            if(num%i == 0){
                soma += i;
            }
        }
        if(soma == num){
            System.out.println("É perfeito");
        } else {
            System.out.println("Não é perfeito");
        }
    }
}
