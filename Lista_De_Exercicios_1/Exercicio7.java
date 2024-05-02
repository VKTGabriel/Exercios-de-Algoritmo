package Lista_De_Exercicios_1;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        int num;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número para análise:");
        num = ler.nextInt();

        int control = 0;

        for (int i=2; i<=num; i++){
            if (num%i==0 && num!=i){
                control = 1;
                break;
            }
        }

        if (control!=1){
            System.out.println(num + " é primo");
        } else {
            System.out.println(num + " não é primo");
        }
    }
}
