package Lista_De_Execicios_8;

import java.util.Random;

public class Exercicio9 {
    public static void main(String[] args) {
        int[][] matriz1 = new int[4][4], matriz2 = new int[4][4], resultado = new int[4][4];
        Random aleatorio = new Random();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz1[i][j] = aleatorio.nextInt(10);
                matriz2[i][j] = aleatorio.nextInt(10);
            }
        }

        int mult = 0, linha = 0, coluna = 0, c = 0;

        for (int i = 0; i < 4; i++) {
            for (c = 0; c < 4; c++) {
                for (int j = 0; j < 4; j++) {
                    linha = matriz1[i][j];
                    coluna = matriz2[j][c];
                    mult += linha * coluna;
                }
                resultado[i][c] = mult;
                mult = 0;
            }
        }

        System.out.printf("\nMatriz 1:\n");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%d\t", matriz1[i][j]);
            }
            System.out.printf("\n");
        }

        System.out.printf("\nMatriz 2:\n");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%d\t", matriz2[i][j]);
            }
            System.out.printf("\n");
        }

        System.out.printf("\nResultado:\n");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%d\t", resultado[i][j]);
            }
            System.out.printf("\n");
        }

    }
}
