import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args){
        double a,b,c;
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite a primeira  do aluno:");
        a = ler.nextDouble();
        System.out.println("Digite a segunda  do aluno:");
        b = ler.nextDouble();
        System.out.println("Digite a terceira  do aluno:");
        c = ler.nextDouble();

        System.out.printf("A média do aluno é: %.1f", ((a*2)+(b*3)+(c*5))/10);

    }
}
