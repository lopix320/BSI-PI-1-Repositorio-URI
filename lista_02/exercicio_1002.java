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
        double area, raio, n = 3.14159;
        Scanner leitor = new Scanner(System.in);
        raio = leitor.nextDouble();
        area = n * Math.pow(raio, 2);
        
        System.out.printf("A=%.4f\n", area);
    }
 
}