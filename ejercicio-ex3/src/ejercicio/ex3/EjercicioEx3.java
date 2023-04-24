/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase
String.
 */
package ejercicio.ex3;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author usuario
 */
public class EjercicioEx3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una letra");
        String letra=leer.nextLine();
        letra=toUpperCase(letra);
        
        if ((letra.equals("A")) || (letra.equals("E")) || (letra.equals("I")) || (letra.equals("O")) || (letra.equals("U"))) {
            System.out.println("Se trata de vocal");
        }else{
            System.out.println("No es vocal");
        }

    }
    
}
