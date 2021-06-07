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
        Scanner leitor = new Scanner(System.in);
        double A, B, C, bhaskara, bhaskara2, cont;
        A = leitor.nextDouble();
        B = leitor.nextDouble();
        C = leitor.nextDouble();
        cont = Math.pow(B, 2)-1*(-4*A*C);
        if(cont <= 0){
            System.out.println("Impossivel calcular\n");
        }
        if(2*A == 0){
             System.out.println("Impossivel calcular\n");
        }
        else{
        bhaskara = ((-1*B) + Math.sqrt(cont))/(2*A);
        bhaskara2 = ((-1*B) - Math.sqrt(cont))/(2*A);
        
        
        System.out.printf("R1 = %.5f\n", bhaskara);
        System.out.printf("R2 = %.5f\n", bhaskara2);
        }
    }
 
}