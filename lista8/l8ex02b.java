package lista8;
import java.util.Random;
import java.util.Scanner;

/* 2. Tentando descobrir se um dado era viciado, um dono de cassino honesto (ha! ha!
ha! ha!) o lançou n vezes. Dados os n resultados dos lançamentos, determinar o
número de ocorrências de cada face.
*/
public class l8ex02b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random lado = new Random();
        int [] dado = {1, 2, 3, 4, 5, 6};
        int lance = 0;
        int lado1 = 0;
        int lado2 = 0;
        int lado3 = 0;
        int lado4 = 0;
        int lado5 = 0;
        int lado6 = 0;
        int cont = 0; 
        int n = 0;

        
        System.out.printf("Testando  o vicio dos Dados\nDigite o Numero de testes a serem realizados:  ");
        n = in.nextInt();           
        
        while (lance < n) {
            
          for (int j = 0; j < dado.length; j++) {
            dado[j] = lado.nextInt(6)+1;
            if(dado[j] == dado[0]){
                lado1 ++;
            } else if (dado[j] == dado[1]){
                lado2 ++;
            } else if (dado[j] == dado[2]){
                lado3 ++;
            } else if (dado[j] == dado[3]){
                lado4 ++;
            } else if (dado[j] == dado[4]){
                lado5 ++;
            } else if (dado[j] == dado[5]){
                lado6 ++;
            }

            cont ++;
           // System.out.printf("Lance numero %d dado retorna valor: %d\n", cont, dado[j]); 
          } 
         
          lance++;                                 
        }  
        System.out.println("O Lado numero 1 repetiu "+ lado1 +" vezes");   
        System.out.println("O Lado numero 2 repetiu "+ lado2 +" vezes");
        System.out.println("O Lado numero 3 repetiu "+ lado3 +" vezes");
        System.out.println("O Lado numero 4 repetiu "+ lado4 +" vezes");
        System.out.println("O Lado numero 5 repetiu "+ lado5 +" vezes");
        System.out.println("O Lado numero 6 repetiu "+ lado6 +" vezes");        
    } 

}
