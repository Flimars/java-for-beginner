
import java.util.Scanner;

public class list2Ex8 {
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
        // printf(%.2f) - pega o argumento e imprime com 2 casas depois da vírgula.
        // printf (\b Backspace) -
        System.out.printf("O percentual de votos válidos é %.2f\b\n:", percvotVal);
        System.out.printf("O percentual de votos brancos é %.2f\b\n:", percVotbrancos);
        System.out.printf("O percentual de votos nulos é %.2f\b\n:", percVotNulos);

    }

}