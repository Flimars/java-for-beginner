/* 1. Desenvolva o algoritmo de um programa onde o usuário irá informar um número
inteiro e o programa deve calcular e exibir o número imediatamente antecessor ao
número digitado pelo usuário.
*/
import java.util.Scanner;

public class ex1{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = 0;
        int antecessor = 0;

        System.out.println("Digite um Número inteiro: ");
        num = in.nextInt();

        antecessor = num - 1;

        System.out.println("O Antecessor do seu Número é: " + antecessor);

    }
}

