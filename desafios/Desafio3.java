package desafios;
/* Leia um número inteiro que representa um código de DDD para discagem interurbana. Em seguida,
   informe á qual cidade o DDD pertence, considerando a tabbela abaixo:
 | DDD |  Destino        ||Exemplo:  Entrada     Saída
 | 61  | Brasília        ||            11      São Paulo
 | 71  | Salvador        ||
 | 11  | São Paulo       ||
 | 21  | Rio de Janairo  ||
 | 32  | Juiz de Fora    ||
 | 19  | Campinas        ||
 | 27  | Vitória         ||
 | 31  | Belo Horizonte  ||
   Se a entrada for qualquer outro DDD que não esteja na tabela acima, o programa deverá informar:
   -> DDD não cadastrado.

* */

import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ddd;
        System.out.println("Informe o DDD: ");
        ddd = input.nextInt();
        switch (ddd){
            case 61: {
                System.out.println("Brasília");
                break;
            }case 71: {
                System.out.println("Salvador");
                break;
            }case 11: {
                System.out.println("São Paulo");
                break;
            }case 21: {
                System.out.println("Rio de Janeiro");
                break;
            }case 32: {
                System.out.println("Juiz de Fora");
                break;
            }case 19: {
                System.out.println("Campinas");
                break;
            }case 27: {
                System.out.println("Vitória");
                break;
            }case 31: {
                System.out.println("Belo Horizonte");
                break;
            }
            default: {
                System.out.println("DDD não cadastrado");
            }
        }
    }
}
