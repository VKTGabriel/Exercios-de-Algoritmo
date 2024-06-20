package Lista_De_Exercicios_1;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        int a,b;

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite 2 números inteiros:");
        a = ler.nextInt();
        b = ler.nextInt();

        if (a>b){
            int c;
            c = a;
            a = b;
            b = c;
        }

        if (a%2 == 0){
            a += 1;
        } else {
            a +=2;
        }

        if (b%2 == 0){
            b -= 1;
        } else {
            b -=2;
        }

        int s = 0;
        for (int i = a; i<=b; i+=2){
            s += i;
        }

        System.out.printf("\n%d\n", s);

    }
}
