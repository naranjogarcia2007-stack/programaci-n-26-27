public class Ejercicio21_Tema1 {
    
     public static void main(String[] args) {
        
        // Constantes
        final double PI = 3.141592;
        
        // Variables
        double radio, longitud, area;
       
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce el valor del radio:");
        radio = entrada.nextDouble();
        
        longitud = (2 * PI * radio);
        area = (PI * radio * radio);
        
        System.out.println("\nPara un radio de " + radio +
                " tenemos una longitud de " + longitud + 
                " y un área de " + area + " de la circunferencia");
    
}
