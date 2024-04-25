import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args){
        int segDeclarado, hora, min, seg;
        String h,m,s;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o tempo em segundos:");
        segDeclarado = ler.nextInt();

        hora = segDeclarado/3600;
        min = (segDeclarado%3600)/60;
        seg = (segDeclarado%3600)%60;

        if (hora < 10){
            h = "0"+hora;
        } else {
            h = ""+hora;
        }

        if (min < 10){
            m = "0"+min;
        } else {
            m = ""+min;
        }

        if (seg < 10){
            s = "0"+seg;
        } else {
            s = ""+seg;
        }



        System.out.println("Horario formatado: " + h + ":" + m + ":" + s);


    }
}
