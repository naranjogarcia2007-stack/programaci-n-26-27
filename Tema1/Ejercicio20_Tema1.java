public class Ejercicio20_Tema1 {
    
    public static void main(String [] args){
    System.out.println("Introduce tu primera nota \n");
    Scanner sc = new Scanner(System.in);
    double nota2 = sc.nextDouble();
    System.out.println("Introduce tu segunda nota \n");
    double nota1 = sc.nextDouble();
        
    double media = (nota1 + nota2)/ 2;
    System.out.println("tu nota media es " + media);

        
    }    
}
