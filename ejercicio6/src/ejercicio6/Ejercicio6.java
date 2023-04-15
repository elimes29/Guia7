/*
EJERCICIO 6
Implementar un programa que le pida dos números enteros a usuario y determine si ambos o
alguno de ellos es mayor a 25.
 */
package ejercicio6;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        //Pidiendo números
        System.out.println("Ingrese un primer número");
        int a = leer.nextInt();
        System.out.println("Ingrese un segundo número");
        int b = leer.nextInt();
        
        //centinela 0 ningino mayor a 25, 1 hay 1 numero mayor a 25 y 2 los dos mayores a 25
        int cent=0;
        if (a>25){
            cent++;
        }
        if (b>25) {
            cent++;
        }
       
        //Imprimiendo resultados en Pantalla
        if (cent==2){
            System.out.println("Ambos números mayores a 25");
        } else if(cent==1){
            System.out.println("Sólo un número es mayor a 25");
        } else{
            System.out.println("Nungún número es mayor a 25");
        }
        
    }
    
}
