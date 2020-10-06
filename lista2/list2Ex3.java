
/**
 * 3. Ler um valor e escrever se é positivo ou negativo (considere o valor zero
 * como positivo).
 */
import java.util.Scanner;

public class list2Ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int valor = 0;

        System.out.print("Ditite um valor:  \n");
        valor = in.nextInt();

        if (valor >= 0) {
            System.out.println("Valor é positivo");

        } else {
            System.out.println("Valor é negativo");
        }
    }

}