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
        int anos, mes, dias, cont;
        Scanner leitor3 = new Scanner(System.in);
        dias = leitor3.nextInt();
        anos=dias/365;
        mes=(dias%365)/30;
        cont=(dias%365)%30;
    
        System.out.printf("%d ano(s)\n", anos);          
        System.out.printf("%d mes(es)\n", mes);
        System.out.printf("%d dia(s)\n", cont);
    

 
}
}