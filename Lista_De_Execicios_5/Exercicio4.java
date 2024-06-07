import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num = 0, cont =0, n = 0;

        System.out.println("Digite um número intiro maior que 100:");
        num = ler.nextInt();
        if (num > 100) {
            cont = num;
            while (num > 0) {
                if (cont % num == 0) {
                    n++;
                }
                num--;
            }

            if (n == 2){
                System.out.printf("É primo");
            } else {
                System.out.printf("Não é primo");
            }

        } else {
            System.out.println("Número Inválido");
        }


    }
}
