
import java.util.Scanner;


public class EJERCICIO21 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int numero;
        
        System.out.print("Introduzca un número:");
        numero = teclado.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        
    }
}
