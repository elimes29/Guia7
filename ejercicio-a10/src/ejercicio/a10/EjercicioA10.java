/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere el
límite inicial.
 */
package ejercicio.a10;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EjercicioA10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un número límite");
        int lim=leer.nextInt();
        int sum=0;
        while (sum<lim){
            System.out.println("Ingrese un número");
            int num=leer.nextInt();
            sum=sum+num;
        }
    }
    
}
