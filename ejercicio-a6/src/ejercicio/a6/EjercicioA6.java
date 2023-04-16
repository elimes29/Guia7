/*
Crear un programa que dado un numero determine si es par o impar.
 */
package ejercicio.a6;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EjercicioA6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número");
        float a=leer.nextFloat();
        
        //determiando si es par
        if (a%2==0){
            System.out.println("EL número es par");
        }else{
            System.out.println("EL número es impar");            
        }
        
    }
    
}
