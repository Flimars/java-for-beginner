package desafios;



import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
//      declarando variaveis
        String valor = "";
        String resposta = "sim";
        String nome = "";
        int mes = 0;
        double total = 0;
        double totalDeReceita = 0;
        double totalDespFixas = 0;
        double totalDespVariaveis = 0;
        double saldoLiteral = 0;
        double saldoPercentual = 0;
        double agua = 0;
        double aluguel = 0;
        double alimentacao = 0;
        double higiene = 0;
        double internet = 0;
        double lazer = 0;
        double luz = 0;
        double telefone = 0;
        double planoSaude = 0;
        double ipva = 0;
        double dpvat = 0;
        double iptu = 0;
        double remedios = 0;
        double variedades = 0;
        double vestuario = 0;
        double alimentacaoFora = 0;
//      receitas
        double salario = 0;
        double beneficio = 0;
        double outraRenda = 0;
        System.out.println("Digite seu Nome: ");
        nome = intro.nextLine();

        System.out.print("Digite o número correspondente ao mês: ");
        mes = intro.nextInt();
        switch (mes){
            case 1:
                System.out.println("mês: Janeiro");
                 break;
            case 2:
                System.out.println("mês: Fevereiro");
                break;
            case 3:
                System.out.println("mês: Março");
                break;
            case 4:
                System.out.println("mês: Abril");
                break;
            case 5:
                System.out.println("mês: Maio");
                break;
            case 6:
                System.out.println("mês: Junho");
                break;
            case 7:
                System.out.println("mês: Julho");
                break;
            case 8:
                System.out.println("mês: Agosto");
                break;
            case 9:
                System.out.println("mês: Setembro");
                break;
            case 10:
                System.out.println("mês: Outubro");
                break;
            case 11:
                System.out.println("mês: Novembro");
                break;
            case 12:
                System.out.println("mês: Dezembro");
                break;
        }

        System.out.print("Informe o valor do Salário: R$ ");
        salario = intro.nextDouble();

        System.out.print("Informe o valor do Benefício: R$ ");
        beneficio = intro.nextDouble();

        System.out.print("Informe o valor de Outra Renda: R$ ");
        outraRenda = intro.nextDouble();

        System.out.print(" Você tem despesas Fixas ? ");
        valor = intro.nextLine().toLowerCase();

        System.out.print("Informe os valores das despesas, a seguir: ");
        System.out.println(" Digite Despesas Fixas");

//      despesas fixas
       System.out.print("O valor do Aluguel: R$ ");
       aluguel = intro.nextDouble();

       System.out.print("O valor da Conta de Água: R$ ");
       agua = intro.nextDouble();

       System.out.print("O valor da Conta de Energia/Luz: R$ ");
       luz = intro.nextDouble();

       System.out.print("O valor da Conta de Internet: R$ ");
       internet = intro.nextDouble();

       System.out.print("O valor da conta de Telefone: R$ ");
       telefone = intro.nextDouble();

       System.out.print("O valor com Alimentação: R$ ");
       alimentacao = intro.nextDouble();

       System.out.print("O valor com Higiene: R$ ");
       higiene = intro.nextDouble();

       System.out.print("O valor com Lazer: R$ ");
       lazer = intro.nextDouble();

       System.out.print("O valor com Plano de Saúde: R$ ");
       planoSaude = intro.nextDouble();

       System.out.print("Informe os valores das despesas, a seguir: ");
       System.out.println(" Digite Despesas Variáveis");

       System.out.print("O valor do IPVA: R$ ");
       ipva = intro.nextDouble();

       System.out.print("O valor do DPVAT: R$ ");
       dpvat = intro.nextDouble();

       System.out.print("O valor do IPTU: R$ ");
       iptu = intro.nextDouble();

       System.out.print("O valor dos Remédios: R$ ");
       remedios = intro.nextDouble();

       System.out.print("O valor com Alimentação Fora: R$ ");
       alimentacaoFora = intro.nextDouble();

       System.out.print("O valor com Vestuário: R$ ");
       vestuario = intro.nextDouble();

       System.out.print("O valor com Cartão de Crédito: R$ ");
       variedades = intro.nextDouble();

       totalDespFixas = (agua + luz + internet + telefone + alimentacao +
               higiene + lazer + planoSaude);
       totalDespVariaveis = (iptu + ipva + dpvat + remedios + variedades +
               vestuario + alimentacaoFora);
       totalDeReceita = (salario + beneficio + outraRenda);
       saldoLiteral = totalDeReceita - (totalDespFixas + totalDespVariaveis);

       double positivo = 0;
       double negativo = 0;
       double saldo = 0;

       if (saldoLiteral > 0) {
           saldoPercentual = (saldoLiteral / 100) * 10 ;
           positivo = saldoPercentual;
       } else if (saldoLiteral < 0){
           saldoPercentual = (saldoLiteral / 100) * 10 ;
           negativo = saldoPercentual;
       } else {
           saldo = 0;
       }
       System.out.println("|**************************************************|");
       System.out.println("|******************* VALORES **********************|");
       System.out.println("|**************************************************|");
       System.out.println("|Nome Completo: " + nome);
       System.out.println("|Mês de Referência: " + mes);
       System.out.printf( "|Saldo restante R$ %.2f\n",  saldoLiteral );
       System.out.printf( "|Percentual restante: %.2f%%\n", saldoPercentual);
       System.out.println("|**************************************************|");


    }
}
/*
public void ctasFixas(){
    System.out.println("Informe os valores das despesas, a seguir: ");
    System.out.println("Conta de agua: R$ %.2f");

}*/
