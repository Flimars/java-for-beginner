package lista8;
import java.util.Scanner;

/* 3. Faça um programa onde você declara um vetor de 10 posições que receba
respectivamente 10 valores do tipo float (você deverá digitá-los via teclado).
Apresente então, a média desses 10 valores.
*/

public class l8ex03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);       
        float [] vetor;   // Declara a array variável. 
        vetor = new float [10];  // cria o array; Inicializa com um objeto array.
        float media = 0.0f;

        System.out.println("Informe 10 elementos para o vetor");
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Digite o %dº elemento dos  vetor: ", i + 1);
            vetor[i] = in.nextFloat();
            media += vetor[i]/10;
        }
        System.out.printf("A Média dos Valores é %.2f\n", media);        
    }
    
}
