import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args){
        int anos, meses, dias;
        Scanner ler = new Scanner(System.in);

        System.out.println("Quantos anos voc� j� completou?");
        anos = ler.nextInt();
        System.out.println("Quantos meses completos j� se passaram desde seu �ltimo anivers�rio?");
        meses = ler.nextInt();
        System.out.println("Ignorando os meses, qual a diferen�a entre o dia de hoje e o dia do seu anivers�rio?");
        dias = ler.nextInt();

        System.out.println("Sua idade em dias �: " + ((anos*365)+(meses*30)+(dias)));

    }
}
