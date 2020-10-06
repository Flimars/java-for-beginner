
/**
 * 2. Escreva um algoritmo para ler as dimensões de um retângulo (base e
 * altura), calcular e escrever a área e o perímetro do retângulo. 
 * Fórmula --> P = 2 * (b + h) ou P = (2.b) + (2.h).
 */
import java.util.Scanner;

public class list2Ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int b = 0, h = 0, ap = 0;

        System.out.print("Informe a medida da base:  \n");
        b = in.nextInt();
        System.out.print("Informe a medida da altura:  \n");
        h = in.nextInt();

        ap = 2 * (b + h);

        System.out.println("Área do Perimetro é  = " + ap + " metros");

    }

}