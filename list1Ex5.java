
/*
 * 5. Desenvolva o algoritmo para converter uma temperatura em graus Fahrenheit
 * para graus Celsius. A fórmula para conversão é a seguinte: C/5 = F-32/9 Onde:
 * C = temperatura em graus Celsius; F = temperatura em graus Fahrenheit.
 *  
 */
import java.util.Scanner;

public class list1Ex5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tempC = 0, tempF;

        System.out.println("Digite a temperatura em Fahrenheit: ");
        tempF = in.nextInt();

        tempC = (5 * (tempF - 32) / 9);

        System.out.println("A temperatura de " + tempF + " F graus corresponde a " + tempC + " graus ºC");

    }

}