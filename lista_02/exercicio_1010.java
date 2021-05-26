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
        int peça1Cod, peça1Unid, peça2Cod, peça2Unid;
        double peça1Valor,peça2Valor, calc;
        Scanner leitor = new Scanner(System.in);
        
        peça1Cod = leitor.nextInt();
        peça1Unid = leitor.nextInt();
        peça1Valor = leitor.nextDouble();
        peça2Cod = leitor.nextInt();
        peça2Unid = leitor.nextInt();
        peça2Valor = leitor.nextDouble();
        
        calc = (peça1Unid * peça1Valor) + (peça2Unid * peça2Valor);
        
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", calc);
    }
 
}