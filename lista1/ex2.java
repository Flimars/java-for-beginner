
/*
2. O algoritmo deve ter como entrada um número real e a saída deve ser o valor
atualizado com os 20%.
*/
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double numEntrada = 0.0, numSaida = 0.0;
        double percentual = 0.2;

        System.out.println("Digite um número real: ");
        numEntrada = in.nextDouble();

        numSaida = numEntrada + (numEntrada * percentual);

        System.out.println("Valor " + numEntrada + " acrescido em 20% é: " + numSaida);

    }
}
