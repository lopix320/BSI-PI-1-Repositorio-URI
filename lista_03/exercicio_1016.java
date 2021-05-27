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
        int distanciakm, tempomin;
        Scanner leitor = new Scanner(System.in);
        distanciakm = leitor.nextInt();
        tempomin = (distanciakm * 60) / 30;
        System.out.println(tempomin + " minutos"); 
    }
 
}