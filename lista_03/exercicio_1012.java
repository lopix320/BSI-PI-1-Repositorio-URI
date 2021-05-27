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
        double circ, tri, trap, quad, ret, A, B, C;
        Scanner leitor = new Scanner(System.in);
        A = leitor.nextDouble();
        B = leitor.nextDouble();
        C = leitor.nextDouble();    
        circ = 3.14159 * Math.pow(C, 2);
        tri = (A * C)/2;
        trap = (C * (A + B))/2;
        quad = Math.pow(B, 2);
        ret = A * B;
        System.out.printf("TRIANGULO: %.3f\n", tri);
        System.out.printf("CIRCULO: %.3f\n", circ);
        System.out.printf("TRAPEZIO: %.3f\n", trap);
        System.out.printf("QUADRADO: %.3f\n", quad);
        System.out.printf("RETANGULO: %.3f\n", ret);
    
    }
 
}