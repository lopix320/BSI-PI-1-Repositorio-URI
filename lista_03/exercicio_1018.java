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
        double notas = 0, qnt = 0, a = 0; 
        int valor, b = 0,c = 0, d = 0, e = 0, f = 0, g = 0, i = 0;
        valor = leitor.nextInt();
        while(!(qnt == valor)){
            if(qnt < valor){
                qnt += 100;
                i++;
            }
            if(qnt > valor){
                qnt -= 100;
                i--;
                if(qnt < valor){
                    qnt += 50;
                    b++;
                    if(qnt > valor){
                        qnt -= 50;
                        b--;
                        if(qnt < valor){
                            qnt += 20;
                            d++;
                            if(qnt > valor ){
                                qnt -= 20;
                                d--;
                                if(qnt < valor){
                                    qnt += 10;
                                    e++;
                                    if(qnt > valor){
                                        qnt -= 10;
                                        e--;
                                        if(qnt < valor){
                                            qnt += 5;
                                            f++;
                                            if(qnt > valor){
                                                qnt -= 5;
                                                f--;
                                                if(qnt < valor){
                                                    qnt += 2;
                                                    g++;
                                                    if(qnt > valor){
                                                        qnt -= 2;
                                                        g--;
                                                        if(qnt < valor){
                                                            qnt += 1;
                                                            c++;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.printf("%d\n", valor);
        System.out.printf("%d nota(s) de R$ 100,00\n", i);
        System.out.printf("%d nota(s) de R$ 50,00\n", b); 
        System.out.printf("%d nota(s) de R$ 20,00\n", d); 
        System.out.printf("%d nota(s) de R$ 10,00\n", e);
        System.out.printf("%d nota(s) de R$ 5,00\n", f); 
        System.out.printf("%d nota(s) de R$ 2,00\n", g); 
        System.out.printf("%d nota(s) de R$ 1,00\n", c);
    }
 
}