package desafios;
/*  Voc^de fazer a leitura de 5 valores inteiros. Em seguida mostre quantos valores informados são pares, quantos
impares, , quantos valores são positivos e quantos são negativos.
Exemplo:
  Entrada       Saída
    -5          3 Valor(es) par(es)
     0          2 Valor(es) impar(es)
    -3          1 Valor(es) positivo(s)
    -4          3 Valor(es) negativo(s)
    12

* */

import java.util.Scanner;

public class Desafio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        declare suas variaveis corretamente
        int par = 0;
        int impar = 0;
        int positivo = 0;
        int negativo = 0;
        int numero = 0;
        int contador = 5;

//        elabore sua solução
        for (int i = 0; i < contador; i++) {
            System.out.println("Digite o " + (i + 1) + "º valor: ");
            numero = input.nextInt();
            if (numero % 2 == 0){
                par ++;
            }
            if (numero % 2 != 0){
                impar ++;
            }
            if (numero > 0){
                positivo ++;
            }
            if (numero < 0){
                negativo ++;
            }
        }

//        imprima suas variaveis corretamente
        System.out.println(par + " Valor(es) par(es)");
        System.out.println(impar + " Valor(es) ímpar(es)");
        System.out.println(positivo + " Valor(es) positivo(s)");
        System.out.println(negativo + " Valor(es) negativo(s)");
    } //end main

}  //class