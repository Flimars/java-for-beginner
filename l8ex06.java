
import java.util.Scanner;
/* 6. Escreva uma palavra, letra por letra, colocando cada letra em um vetor. Ao final,
imprima na tela a palavra digitada, com o formato de uma palavra (uma letra após a
outra).
*/
public class l8ex06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] palavra = {"e", "s", "t", "u", "d", "a", "r"};

        for (int i = 0; i < palavra.length; i++) {
            System.out.printf("%S",palavra[i]);
            
        }
        

    }
    
}
