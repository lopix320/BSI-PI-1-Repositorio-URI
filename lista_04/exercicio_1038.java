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
        int codigo, qntd;
        double preco = 0, total;
        Scanner teclado = new Scanner(System.in); 
        codigo = teclado.nextInt();
        qntd = teclado.nextInt();
        switch (codigo) {
            case 1:
                preco = 4.0;
                break;
            case 2:
                preco = 4.5;
                break;
            case 3:
                preco = 5.0;
                break;
            case 4:
                preco = 2.0;
                break;
            case 5:
                preco = 1.5;
                break;
            default:
                break;
        }
        total = qntd * preco;
        System.out.printf("Total: R$ %.2f\n", total);
    }
 
}