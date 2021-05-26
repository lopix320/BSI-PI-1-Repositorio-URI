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
        double A, B, C, soma, total;
        Scanner leitor = new Scanner(System.in);
        A = leitor.nextDouble();
        B = leitor.nextDouble();
        C = leitor.nextDouble();
        soma = (A * 2)+(B * 3)+(C * 5);
        total = soma/10;
        System.out.printf("MEDIA = %.1f\n", total);
    }
 
}