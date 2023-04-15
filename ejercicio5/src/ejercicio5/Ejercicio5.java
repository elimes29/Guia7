/*
EJERCICIO 5
Define una variable de tipo boolean, double y char. Guarda información en ellas a través del
Scanner.
 */
package ejercicio5;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Para asignar a LEER la opcion de tomar inf de pantalla
        Scanner leer = new Scanner(System.in);
        
        boolean a;
        double b;
        char c;
        
        System.out.println("Escribe un buleano");
        a=leer.nextBoolean();
        System.out.println("Escribe n numero grande");
        b=leer.nextDouble();
        System.out.println("Escribe un caracter");
        c=leer.next().charAt(0);
        
        System.out.println("Bueleano "+a);
        System.out.println("Número "+b);
        System.out.println("Caracter "+c);
        
    }
    
}
