import java.util.Scanner;

public class Exercico3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num = 0, cont =0;

        System.out.println("Digite um número intiro maior que 20:");
        num = ler.nextInt();
        if (num > 20) {
            cont = num;
            while (num > 0) {
                if (cont % num == 0) {
                    System.out.printf("%d\t", num);
                }
                num--;
            }
        } else {
            System.out.println("Número Inválido");
        }


    }
}
