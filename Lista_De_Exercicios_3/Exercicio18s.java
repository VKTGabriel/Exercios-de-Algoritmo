package Lista_De_Exercicios_3;

import java.util.Scanner;
import java.lang.Math;
import java.util.Locale;

public class Exercicio18s {

    public static void main(String[] args) {
        int h1,h2,h3,escolha;
        String travaDivisao, travaResto;
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite dois n�meros inteiros:");
        h1 = ler.nextInt();
        h2 = ler.nextInt();

        if (h2 == 0){
            travaDivisao = "Calculo Imposs�vel";
            travaResto = "Calculo Imposs�vel";
        } else {
            travaDivisao = h1 + " / " + h2;
            travaResto = h1 + " % " + h2;
        }

        System.out.println("Qual opera��o deseja realizar?\n1- Soma dos n�meros [" + h1 + " + " + h2 + "]\n2- Diferen�a dos n�meros [" + h1 + " - " + h2 + "]\n3- Produto dos n�meros [" + h1 + " X " + h2 + "]\n4- Divis�o dos n�meros [" + travaDivisao + "]\n5- Resto da divis�o dos n�meros [" + travaResto + "]\n6- Potencia��o de um n�mero pelo outro [" + h1 + "^" + h2 + "]\n7- Raiz Quadrada de ambos os n�meros\n8- Inverter a posi��o dos n�meros informados");
        escolha = ler.nextInt();

        if (escolha == 8){
            h3 = h1;
            h1 = h2;
            h2 = h3;
            h3 = 0;

            if (h2 == 0){
                travaDivisao = "Calculo Imposs�vel";
                travaResto = "Calculo Imposs�vel";
            } else {
                travaDivisao = h1 + " / " + h2;
                travaResto = h1 + " % " + h2;
            }

            System.out.println("Qual opera��o deseja realizar?\n1- Soma dos n�meros [" + h1 + " + " + h2 + "]\n2- Diferen�a dos n�meros [" + h1 + " - " + h2 + "]\n3- Produto dos n�meros [" + h1 + " X " + h2 + "]\n4- Divis�o dos n�meros [" + travaDivisao + "]\n5- Resto da divis�o dos n�meros [" + travaResto + "]\n6- Potencia��o de um n�mero pelo outro [" + h1 + "^" + h2 + "]\n7- Raiz Quadrada de ambos os n�meros");
            escolha = ler.nextInt();
        };

        if (escolha == 1){
            System.out.println("A soma dos n�meros �: " + (h1+h2));
        } else if (escolha == 2){
            System.out.println("A diferen�a dos n�meros �: " + (h1-h2));
        } else if (escolha == 3){
            System.out.println("O produto dos n�meros �: " + (h1*h2));
        } else if (escolha == 4 && h2 != 0){
            double d1 = h1;
            double d2 = h2;
            System.out.printf("A divis�o dos n�meros �: %.2f", d1/d2);
        } else if (escolha == 5 && h2 != 0){
            System.out.println("O resto da divis�o dos n�meros �: " + (h1%h2));
        } else if (escolha == 6){
            System.out.println("A potencia��o " + h1 + "^" + h2 + " �: " + Math.pow(h1,h2));
        } else if (escolha == 7){
            System.out.println("A raiz de " + h1 + " �: " + Math.sqrt(h1) + "\n" + "A raiz de " + h2 + " �: " + Math.sqrt(h2));
        } else {
            System.out.println("Nenhuma op��o v�lida foi selecionada");
        };

    }
}

