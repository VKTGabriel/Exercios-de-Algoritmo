package Lista_De_Execicios_8;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        Scanner ler = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("[linha %d - coluna %d] Digie um número:", i + 1, j + 1);
                matrix[i][j] = ler.nextInt();
            }
        }

        int diagonalP = 0, diagonalS = 0;

        System.out.printf("\nMatriz:\n");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%d\t", matrix[i][j]);
            }
            System.out.printf("\n");
        }

        for (int i = 0; i < 5; i++) {
            diagonalP += matrix[i][i];
            diagonalS += matrix[i][4-i];
        }

        System.out.printf("\nDiagonal Principal: %d\nDiagonal Secundaria: %d", diagonalP, diagonalS);

    }
}
