package Desafios;

import java.util.Scanner;

public class Conversao_String_Double {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] numerais = {"primeiro", "segundo", "terceiro"};
        String salario;
        double media = 0;

        for (int i = 1; i <= 3; i++) {
        System.out.printf("Digite o valor do %s salario: \n", numerais[(i-1)]);
        salario = sc.nextLine();
        media += Double.parseDouble(salario.replace(",","."));
        }
        media /= 3;
        System.out.printf("Mádia: R$%.2f", media);
    }
}
