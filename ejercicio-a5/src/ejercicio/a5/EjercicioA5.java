/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().
 */
package ejercicio.a5;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EjercicioA5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int a=leer.nextInt();
        
        //Mostrando doble
        long doble=2*a;
        System.out.println("El doble de ese número es: " + doble);
        //Mostrando triple
        long triple=3*a;
        System.out.println("El triple de ese número es: " + triple);
        //Mostrando raiz cuadrada
        float raiz=(float) (Math.sqrt(a));
        System.out.println("La raiz cuadrada de ese número es: " + raiz);
        
    }
    
}
