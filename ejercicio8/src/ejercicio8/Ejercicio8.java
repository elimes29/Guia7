/*
EJERCICIO 8
Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se
pedirá de nuevo hasta que la nota sea correcta.
 */
package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        //Pidiendo nota
        System.out.println("Ingrese na nota entre 0 y 10");
        int nota = leer.nextInt();
        
        while (nota<0 || nota>10){
            System.out.println();
            System.out.println("NOTA ERRONEA");
            System.out.println("Ingrese na nota entre 0 y 10");
            nota = leer.nextInt();
        }
        
    }
    
}
