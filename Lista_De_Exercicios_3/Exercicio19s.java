package Lista_De_Exercicios_3;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio19s {

    public static void main(String[] args) {
        double a,b;
        int h1,h2;
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite a quantidade de horas trabalhadas pelo primeiro professor:");
        h1 = ler.nextInt();
        System.out.println("Digite agora o valor que este profissional recebe por horas trabalhadas:");
        a = ler.nextDouble();

        System.out.println("Digite a quantidade de horas trabalhadas pelo segundo professor:");
        h2 = ler.nextInt();
        System.out.println("Digite agora o valor que este profissional recebe por horas trabalhadas:");
        b = ler.nextDouble();

        if((h1*a)==(h2*b)){
            System.out.println("Ambos recebem o mesmo salário");
        } else {
            if((h1*a)>(h2*b)){
                System.out.println("O primeiro professor recebe o maior salário");
            } else {
                System.out.println("O segundo professor recebe o maior salário");
            }
        }


    }

}

