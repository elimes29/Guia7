/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
 */
package ejercicio.a1;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EjercicioA1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Solicitando valores
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer número a sumar");
        float a=leer.nextFloat();
        System.out.println("Ingrese el segundo número a sumar");
        float b=leer.nextFloat();
        
        float c=a+b;//realizando la suma
        
        //Mostradno resiltados
        System.out.println("El resultao de la suma es: " +c);
        
    }
    
}
