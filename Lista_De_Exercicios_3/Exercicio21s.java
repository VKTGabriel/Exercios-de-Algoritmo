package Lista_De_Exercicios_3;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio21s {

    public static void main(String[] args) {
        double a,b,c;
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite os três lados do triângulo:");
        a = ler.nextDouble();
        b = ler.nextDouble();
        c = ler.nextDouble();

        if (a<b+c && b<a+c && c<b+a){
            if (a==b && b==c && a==c){
                System.out.println("Triângulo Equilátero");
            } else if (a==b || a==c || b==c){
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno");
            };
        } else{
            System.out.println("Não é um Triângulo");
        };


    }
}
