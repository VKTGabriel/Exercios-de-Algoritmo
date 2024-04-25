import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        int a;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número:");
        a = ler.nextInt();

        System.out.println("Número: " + a + "\n" + "Sucessor: " + (a+1) + "\n" + "Antecessor: " + (a-1));

    }
}
