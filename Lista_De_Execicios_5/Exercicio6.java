import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        int n, ant = 0, atual = 0, soma = 0;
        Scanner ler = new Scanner(System.in);
        System.out.println("Escolha uma posição para verificar na sequencia de Fibonacci:");
        n = ler.nextInt();
        if (n>3){
            int i = 4;
            ant = 1;
            atual = 1;
            while (i<=n){
                soma = ant+atual;
                ant = atual;
                atual = soma;
                i++;
            }
            System.out.println("Valor: " + atual);

        } else if (n>1){
            System.out.println("Valor: " + 1);
        } else if (n==1){
            System.out.println("Valor: " + 0);
        } else {
            System.out.println("Posição Inválida");
        }
    }
}
