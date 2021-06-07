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
        String A, B, C;
        Scanner leitor = new Scanner(System.in);
        A = leitor.next();
        B = leitor.next();
	C = leitor.next();
        if (A.equals("vertebrado")  && B.equals("ave") && C.equals("carnivoro")) {
			System.out.println("aguia");
		}
	if (A.equals("vertebrado") && B.equals("ave") && C.equals("onivoro")) {
			System.out.println("pomba");
		}
	if (A.equals("vertebrado") && B.equals("mamifero") && C.equals("onivoro")) {
			System.out.println("homem");
		}
	if (A.equals("vertebrado") && B.equals("mamifero") && C.equals("herbivoro")) {
			System.out.println("vaca");
		}
        if (A.equals("invertebrado") && B.equals("inseto") && C.equals("hematofago")) {
			System.out.println("pulga");
		}
	if (A.equals("invertebrado") && B.equals("inseto") && C.equals("herbivoro")) {
			System.out.println("lagarta");
		}
	if (A.equals("invertebrado") && B.equals("anelideo") && C.equals("hematofago")) {
			System.out.println("sanguessuga");
		}
	if (A.equals("invertebrado") && B.equals("anelideo") && C.equals("onivoro")) {
			System.out.println("minhoca");
		}
    }
 
}