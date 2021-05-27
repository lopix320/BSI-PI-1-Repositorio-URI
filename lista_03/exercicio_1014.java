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
        int x;
        double y, total;
        Scanner leitor = new Scanner(System.in);
        
        x = leitor.nextInt();
        y = leitor.nextDouble();
        
        total = x/y;
        
        System.out.printf(String.format("%.3f",total) + " km/l\n");
    }
 
}