package lista3;
/*  Ler três valores (considere que não serão informados valores iguais) e escrever o
maior deles.
*/

import java.util.Scanner;

public class Ex2L3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Digite 3 números distintos: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3){
            System.out.printf("O maior é %d\n", num1);
        } else if (num2 > num1 && num2 > num3){
            System.out.printf("O maior é %d\n", num2);
        } else {
            System.out.printf("O maior é %d\n", num3);
        }

    }
}
