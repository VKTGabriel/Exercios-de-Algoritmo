package Lista_De_Exercicios_2;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio3s {

    public static void main(String[] args) {
        double salario;
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o seu sal�rio:");
        salario = entrada.nextDouble();

        System.out.printf("Seu novo sal�rio �: R$%.2f", salario*1.25);
    }
}

