package desafios;
/*  Crie um programa que leia 6 valores. Você poderá receber valores negativos e/ou positivos como entrada,
    devendo desconsiderar os valores nulos. Em seguida, apresente a quantidade de valores positivos digitados.
* */

import java.util.Scanner;

public class Desafio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        declare suas variaveis corretamente
        int positivo = 0;
        double numero = 0;
        int contador = 6;

//        elabore sua solução
        for (int i = 0; i < contador; i++) {
            System.out.println("Digite o " + (i + 1) + "º valor: ");
            numero = input.nextDouble();
            if (numero >= 0) {
                positivo++;
            }
        }
        System.out.println(positivo + " Valores positivos");
    }
}
