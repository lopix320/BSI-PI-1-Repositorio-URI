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
       char nome; 
        String total2;
        double sal, vendas, total, comissao, total3; 
        Scanner leitor = new Scanner(System.in);
        nome = leitor.next().charAt(0);
        sal = leitor.nextDouble();
        vendas = leitor.nextDouble();
        comissao = vendas * 0.15;
        total = sal + comissao;
        System.out.println("TOTAL = R$ " + String.format("%.2f", total));
    }
 
}