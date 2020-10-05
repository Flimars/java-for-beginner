
/*
 * list1Ex6 - 6. Desenvolva o algoritmo de um programa para calcular a média de duas notas
 * das avaliações de um aluno.
 */
import java.util.Scanner;

public class list1Ex6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float media = 0, nota1 = 0, nota2 = 0;

        System.out.println("Informe a valor da  1º Nota: ");
        nota1 = in.nextFloat();
        System.out.println("Informe a valor da 2º Nota: ");
        nota2 = in.nextFloat();

        media = (nota1 + nota2) / 2;

        System.out.println("A Nota Média do Aluno é: " + media);

    }

}