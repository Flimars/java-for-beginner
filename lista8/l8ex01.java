package lista8;
import java.util.Scanner;


/* 1. Dada uma seqüência de n números, imprimi-la na ordem inversa à da leitura.
*/

public class l8ex01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] conjunto;
        int n = 0;       

        System.out.println("Informe a quantidade de elementos: ");
        n = in.nextInt();
        
        System.out.println("Digite o valor dos N elementos: ");

        conjunto = new int [n];
        for (int i = 0; i < conjunto.length; i++) {
            conjunto [i] = in.nextInt();
            
        }
        for (int i = 0; i < conjunto.length; i++) {
            System.out.println("Esses sao os elementos do conjunto ["+ conjunto[i] +"]");
            
        }
        for (int i = conjunto.length -1; i >= 0; i--) {
            System.out.println("Aqui os elementos na ordem inversa do conjunto ["+ conjunto[i] +"]");
            
        } 
    }
    
}
