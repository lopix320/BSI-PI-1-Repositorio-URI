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
        double inter ;
        Scanner leitor = new Scanner(System.in);
        inter = leitor.nextDouble();
        if (inter >= 0 && inter <= 25){
        System.out.println("Intervalo [0,25]");
        }
        else if (inter > 25 && inter <= 50){
        System.out.println("Intervalo (25,50]");
        }
        else if (inter > 50 && inter <= 75){
        System.out.println("Intervalo (50,75]");
        }
        else if (inter > 75 && inter <= 100){
        System.out.println("Intervalo (75,100]");
        }
        else if (inter < 0 || inter > 100) {
        System.out.println("Fora de intervalo");
        }
    }
 
}