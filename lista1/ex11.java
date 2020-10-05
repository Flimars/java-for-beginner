
/**
 * list1Ex11 - 11. Desafio 01 - Desenvolva um algoritmo para fazer o cálculo de
 * Bhaskara. O algoritmo deve considerar que o valor de delta calculado será
 * sempre positivo. E deve pedir para o usuário informar os valores a, b, c da
 * equação de segundo grau. No fim, o algoritmo deve mostrar os valores de x1 e
 * x2 (xis linha e duas linhas). Considere uma nova instrução raizq que calcula
 * a raiz quadrada do número passado por parâmetro (dentro dos parênteses).
 * Exemplo: raizq(64) resulta em 8.
 * 
 */
import java.util.Scanner;
import java.lang.*;

public class ex11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0, b = 0, c = 0;
        float delta = 0;
        float x1 = 0, x2 = 0;

        System.out.println("Digite valor de A: ");
        a = in.nextInt();
        System.out.println("Digite valor de B: ");
        b = in.nextInt();
        System.out.println("Digite valor de C: ");
        c = in.nextInt();

        delta = (b * b) - (4 * a * c);
        x1 = (float) (-b + Math.sqrt(delta) / 2 * a);
        x2 = (float) (-b - Math.sqrt(delta) / 2 * a);

        System.out.println("A solução para X1 é: " + x1);
        System.out.println("A solução para X1 é: " + x2);

    }

}
