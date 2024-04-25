import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite 5 números:");
        a = ler.nextInt();
        b = ler.nextInt();

        if (a>b){
            c = a;
            a = b;
            b = c;
            c = 0;
        }

        c = ler.nextInt();
        if (c>b || c<a){
            if (c>b){
                b = c;
            } else {
                a = c;
            }
        }

        c = ler.nextInt();
        if (c>b || c<a){
            if (c>b){
                b = c;
            } else {
                a = c;
            }
        }

        c = ler.nextInt();
        if (c>b || c<a){
            if (c>b){
                b = c;
            } else {
                a = c;
            }
        }

        System.out.println("Maior: " + b + "\n" + "Menor: " + a);
    }
}
