import java.util.Scanner;

/* 5. Fazer um algoritmo que leia vinte números inteiros armazenando-os em um vetor, a
seguir, troque o conteúdo da primeira posição do vetor com o conteúdo da décima
primeira posição, o conteúdo da segunda posição com o da décima segunda, e
assim, sucessivamente até trocar o conteúdo da décima com o da vigésima e
escreva o vetor após estas modificações.
*/

public class l8ex05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] vI, vF;
        vI = new int[5];
        vF = new int[5];
        int aux =0;

        System.out.println("Digite 5 Números:");
        for (int i = 0; i < vI.length; i++) {
            vI [i] = in.nextInt();
            //System.out.println(vI[i]);
        }
        for (int i = vI.length -1; i >= 0 ; i--) {          
            vF[i] = vI[i];          
            System.out.println("Ordem inversa do Vetor " + vF[i]);             
        } 
        
    }
    
}
