import java.util.Scanner;

public class metodoModulo {   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int modulus = 0, num = 0;
        System.out.println("Digite um Número Inteiro: ");
        num = sc.nextInt();
        modulus = modulo(num); // ???
        System.out.println(modulus); //Chamamos ou ivocamos o método com retorno modulo().
        parOuImpar(num); //Chamamos ou ivocamos o método sem retorno parOuImpar().

    }
    /* Por estar dentro da public class metodoModulo, não é necessário
     usar public static void parOuImpar(), somente static void parOuImpar().*/
    static void parOuImpar(int a){
      if (a % 2 == 0) {
        System.out.println(a + " É Par");
        
      } else {
        System.out.println(a + " É Impar");
        
      }
    }
    /* Por estar dentro da public class metodoModulo, não é necessário  
     usar public static int modulo(), somente static int modulo().*/
    static int modulo(int x){
        return x >= 0 ? x: -x; // substirui o if else, por um operador condicional ternário.

    }  
}

