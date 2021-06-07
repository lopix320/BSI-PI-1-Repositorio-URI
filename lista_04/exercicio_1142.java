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
            int i = 0, N, cont = 0;
            Scanner leitor = new Scanner(System.in);
            N = leitor.nextInt();
            while(i < N){
            i++;
            System.out.println((cont + 1) + " " + (cont + 2) + " " + (cont + 3) + " PUM") ;
            cont += 4;
        }
    }
 
}