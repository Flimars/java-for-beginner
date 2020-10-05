
/**
 * list1Ex9 - 9. Considere que você deseja uma comemoração especial para o seu
 * aniversário e assim irá convidar familiares a amigos para um churrasco na sua
 * residência. Você irá precisar comprar a carne a ser consumida pelos seus
 * convidados, logo precisa de uma forma de calcular a quantidade certa a ser
 * adquirida. Desenvolva o algoritmo do programa para auxiliar no cálculo da
 * quantidade de carne bovina (sem osso) a ser comprada considerando que homens,
 * mulheres e crianças consomem uma quantidades diferentes de carne. Consumo de
 * carne (http://www.embaixadordochurrasco.com.br/calculochurrasco): médio
 * Homens: 400 gramas Mulheres: 320 gramas Crianças: 200 gramas Observação:
 * geralmente é adicionada uma margem de segurança na quantidade de carne a ser
 * comprada para evitar que falte. Adicione uma margem de segurança de 20% no
 * total de carne a ser adquirida.
 */
import java.util.Scanner;
//import java.lang.inint;

public class list1Ex9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int crianca = 200, homem = 400, mulher = 320;
        int numCria = 0, numHome = 0, numMulhe = 0;
        int somaTot = 0, totCria = 0, totHome = 0, totMulhe = 0;
        double margemSeg = 0;
        double totalCarne = 0;

        System.out.println("Informe o Número de Crianças: ");
        numCria = in.nextInt();
        System.out.println("Informe o Número de Mulheres: ");
        numMulhe = in.nextInt();
        System.out.println("Informe o Número de Homens: ");
        numHome = in.nextInt();

        totCria = numCria * crianca;
        totMulhe = numMulhe * mulher;
        totHome = numHome * homem;
        somaTot = (totCria + totMulhe + totHome);
        margemSeg = (somaTot * 0.2);
        totalCarne = (totCria + totMulhe + totHome + margemSeg) / 1000;

        System.out.println("A Quantidade Certa de carne é: " + totalCarne + " Kilogramas");

    }

}