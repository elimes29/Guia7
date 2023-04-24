/*
Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la
cantidad de hijos para averiguar la media de edad de los hijos de todas las familias.
 */
package ejercicio.ex14;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EjercicioEx14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Indique el número de familias a ingresar");
        int nFam= leer.nextInt();
        int nHij,edad,sum=0,hijos=0;
        for (int i = 0; i < nFam; i++) {
            System.out.println("Indiqe el número de hijos en su familia");
            nHij=leer.nextInt();
            for (int j = 0; j < nHij; j++) {
                System.out.println("¿Qué edad tene su hijo # "+(j+1)+"?");
                edad=leer.nextInt();
                sum=sum+edad;
                hijos++;
            }  
        }
        float prom=sum/hijos;
        System.out.println("El promedio de todos los hijos de todas las familias es: "+prom);
    }
    
}
