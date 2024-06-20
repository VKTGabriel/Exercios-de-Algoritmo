package Lista_De_Execicios_8;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        Scanner ler = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("[linha %d - coluna %d] Digie um número:", i + 1, j + 1);
                matriz[i][j] = ler.nextInt();
            }
        }

        int diagonalP = 0, diagonalS = 0;

        System.out.printf("\nMatriz:\n");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%d\t", matriz[i][j]);
            }
            System.out.printf("\n");
        }

        for (int i = 0; i < 5; i++) {
            diagonalP += matriz[i][i];
            diagonalS += matriz[i][4-i];
        }

        System.out.printf("\nDiagonal Principal: %d\nDiagonal Secundaria: %d", diagonalP, diagonalS);

    }
}
