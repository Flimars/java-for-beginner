
/*
4. Desenvolva um algoritmo para calcular a área de um triângulo. Pensem nas
variáveis que serão necessárias. Ao final, o algoritmo deve informar a área total do
triângulo.
*/
import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int area = 0, base = 0, altura = 0;

        System.out.println("Informe as medidas desejadas da base e altura do triângulo:");
        base = in.nextInt();
        altura = in.nextInt();

        area = (base * altura) / 2;

        System.out.println("Área total do triângulo é = " + area);

    }
}
