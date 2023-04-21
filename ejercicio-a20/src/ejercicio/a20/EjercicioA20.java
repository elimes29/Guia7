/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */
package ejercicio.a20;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EjercicioA20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int[][] A= new int[3][3];
        int num =0;
        //Llenando matriz desde consola
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do { //validando valores ingresados de 0 a 9
                    System.out.println("Inrese el número "+i+","+j+" de la matriz");
                    num=leer.nextInt();
                } while ((num<0) || (num>9));
                A[i][j]=num;
            }
        }
        /*
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(A[i][j]+" ");
            }
            System.out.println("");
        }
        */
        //Sumando filas
    }
    
}
