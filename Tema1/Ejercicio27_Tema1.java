import java.util.Scanner;

public class Ejercicio27_Tema1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cual es el nombre del cliente \n");
        String cliente = sc.nextLine() ;
        System.out.println("Cual es la edad del cliente \n");
        int edad = sc.nextInt() ;

        
        double precio = (edad < 12) ? 5 : (edad >= 65) ? 6 : 8 ;
        
        System.out.println("tu nombre es: \n" + cliente);        
        System.out.println("tu entrada vale: \n" + precio);        
        
    } 
}
