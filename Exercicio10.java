import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        int total;
        double valid, branco, nul, verifica;
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual o total de eleitores deste munic�pio?");
        total = ler.nextInt();
        System.out.println("Quantos votos foram validados?");
        valid = ler.nextInt();
        System.out.println("Quantos votos foram Brancos?");
        branco = ler.nextInt();
        System.out.println("E nulos?");
        nul = ler.nextInt();

        verifica = total-valid-branco-nul;

        if (verifica >= 0) {

            System.out.printf("Total de votos: %d", total);
            System.out.printf("\nPercentual de votos V�lidos: %.1f", ((valid * 100) / total));
            System.out.printf("\nPercentual de votos Brancos: %.1f", ((branco * 100) / total));
            System.out.printf("\nPercentual de votos Nulos: %.1f", ((nul * 100) / total));

            if ((verifica) != 0) {
                System.out.printf("\nPercentual de votos N�o declarados: %.1f", (((verifica) * 100) / total));
            }
        } else {
            System.out.println("N�mero de votos detalhados superou o total de votos declarado");
        }


    }
}
