
/**
 * 5. Escreva um programa que faça a leitura de dois valores reais e faça a
 * divisão entre eles se o denominador não for zero. Ao final deve ser impresso
 * o resultado ou uma mensagem de erro.
 */
import java.util.Scanner;

public class list2Ex5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float valor1 = 0, valor2 = 0, resultado = 0;

        System.out.print("Informe o primeiro valor: ");
        valor1 = in.nextFloat();
        System.out.print("Informe o segundo valor: ");
        valor2 = in.nextFloat();

        resultado = valor1 / valor2;

        if (valor2 == 0) {
            System.out.println("Erro - Segundo valor inválido");

        } else {
            System.out.println("O quociente da divisão é " + resultado);
        }

    }

}