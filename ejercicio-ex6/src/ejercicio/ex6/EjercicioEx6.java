/*
Leer la altura de N personas y determinar el promedio de estaturas que se encuentran
por debajo de 1.60 mts. y el promedio de estaturas en general.
 */
package ejercicio.ex6;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EjercicioEx6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Indiqe el numero de estaturas que va a ingresar");
        int n = leer.nextInt();
        float estatura;
        float suma=0;
        float sumaMin=0;
        int min=0;
        for (int i = 0; i < n; i++) {
            System.out.println("Indique la estetura "+(i+1));
            estatura = leer.nextFloat();
            suma = suma + estatura;
            if (estatura<1.6) {
                sumaMin=sumaMin+estatura;
                min++;
            }
        }
        System.out.println("El promedio de estaturas es de: "+(suma/n));
        System.out.println("El promedio de estaturas menores a 1,60 es de: "+(sumaMin/min));
    }
    
}
