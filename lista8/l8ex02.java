package lista8;


import java.util.Random;
import java.util.Scanner;

/* 2. Tentando descobrir se um dado era viciado, um dono de cassino honesto (ha! ha!
ha! ha!) o lançou n vezes. Dados os n resultados dos lançamentos, determinar o
número de ocorrências de cada face.
*/
public class l8ex02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random lado = new Random();
        int [] dado = {1, 2, 3, 4, 5, 6};
        int lance = 0;
        int cont = 0;
        int n = 0;

        
        System.out.printf("Testando  o vicio dos Dados\nDigite o Numero de testes a serem realizados:  ");
        n = in.nextInt();           
        
        while (lance < n) {
            
          for (int j = 0; j < dado.length; j++) {
            dado[j] = lado.nextInt(6)+1;
            cont ++;
            System.out.printf("Lance numero %d dado retorna valor: %d\n", cont, dado[j]); 
          } 
          lance++;                                 
        }             
    } 

}
