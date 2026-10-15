/*
 *
 * @author 11_1DAW
 */
public class EJERCICIO3 {
    public static void main(String)[] args) {
        System.out.println("Introduzca nombre de usuario:");
        Scanner teclado = new Scanner(System.in);
        String usuario = teclado.nextLine();
        final string USUARIO_CORRECTO = "Álvaro";
        // Si el usuario introducido coincide con USUARIO_CORRECTO
        // le damos la bienvenida, en otro caso, continua el programa
        if (usuario == USUARIO_CORRECTO) {
            System.out.println("¡Bienvenido " + usuario + "!" );   
        }
        System.out.println ("Fin");
    }
