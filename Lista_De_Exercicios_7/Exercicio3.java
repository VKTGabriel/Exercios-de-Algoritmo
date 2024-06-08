package Lista_De_Exercicios_7;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        int a = 0, e = 0, i = 0, o = 0, u = 0;
        String frase;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        frase = sc.nextLine();

        for (int cont = 0; cont < frase.length(); cont++) {
            switch (frase.toLowerCase().charAt(cont)) {
                case 'a':
                    a++;
                    break;
                case 'e':
                    e++;
                    break;
                case 'i':
                    i++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'u':
                    u++;
                    break;
            }
        }

        System.out.printf("Quantidade Letras A: %d\nQuantidade Letras E: %d\nQuantidade Letras I: %d\nQuantidade Letras O: %d\nQuantidade Letras U: %d\n",
                a, e, i, o, u);
    }
}
