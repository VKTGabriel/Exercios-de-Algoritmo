package Lista_De_Exercicios_3;

import java.util.Scanner;
import java.lang.Math;
import java.util.Locale;

public class Exercicio18s {

    public static void main(String[] args) {
        int h1,h2,h3,escolha;
        String travaDivisao, travaResto;
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite dois números inteiros:");
        h1 = ler.nextInt();
        h2 = ler.nextInt();

        if (h2 == 0){
            travaDivisao = "Calculo Impossível";
            travaResto = "Calculo Impossível";
        } else {
            travaDivisao = h1 + " / " + h2;
            travaResto = h1 + " % " + h2;
        }

        System.out.println("Qual operação deseja realizar?\n1- Soma dos números [" + h1 + " + " + h2 + "]\n2- Diferença dos números [" + h1 + " - " + h2 + "]\n3- Produto dos números [" + h1 + " X " + h2 + "]\n4- Divisão dos números [" + travaDivisao + "]\n5- Resto da divisão dos números [" + travaResto + "]\n6- Potenciação de um número pelo outro [" + h1 + "^" + h2 + "]\n7- Raiz Quadrada de ambos os números\n8- Inverter a posição dos números informados");
        escolha = ler.nextInt();

        if (escolha == 8){
            h3 = h1;
            h1 = h2;
            h2 = h3;
            h3 = 0;

            if (h2 == 0){
                travaDivisao = "Calculo Impossível";
                travaResto = "Calculo Impossível";
            } else {
                travaDivisao = h1 + " / " + h2;
                travaResto = h1 + " % " + h2;
            }

            System.out.println("Qual operação deseja realizar?\n1- Soma dos números [" + h1 + " + " + h2 + "]\n2- Diferença dos números [" + h1 + " - " + h2 + "]\n3- Produto dos números [" + h1 + " X " + h2 + "]\n4- Divisão dos números [" + travaDivisao + "]\n5- Resto da divisão dos números [" + travaResto + "]\n6- Potenciação de um número pelo outro [" + h1 + "^" + h2 + "]\n7- Raiz Quadrada de ambos os números");
            escolha = ler.nextInt();
        };

        if (escolha == 1){
            System.out.println("A soma dos números é: " + (h1+h2));
        } else if (escolha == 2){
            System.out.println("A diferença dos números é: " + (h1-h2));
        } else if (escolha == 3){
            System.out.println("O produto dos números é: " + (h1*h2));
        } else if (escolha == 4 && h2 != 0){
            double d1 = h1;
            double d2 = h2;
            System.out.printf("A divisão dos números é: %.2f", d1/d2);
        } else if (escolha == 5 && h2 != 0){
            System.out.println("O resto da divisão dos números é: " + (h1%h2));
        } else if (escolha == 6){
            System.out.println("A potenciação " + h1 + "^" + h2 + " é: " + Math.pow(h1,h2));
        } else if (escolha == 7){
            System.out.println("A raiz de " + h1 + " é: " + Math.sqrt(h1) + "\n" + "A raiz de " + h2 + " é: " + Math.sqrt(h2));
        } else {
            System.out.println("Nenhuma opção válida foi selecionada");
        };

    }
}

