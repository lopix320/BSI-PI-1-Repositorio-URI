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
        double cont, cont2, r;
        Scanner leitor = new Scanner(System.in);
        r = leitor.nextDouble();
        cont2 = Math.pow(r, 3);
        cont = (4 * 3.14159 * cont2)/3;
        System.out.printf("VOLUME = %.3f\n", cont);;
    }
 
}