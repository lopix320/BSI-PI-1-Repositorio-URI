import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
        int N;
        Scanner leitor = new Scanner(System.in);
        N = leitor.nextInt();
        System.out.println("1 x "+ N +" = " + 1*N);
        System.out.println("2 x "+ N +" = " + 2*N);
        System.out.println("3 x "+ N +" = " + 3*N);
        System.out.println("4 x "+ N +" = " + 4*N);
        System.out.println("5 x "+ N +" = " + 5*N);
        System.out.println("6 x "+ N +" = " + 6*N);
        System.out.println("7 x "+ N +" = " + 7*N);
        System.out.println("8 x "+ N +" = " + 8*N);
        System.out.println("9 x "+ N +" = " + 9*N);
        System.out.println("10 x "+ N +" = " + 10*N);
    }
 
}