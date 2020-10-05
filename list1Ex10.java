
/**
 * list1Ex10 - 10. Desenvolva um algoritmo que será utilizado para automatizar o
 * cálculo do público e da renda total de um evento esportivo. Este evento
 * esportivo possui um valor fixo cobrado por ingresso, no entanto, os sócios do
 * clube em cujas dependências ocorre o evento possuem um desconto de 30% no
 * valor do ingresso e as crianças menores de 10 anos não pagam ingresso.
 * Baseado nos dados acima apresentados o usuário deverá digitar 4 informações
 * de entrada para o sistema, são elas: - Valor de cada ingresso - Número de
 * pessoas (público do evento) que são sócias do clube - Número de pessoas
 * (público do evento) não pagantes (menores de 10 anos) - Número de pessoas
 * (público do evento) pagantes (sem desconto algum) O algoritmo deverá calcular
 * e exibir o público total do evento, a renda total do evento e o valor que
 * deixou de ser arrecadada devido aos descontos e isenções.
 * 
 */
import java.util.Scanner;

public class list1Ex10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numintegral = 0, numcortesia = 0, numdesconto = 0, numTotpublico = 0;
        float valTotPagantes = 0, valTotCortesias = 0, valTotSocios = 0, totalPublico = 0;
        float rendaTotal = 0, rendaPerdida = 0, valorIntegral = 0, valTotDescontos = 0;
        float desconto = (float) (0.3), percDesconto = (float) (0.7);

        System.out.println("Digite o valor do ingresso integral R$: ");
        valorIntegral = in.nextFloat();
        System.out.println("Digite o número de pagantes integral: ");
        numintegral = in.nextInt();
        System.out.println("Digite o de pagantes com desconto: ");
        numdesconto = in.nextInt();
        System.out.println("Digite o número de Cortesia: ");
        numcortesia = in.nextInt();

        valTotPagantes = numintegral * valorIntegral;
        valTotSocios = (numdesconto * valorIntegral) * percDesconto;
        valTotDescontos = (numdesconto * valorIntegral) * desconto;
        valTotCortesias = numcortesia * valorIntegral;

        rendaPerdida = valTotCortesias + valTotDescontos;
        rendaTotal = valTotPagantes + valTotSocios;
        totalPublico = (numcortesia + numdesconto + numintegral);

        System.out.println("Total NÃO arrecadado com descontos e cortesias R$: " + rendaPerdida);
        System.out.println("Arrecadação Total R$ " + rendaTotal);
        System.out.println("Total de público " + totalPublico);

    }

}