
/*
3. Desenvolva o algoritmo de um programa onde o usuário irá informar um número
inteiro e o programa deve calcular e exibir quadrado do número informado pelo
usuário.
*/
import java.util.Scanner;

public class list1Ex3 {

    public static void main(String[] aStrings) {
        Scanner in = new Scanner(System.in);
        int numero = 0, quadrado = 0;

        System.out.println("Digite um número inteiro: ");
        numero = in.nextInt();

        quadrado = numero * numero;

        System.out.println("O quadrado de " + numero + " é " + quadrado);

    }
}