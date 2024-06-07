import java.util.Scanner;
import java.lang.Math;

public class Exercicio5 {
    public static void main(String[] args) {
        int a, b, i;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite dois números inteiros:");
        a = ler.nextInt();
        b = ler.nextInt();

        i = (Math.max(a,b) - 1);
        while (i > Math.min(a,b)) {
            if (i%2 == 0){
                System.out.printf("%d\t", i);
            }
            i--;
        }
    }
}
