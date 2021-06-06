package lista8;
import java.util.Scanner;

/* 4. Faça um programa que leia 10 valores do teclado, e que imprima esses valores
divididos em 2 etapas: primeiro, somente os valores pares, e depois, somente os
valores ímpares. Identifique cada valor escrevendo ao lado do valor se ele é par ou
ímpar.
5.
*/

public class l8ex04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int [] array, par, impar;
        array = new int[10];
        impar = new int[10];
        par = new int[10];        

        System.out.println("Informe 10 valores: ");
        for (int i = 0; i < array.length; i++) {
            array [i] = in.nextInt();  
            if (array[i] % 2 == 0) {               
                par[i] = array[i];            
                                
            } else {                
                impar[i] = array[i];                
                              
            }                      
        }
        System.out.println("Array com Valores pares");
        for (int i = 0; i < par.length; i++) {
            if (par[i] != 0)           
               System.out.printf("O elemento do array[%d] é par\n", par[i]);            
        }
        System.out.println(" ");
        System.out.println("Array com Valores ímpares");
        for (int i = 0; i < impar.length; i++) {
            if (impar[i] != 0)
            System.out.printf("O elemento do array[%d] é ímpar\n", impar[i]);            
        }
          
    }
    
}
