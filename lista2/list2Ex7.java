import java.util.Scanner;

/**
 * . Faça um algoritmo que pergunte quanto a pessoa ganha por hora (salário por
 * hora) e o número de horas trabalhadas no mês. Calcule e mostre o total do seu
 * salário no referido mês e qual será seu salário atual. Calcule também o
 * salário líquido (desconto de impostos) considerando 15% de impostos e mostre
 * esses valores. a. Pergunte ao usuário qual a % de imposto que é descontada do
 * salário.
 */
import java.util.Scanner;

public class list2Ex7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float salHora = 0, salMes = 0, salAtual = 0, salLiq, descImp = 0, percImp = 0;
        int numHoraTrbl = 0;

        System.out.print("Quanto é seu salário hora?: ");
        salHora = in.nextFloat();
        System.out.println("Quantidade de horas trabalhadas no mês?: ");
        numHoraTrbl = in.nextInt();
        System.out.println("Qual percentual de imposto é descontado sobre o salário?: ");
        percImp = in.nextFloat();

        salMes = (salHora * numHoraTrbl);
        descImp = salMes * (percImp / 100);
        salLiq = (salMes - descImp);

        System.out.printf("Salário do Mês R$ %.2f\b\n", salMes);
        System.out.printf("Salário Liquido R$ %.2f\b\n", salLiq);
        System.out.printf("Valor de impostos descontos sobre salário: R$ %.2f\b\n", descImp);

    }

}