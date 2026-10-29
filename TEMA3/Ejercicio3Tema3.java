public class Ejercicio3Tema3 {
    
    public static double calcularImporte(double precio, double descuento, double porcentajeImpuesto) {
        
        double precioDescuento = precio * (1 - (descuento / 100));
        
        double precioFinal = precioDescuento * (1 + (porcentajeImpuesto / 100));
        
        return precioFinal;
        }
    public static void main(String[] args) {
        double Pan = calcularPrecioFinal(150, 10, 21);
    }   
}
