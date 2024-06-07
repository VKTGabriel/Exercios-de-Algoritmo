import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num;
        System.out.println("Digite um número inteiro maior que 30:");
        num = ler.nextInt();

        if (num > 30){
            int i = num - 1;
            while (i > 0){
                if (i%2 ==0 || i%7 == 0){
                    System.out.printf("%d\t", i);
                }
                i--;
            }
        } else {
            System.out.println("Número inválido");
        }
    }
}
