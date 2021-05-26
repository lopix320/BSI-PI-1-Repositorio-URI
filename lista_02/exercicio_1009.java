import java.io.IOException;
import java.math.RoundingMode;
import java.text.DecimalFormat;
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
        double sal, vendas, total, comissão, total3; 
        Scanner leitor = new Scanner(System.in);
        nome = leitor.next().charAt(0);
        sal = leitor.nextDouble();
        vendas = leitor.nextDouble();
        comissão = vendas * (15/100f);
        total = sal + comissão;
        DecimalFormat df = new DecimalFormat("0.0");
        df.setMaximumFractionDigits(2); 
        df.setRoundingMode(RoundingMode.FLOOR);
        total2 = df.format(total);
        total2 = total2.replaceAll(",", ".");
        total3 = Double.parseDouble(total2);
        System.out.printf("TOTAL = %.2f\n", total3);
        
    }
 
}