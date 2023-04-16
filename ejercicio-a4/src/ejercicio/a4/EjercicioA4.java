/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package ejercicio.a4;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EjercicioA4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en °C");
        float a=leer.nextFloat();
        float f=32 + (9 * a / 5);
        System.out.println("La temperatura en °F es: " +f);
    }
    
}
