package desafios;
/*  Elebore um programa que possua as caracteristicas abaixo:
    1. Leia os dados de um CPF no formato XXX.YYY.ZZZ-DD;
    2. Imprima os quatro grupos númericos sendo um valor por linha.

    Entrada: A entrada consiste vários arquivos de teste e cada um posssuindo uma linha com formato
    XXX.YYY.ZZZ-DD, onde XXX, YYY, ZZZ, DD são números inteiros.

    Saída: Para cada arquivo da entrada, trm que ter um arquivo de saída com quatro linhas, e em cada
    linha um número inteiro de acordo com procedimento 2 descrito no desafio. Confira o exemplo abaixo:

LINHA                ENTRADA                     SAÍDA
 1             000.000.000-00                 000
 2                                            000
 3                                            000
 4                                            00
* */

import java.util.Locale;
import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));

        Scanner input = new Scanner(System.in);

        String[] cpf = new String[4];

//        Desenvolva aqui sua solução
        cpf = input.nextLine().split("   ");

        for (int i = 0; i < cpf.length; i++) {
            System.out.printf("%s\n", cpf[i].replace(".", "\n").replaceAll("-", "\n"));
        }

        String password = "p90182fnKZg";
        System.out.println(password);

        password = password.replaceAll("[a-zA-Z0-9]", "*");
        System.out.printf("%s\n", password );




        input.close();
    }
}
