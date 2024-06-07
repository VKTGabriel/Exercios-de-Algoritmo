package Lista_De_Exercicios_5_for;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        int[] seq = {0,1,1};
        int num;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite uma posição para checar:");
        num = ler.nextInt();
        if (num > 3){
            int anterior = 1, atual = 1, soma = 0;
            for (int i = 4; i<=num; i++){
                soma = anterior + atual;
                anterior = atual;
                atual = soma;
            }
            System.out.println("Valor = " + soma);
        } else if (num>0){
            System.out.println("Valor = " + seq[(num-1)]);
        } else {
            System.out.println("Posição Inválida");
        }
    }
}
