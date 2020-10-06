
/**
 * 9. Escreva um programa que pergunte o raio de uma circunferência, e sem
 * seguida mostre o diâmetro, comprimento e área da circunferência. Considere 
 * PI = 3.141692.
 * Material de Consulta: 
 * https://pt.khanacademy.org/math/basic-geo/basic-geo-area-and-perimeter/area-circumference-circle/a/radius-diameter-circumference
 * raio(r)=d/2 - diâmetro(d)= 2*r - comprimento da circunferência(C)= 2*pi*r 
 * área da circunferência (A)= Pi*r².
 * 
 */
import java.util.Scanner;

public class list2Ex9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float r;
        float d;
        float c;
        float a;
        float pi = (float) 3.141692;

        System.out.print("Qual é o raio  da circunferência desejada? ");
        r = in.nextFloat();

        d = 2 * r;
        c = 2 * (pi * r);
        a = pi * (r * r);

        System.out.printf("O Diâmetro é de %.2f\n", d);
        System.out.printf("A Área da Circunferência é de %.2f\n", a);
        System.out.printf("O Comprimento da Circunferência é de %.2f\n", c);

    }

}