
import java.util.Scanner;

public class Pratica5Tarefa2 {
    public static void main(String[] args) {
       
        System.out.println( "Escreva dois números para serem somados:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        sumDouble(a, b);

        System.out.println(sumDouble(a, b));
        sc.close();
    }

    private static int sumDouble(int a, int b) {
        int soma = a + b;
        
        if( a == b){
            soma = soma *2; 
        }
        return soma;
    }

}
