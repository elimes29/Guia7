/*
10
Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
 */
package ejercicio.ex11;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EjercicioEx11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int a = (int)(Math.random()*10);
        int b = (int)(Math.random()*10);
        int c;
        //System.out.println(a+" * "+b+" = "+a*b);
        do {
            System.out.println("¿Cual es el número?");
            c=leer.nextInt();
        } while (c!=a*b);
        
    }
    
}
