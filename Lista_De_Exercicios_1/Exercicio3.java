package Lista_De_Exercicios_1;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio3 {
    public static void main(String[] args) {
        double valor;
        double[] moedas = {1,0.50,0.25,0.10,0.05,0.01};
        int[] notas = {100,50,20,10,5,2};

        Scanner ler = new Scanner(System.in).useLocale(Locale.US);
        Locale.setDefault(Locale.US);
        DecimalFormat formatar = new DecimalFormat("0.00");

        System.out.println("Digite o valor que você deseja decompor:");
        valor = ler.nextDouble();

        int troco = 0;
        if (valor > 0 && valor <=1000000){

            if (valor > 2) {
                System.out.println("\nNOTAS:");
                for (int i = 0; i < notas.length; i++){
                    troco = (int) (valor/notas[i]);
                    if (troco > 0){
                        System.out.println(troco + " nota(s) de R$ " + notas[i] + ".00");
                        valor -= troco*notas[i];
                    }
                }
            }

            if (valor > 0) {
                System.out.println("\nMOEDAS:");
                for (int i = 0; i < moedas.length; i++){
                    troco = (int) (valor/moedas[i]);
                    if (troco > 0){
                        System.out.printf("%d moedas(s) de R$ %.2f\n", troco, moedas[i]);
                        valor = Double.parseDouble(formatar.format(valor%moedas[i]));
                    }
                }
            }

        } else {
            System.out.println("Valor inválido");
        }
    }
}
