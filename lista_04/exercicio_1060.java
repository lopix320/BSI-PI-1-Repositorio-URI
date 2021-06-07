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
        int i = 0, qntd = 0;
        Scanner leitor = new Scanner(System.in);
        while (i < 6) {
            i++;
            double valor = leitor.nextDouble();
            if (valor > 0){
                qntd++;
            }
        }
        System.out.println(qntd + " valores positivos");
    }
 
}