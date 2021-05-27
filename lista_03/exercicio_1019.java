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
        int sgs, hrs, min;
       Scanner leitor = new Scanner(System.in);
       sgs = leitor.nextInt();

       hrs = sgs / 3600;
       sgs = sgs - hrs * 3600;
       min = sgs / 60;
       sgs = sgs - min * 60;

       System.out.printf("%d:%d:%d\n", hrs, min, sgs);
    
    }
}