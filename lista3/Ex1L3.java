package lista3;
/* Ler um valor e escrever se é positivo, negativo ou zero.
* */

import java.util.Scanner;

public class Ex1L3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;

        System.out.println("Digite um número: ");
        numero = sc.nextInt();

        if (numero > 0 ) {
            System.out.println("Número é positivo");
        } else if (numero < 0){
            System.out.println("Número é negativo");
        } else {
            System.out.println("É zero");
        }


    }
}
