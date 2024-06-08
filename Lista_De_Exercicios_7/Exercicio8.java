package Lista_De_Exercicios_7;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inicio, fim, conf = 0;

        System.out.println("Digite o valor inicial: ");
        inicio = sc.nextInt();

        if (inicio < 2){
            inicio = 2;
        }

        System.out.println("Digite o valor final: ");
        fim = sc.nextInt();

        for (int i = inicio; i <= fim; i++){
            for (int d = 2; d <= i/2; d++){
                if (i % d == 0){
                    conf = -1;
                    break;
                } else {
                    conf++;
                }
            }
            if (conf != -1){
                System.out.printf("%d\t", i);
            }
        }

    }
}
