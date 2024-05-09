package Lista_De_Exercicios_2;
import java.util.Scanner;

public class Exercicio1s {

    public static void main(String[] args) {
        int a,b,c,d,soma;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite 4 números:");
        a = entrada.nextInt();
        b = entrada.nextInt();
        c = entrada.nextInt();
        d = entrada.nextInt();

        soma = a + b + c + d;

        System.out.println("A soma é: " + soma);


    }
}
