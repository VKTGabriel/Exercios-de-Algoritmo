package Lista_De_Exercicios_3;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args){
        int anos, meses, dias;
        Scanner ler = new Scanner(System.in);

        System.out.println("Quantos anos você já completou?");
        anos = ler.nextInt();
        System.out.println("Quantos meses completos já se passaram desde seu último aniversário?");
        meses = ler.nextInt();
        System.out.println("Ignorando os meses, qual a diferença entre o dia de hoje e o dia do seu aniversário?");
        dias = ler.nextInt();

        System.out.println("Sua idade em dias é: " + ((anos*365)+(meses*30)+(dias)));

    }
}
