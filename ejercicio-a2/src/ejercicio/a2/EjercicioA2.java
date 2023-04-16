/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.
 */
package ejercicio.a2;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EjercicioA2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un nombre");
        String a=leer.nextLine();
        
        //Mostrando los resultados
        System.out.println("El nombre es: " +a);
        
    }
    
}
