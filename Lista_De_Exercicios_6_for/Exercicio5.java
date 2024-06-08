package Lista_De_Exercicios_6_for;

import java.util.Scanner;
import java.lang.Math;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numMaior, numMenor;
        System.out.println("Digite dois números:");
        numMenor = ler.nextInt();
        numMaior = ler.nextInt();
        for (int i = (Math.min(numMenor,numMaior)+1); i<=(Math.max(numMenor,numMaior)-1); i++){
            if (i%2 == 0){
                System.out.printf("%d\t",i);
            }
        }
    }
}
