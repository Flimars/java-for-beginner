package lista8;
import java.util.Scanner;


/* 1. Dada uma seqüência de n números, imprimi-la na ordem inversa à da leitura.
*/

public class l8ex01b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] conjunto = {1, 5, 10, 15, 20}; // declara e inicializa o vetor. 
        //conjunto = new int [5]; // instancia  o vetor e cria o objeto do vetor.

        System.out.println(">>>     ORDEM CRESCENTE       <<<"); // titulos das colunas
        System.out.printf("%2S%10S\n", "index", "valor"); // titulos das colunas
        // gera a saída dos elementos do vetos na ordem ou em ordem cresscente.    
        for (int i = 0; i < conjunto.length; i++) {
            System.out.printf("%3d%10d\n", i, conjunto[i]);
            
        }
        System.out.println(">>>     ORDEM INVERSA       <<<"); // titulos das colunas
        System.out.printf("%2S%10S\n", "index", "valor"); // titulos das colunas
        // gera a saída dos elementos do vetos na ordem inversa ou em ordem decresscente.
        for (int i = conjunto.length -1; i >= 0; i--) {
            System.out.printf("%3d%10d\n", i, conjunto[i]);
            
        } 
    }
    
}

