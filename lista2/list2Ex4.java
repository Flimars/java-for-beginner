
/**
 * 4. Escreva um programa que faça a leitura de dois valores inteiros e descubra
 * qual deles é o maior, imprimindo na resposta o nome da variável e o seu
 * valor.
 */
import java.util.Scanner;

public class list2Ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int valor1 = 0, valor2 = 0;

        System.out.print("Digite um valor inteiro: ");
        valor1 = in.nextInt();
        System.out.print("Digite outro valor inteiro: ");
        valor2 = in.nextInt();

        if (valor1 > valor2) {
            System.out.println(valor1 + " é o maior.");

        } else {
            System.out.println(valor2 + " é o maior.");

        }
    }
}