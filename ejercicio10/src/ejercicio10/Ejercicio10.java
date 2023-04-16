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
        n1=valor(n1);
               
        System.out.println("Ingrese un segundo número entre 0 y 20");
        int n2 = leer.nextInt();
        n2=valor(n2);
        
        System.out.println("Ingrese un tercer número entre 0 y 20");
        int n3 = leer.nextInt();
        n3=valor(n3);
        
        System.out.println("Ingrese un cuarto número entre 0 y 20");
        int n4 = leer.nextInt();
        n4=valor(n4);
        
        System.out.println("---------------------");
        imprime(n1);
        imprime(n2);
        imprime(n3);
        imprime(n4);
        /*
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
*/
    }
    //funcion para asguara qe los datos que enran sean entre 0 y 20
    public static int valor(int num){
        Scanner leer = new Scanner(System.in);
        
        while (num<0 || num>20){
            System.out.println("NÚMERO ERRONEO");
            System.out.println("Ingrese un número entre 0 y 20");
            num = leer.nextInt();
        }
        return num;
    }
    
    //procedimeinto que imprime en pantalla
    public static void imprime(int n){
        System.out.print(n + " " );
        for (int i = 0; i < n; i++) {
            System.out.print("*");
    }
        System.out.println("");
    }
}
