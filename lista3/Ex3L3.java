package lista3;
/*  Ler três valores (considere que não serão informados valores iguais) e escrever a
soma dos dois maiores.
*/


import java.util.Scanner;

public class Ex3L3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;
        int soma = 0;
        System.out.println("Digite 3 números distintos: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        if (num1 > num2 && num2 > num3){
            soma = num1 + num2;
            System.out.println("A Soma de " + num1 + " + " + num2 +" é: " + soma);
        } else if (num2 > num1 && num3 > num1){
            soma = num2 + num3;
            System.out.println("A Soma de " + num2 + " + " + num3 +" é: " + soma);
        } else if(num3 > num2 && num1 > num2){
            soma = num3 + num1;
            System.out.println("A Soma de " + num3 + " + " + num1 +" é: " + soma);
        }
    }
}
