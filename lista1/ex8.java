
/**
 * list1Ex8 - 8. Desenvolva o algoritmo para calcular o resultado de uma eleição
 * municipal. A entrada de dados será: ● ● ● ● Número total de eleitores;
 * Número de votos válidos; Número de votos brancos; Número de votos nulos. O
 * algoritmo deve calcular e exibir para o usuário as seguintes informações (em
 * relação ao total de eleitores): ● ● ● Percentual de votos válidos; Percentual
 * de votos brancos; Percentual de votos nulos;
 */

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float numTotEleitores = 0, numVotVal = 0, numvotBranco = 0, numVotNulos = 0;
        float percvotVal = 0, percVotbrancos = 0, percVotNulos = 0;

        System.out.println("Informe o Total de Eleitores: ");
        numTotEleitores = in.nextInt();
        System.out.println("Informe o Número de Votos Válidos: ");
        numVotVal = in.nextInt();
        System.out.println("Informe o Número de Votos em Branco: ");
        numvotBranco = in.nextInt();
        System.out.println("Informe o de Votos Nulos: ");
        numVotNulos = in.nextInt();

        percvotVal = (numVotVal / numTotEleitores) * 100;
        percVotbrancos = (numvotBranco / numTotEleitores) * 100;
        percVotNulos = (numVotNulos / numTotEleitores) * 100;

        System.out.println("O percentual de votos válidos corresponde a: " + percvotVal + "%");
        System.out.println("O percentual de votos brancos corresponde a: " + percVotbrancos + "%");
        System.out.println("O percentual de votos nulos corresponde a: " + percVotNulos + "%");

    }

}
