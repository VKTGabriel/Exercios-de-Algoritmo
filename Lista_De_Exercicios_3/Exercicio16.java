package Lista_De_Exercicios_3;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        double x,y;
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o valor do eixo x:");
        x = ler.nextDouble();
        System.out.println("Digite o valor do eixo y:");
        y = ler.nextDouble();

        if (x == 0 && y == 0){
            System.out.println("Origem");
        } else {
            if (x == 0){
                if (y>0){
                    System.out.println("Entre o Primeiro e o Segundo Quadrante");
                } else {
                    System.out.println("Entre o Terceiro e o Quarto Quadrante");
                }
            } else {
                if (y == 0) {
                    if (x>0){
                        System.out.println("Entre o Primeiro e o Quarto Quadrante");
                    } else {
                        System.out.println("Entre o Segundo e o Terceiro Quadrante");
                    }
                } else {
                    if (x>0 && y>0){
                        System.out.println("Primeiro Quadrante");
                    } else {
                        if (x<0 && y>0){
                            System.out.println("Segundo Quadrante");
                        } else {
                            if (x<0 && y<0){
                                System.out.println("Terceiro Quadrante");
                            } else {
                                System.out.println("Quarto Quadrante");
                            }
                        }
                    }
                }
            }
        }

    }
}
