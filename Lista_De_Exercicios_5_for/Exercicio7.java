package Lista_De_Exercicios_5_for;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num = 0, n = 0, somaPos = 0, somaNeg = 0, quantPos = 0, quantNeg = 0;
        for (int i = 0; i< 15; i+=n){
            System.out.printf("[Faltam %d] Digite um número:", (15-i));
            num = ler.nextInt();
            if (num>0){
                somaPos += num;
                quantPos++;
                n = 1;
            } else if(num<0){
                somaNeg += num;
                quantNeg++;
                n = 1;
            } else {
                System.out.println("Número Inválido");
                n = 0;
            }
        }
        System.out.printf("Quantidade numeros Positivos: %d\n", quantPos);
        System.out.printf("Quantidade numeros Negativos: %d\n", quantNeg);
        System.out.printf("Soma dos numeros positivos: %d\n", somaPos);
        System.out.printf("Soma dos numeros positivos: %d\n", somaNeg);
    }
}
