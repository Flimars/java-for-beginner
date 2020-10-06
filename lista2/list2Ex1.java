
/* 
01. Faça um algoritmo que converta metros para centímetros. Lembrando que 1m =
100cm
*/
import java.util.Scanner;

public class list2Ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float conversor = 0, cm = 100, mts = 0;

        System.out.print("Digite a medida em metros: ");
        mts = in.nextFloat();

        conversor = mts * cm;

        System.out.print("A medida de " + mts + " metros");
        System.out.print(" corresponde a " + conversor + " centimetros.\n");

    }

}
