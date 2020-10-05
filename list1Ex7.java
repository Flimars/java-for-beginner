
/**
 * list1Ex7 - 7. Construa um algoritmo que dadas as entradas: distância do
 * trajeto e velocidade média da viagem, informe o tempo que uma família levará
 * saindo de sua cidade de férias até o destino previsto. Após o cálculo, o
 * algoritmo deve mostrar o tempo calculado.
 */
import java.util.Scanner;

public class list1Ex7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float distancia = 0, tempoViagem = 0, velocMedia = 80;

        System.out.println("Digite a distância do trajeto: ");
        distancia = in.nextFloat();
        System.out.println("Digite a velocidade média: ");
        velocMedia = in.nextFloat();

        tempoViagem = 60 * (distancia / velocMedia);

        System.out.println("O tempo de deslocamento é de " + tempoViagem + " minutos.");

    }

}