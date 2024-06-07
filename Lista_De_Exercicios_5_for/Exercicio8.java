package Lista_De_Exercicios_5_for;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num = 0;
        System.out.println("Digite um número maior que 30:");
        num = ler.nextInt();
        if (num>30){
            for (int i=1; i<num;i++){
                if(i%2 == 0 || i%7 ==0){
                    System.out.printf("%d\t", i);
                }
            }
        } else {
            System.out.println("Número Inválido");
        }
    }
}
