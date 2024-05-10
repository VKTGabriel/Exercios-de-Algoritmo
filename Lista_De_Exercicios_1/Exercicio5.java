package Lista_De_Exercicios_1;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        double a, b ,c, x1, x2, x3;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o valor dos três lados do triângulo:");
        x1 = ler.nextDouble();
        x2 = ler.nextDouble();
        x3 = ler.nextDouble();

        b = x1 + x2 + x3;
        a = Math.max(Math.max(x1,x2),x3);
        c = Math.min(Math.min(x1,x2),x3);
        b -= (a + c);

        if (a<b+c){
            if (Math.pow(a,2)==Math.pow(b,2)+Math.pow(c,2)){
                System.out.println("TRIANGULO RETANGULO");
            } else if (Math.pow(a,2)>Math.pow(b,2)+Math.pow(c,2)) {
                System.out.println("TRIANGULO OBTUSANGULO");
            } else {
                System.out.println("TRIANGULO ACUTANGULO");
            }

            if (a == b && b == c){
                System.out.println("TRIANGULO EQUILATERO");
            } else if (a == b || b == c) {
                System.out.println("TRIANGULO ISOSCELES");
            } else {
                System.out.println("TRIANGULO ESCALENO");
            }

        } else {
            System.out.println("NAO FORMA TRIANGULO");
        }


    }
}
