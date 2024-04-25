package Lista_De_Exercicios_3;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        int quant;
        double valor;
        Scanner ler = new Scanner(System.in);
        System.out.println("Quantas maçãs você deseja?");
        quant = ler.nextInt();

        if (quant >= 12){
            valor = quant;
        } else {
            valor = quant*1.3;
        }

        System.out.printf("Valor final do pedido: R$%.2f", valor);

    }
}
