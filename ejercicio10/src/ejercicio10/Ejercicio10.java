/*
EJERCICIO 10
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
ingresado seguido de tantos asteriscos como indique su valor.
 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un primer número entre 0 y 20");
        int n1 = leer.nextInt();
        while (n1<0 || n1>20){
            System.out.println("NÚMERO ERRONEO");
            System.out.println("Ingrese un primer número entre 0 y 20");
            n1 = leer.nextInt();
        }
        
        System.out.println("Ingrese un segundo número entre 0 y 20");
        int n2 = leer.nextInt();
        while (n2<0 || n2>20){
            System.out.println("NÚMERO ERRONEO");
            System.out.println("Ingrese un segundo número entre 0 y 20");
            n2 = leer.nextInt();
        }
        
        System.out.println("Ingrese un tercer número entre 0 y 20");
        int n3 = leer.nextInt();
        while (n3<0 || n3>20){
            System.out.println("NÚMERO ERRONEO");
            System.out.println("Ingrese un tercer número entre 0 y 20");
            n3 = leer.nextInt();
        }
        
        System.out.println("Ingrese un cuarto número entre 0 y 20");
        int n4 = leer.nextInt();
        while (n4<0 || n4>20){
            System.out.println("NÚMERO ERRONEO");
            System.out.println("Ingrese un cuarto número entre 0 y 20");
            n4 = leer.nextInt();
        }
        System.out.println("---------------------");
        
        
        System.out.print(n1 + " " );
        for (int i = 0; i < n1; i++) {
            System.out.print("*");
        }
        System.out.println("");
        
        System.out.print(n2 + " " );
        for (int i = 0; i < n2; i++) {
            System.out.print("*");
        }
        System.out.println("");
        
        System.out.print(n3 + " " );
        for (int i = 0; i < n3; i++) {
            System.out.print("*");
        }
        System.out.println("");
        
        System.out.print(n4 + " " );
        for (int i = 0; i < n4; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
    
}
