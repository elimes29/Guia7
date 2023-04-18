/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida
al usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */
package ejercicio.a16;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EjercicioA16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int n = 100;
        int[] vector = new int[n];

        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 10);
        }
        System.out.println("Indique un número a buscar(0-9)");
        int num = leer.nextInt();
        int cont = 0;
        int ubica = 0;
        for (int i = 0; i < n; i++) {
            if (num == vector[n - i - 1]) {
                cont++;
                ubica = n - i - 1;
                System.out.println("Está en: " + ubica);
            }
        }
        System.out.println("Y aparece " + cont + " veces");
    }

}
