/*
Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
N, con los valores ingresados por el usuario.
 */
package ejercicio.a18;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EjercicioA18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        int n=10;
        int[] v1=new int[n];
        for (int i = 0; i < n; i++) {
            v1[i]=(int) (Math.random()*10);
        }
        int suma=0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Valor del vetor en "+i+" es "+v1[i]);
            System.out.println("Ingresa el valor # "+(i+1));
            suma=suma+v1[i]+leer.nextInt();
        }
        System.out.println("La sema es "+suma);
        
    }

}
