package Lista_De_Exercicios_3;

import java.util.Scanner;

public class Exercicio24s {

    public static void main(String[] args) {
        int a,b,c;
        String s;

        Scanner ler = new Scanner(System.in);
        System.out.println("Envie 3 números:");
        a = ler.nextInt();
        b = ler.nextInt();
        c = ler.nextInt();

        if(a>b && a>c){
            if(b>c){
                s = c + ", " + b + ", " + a;
            } else {
                s = b + ", " + c + ", " + a;
            };
        } else if (b>a && b>c){
            if(a>c){
                s = c + ", " + a + ", " + b;
            } else {
                s = a + ", " + c + ", " + b;
            };
        } else {
            if(b>a){
                s = a + ", " + b + ", " + c;
            } else {
                s = b + ", " + a + ", " + c;
            };
        };

        System.out.println("Em ordem: " + s);
    }
}
