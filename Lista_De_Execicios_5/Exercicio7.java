import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        int quant_pos = 0, quant_neg = 0, soma_pos = 0, soma_neg = 0, num = 0;
        Scanner ler = new Scanner(System.in);
        int i = 0;
        while (i < 15){
            System.out.println("Digite um número inteiro diferente de zero):");
            num = ler.nextInt();
            if (num != 0){
                if (num > 0) {
                    quant_pos += 1;
                    soma_pos += num;
                } else {
                    quant_neg += 1;
                    soma_neg += num;
                }
                i++;
            } else {
                System.out.println("Número inválido");
            }

        }

        System.out.printf("Quantidade números positivos: %d\nQuantidade números negativos: %d\nSoma dos números positivos: %d\nSoma dos números negativos: %d\n",
                quant_pos, quant_neg, soma_pos, soma_neg);
    }
}
