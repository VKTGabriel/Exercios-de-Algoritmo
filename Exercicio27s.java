import java.util.Scanner;
import java.util.Locale;

public class Exercicio27s {

    public static void main(String[] args) {
        String prod;
        int quant;
        double valor, desc;


        Scanner ler = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Qual o produto adquirido?");
        prod = ler.nextLine();
        System.out.println("Qual a quantidade de adquirida?");
        quant = ler.nextInt();
        System.out.println("Qual o valor unitário do produto?");
        valor = ler.nextDouble();

        System.out.println("Produto: " + prod);
        System.out.printf("Preço final: %.2f \n", quant*valor);

        if (quant <= 5){
            desc = quant*valor*0.02;
        } else if (quant <=10){
            desc = quant*valor*0.03;
        } else {
            desc = quant*valor*0.05;
        }

        System.out.printf("Desconto: %.2f \n", desc);
        System.out.printf("Total a pagar: %.2f", (quant*valor)-desc);

    }
}