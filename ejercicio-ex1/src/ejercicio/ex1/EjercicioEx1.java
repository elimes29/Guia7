/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package ejercicio.ex1;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EjercicioEx1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Indique el tiempo en minutos");
        int min=leer.nextInt();
        int dias=(int) min/(24*60);
        int horas=(int) (min-(dias*24*60))/(60);
        System.out.println("dias "+dias+" horas "+horas);
            
            
        }
        
    }
 
