import java.util.Scanner;
public class Matematica{
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        //int cont = 0;
        int res = 1;
        int numBase = 3, numExpoente = 4;
        /*
        System.out.println("Informe o valor da Base: ");
        numBase = in.nextInt();
        System.out.println("Informe o valor do Expoente: ");
        numExpoente = in.nextInt();
        */ 

        res = potencia(numBase, numExpoente);
        // formato de saída: espera a resposta.
        System.out.println(res); // deve imprimir 81
        // formato de assertiva/caso de teste: espera SEMPRE true!
        System.out.println(res == 81); // deve imprimir true 
        
        
    }//fim metodo main
    static int potencia(int base, int expoente){
        int cont = 0;
        int resultado = 1;

            while(cont <= expoente && cont >= 0){
                resultado *= base;               
            }//fim do while
            cont++;
            return resultado;
    }//fim do metodo potencia
   

}//fim da class