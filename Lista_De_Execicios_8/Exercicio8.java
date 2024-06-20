package Lista_De_Execicios_8;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        Scanner entrada = new Scanner(System.in);
        int linha1 = 0, linha2 = 0, linha3 = 0, coluna1 = 0, coluna2 = 0, coluna3 = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("[Linha %d, Coluna %d] Digite um número: ", i + 1, j + 1);
                matriz[i][j] = entrada.nextInt();
                if (i == 0) {
                    linha1 += matriz[i][j];
                } else if (i == 1) {
                    linha2 += matriz[i][j];
                } else {
                    linha3 += matriz[i][j];
                }

                if (j == 0) {
                    coluna1 += matriz[i][j];
                } else if (j == 1) {
                    coluna2 += matriz[i][j];
                } else {
                    coluna3 += matriz[i][j];
                }
            }
        }
        System.out.printf("\nLinhas 1: %d\nLinha 2: %d\nLinha 3: %d\n---------\nColuna 1: %d\nColuna 2: %d\nColuna 3: %d\n", linha1, linha2, linha3, coluna1, coluna2, coluna3);
    }
}
