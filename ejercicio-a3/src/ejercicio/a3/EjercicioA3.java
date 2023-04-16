/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en
Java.
 */
package ejercicio.a3;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author usuario
 */
public class EjercicioA3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here.
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String a=leer.nextLine();
        
        System.out.println(toUpperCase(a));
        System.out.println(toLowerCase(a));
    }
    
}
