package Lista_De_Exercicios_3;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio21s {

    public static void main(String[] args) {
        double a,b,c;
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite os tr�s lados do tri�ngulo:");
        a = ler.nextDouble();
        b = ler.nextDouble();
        c = ler.nextDouble();

        if (a<b+c && b<a+c && c<b+a){
            if (a==b && b==c && a==c){
                System.out.println("Tri�ngulo Equil�tero");
            } else if (a==b || a==c || b==c){
                System.out.println("Tri�ngulo Is�sceles");
            } else {
                System.out.println("Tri�ngulo Escaleno");
            };
        } else{
            System.out.println("N�o � um Tri�ngulo");
        };


    }
}
