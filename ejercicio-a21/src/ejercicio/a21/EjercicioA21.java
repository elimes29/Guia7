/*
Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3
que se pueden formar en la matriz M, desplazándose por filas o columnas, existe al
menos una que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la
columna de la matriz M en la cual empieza el primer elemento de la submatriz P.
 */
package ejercicio.a21;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EjercicioA21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] m = new int[10][10];
        int[][] p = new int[3][3];
        int[][] subM=new int[3][3];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                m[i][j] = (int) (Math.random() * 100);
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("[" + m[i][j] + "]  ");
            }
            System.out.println("");
        }
        //Solicitando matriz p a comparar
        System.out.println("-----------------------------------");
        System.out.println("Ingrese numero:");
        Scanner leer=  new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {      
                p[i][j] = leer.nextInt();
            }
        }
        //Mostrando matriaz a compaprar
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + p[i][j] + "]  ");
            }
            System.out.println("");
        }
       //Compraro 64 sub-matrices de m con p
       
       boolean igual=true;
       int contSub=0;
       int subI=0;
       int subJ=0;
       int x=0,y=0;
        do {
            contSub++;
            //Creando submatrices subM
            y=0;
            for (int i = subI; i < subI+3; i++) {
                x=0;
                for (int j = subJ; j < subJ+3; j++) {
                    subM[y][x]=m[i][j];
                    x++;
                }
                y++;
            }
            //Comparando subM con p con Arrays.deepEquals(Matriz1,Matriz2)
            if (Arrays.deepEquals(subM,p)) {
                System.out.println("Matriz contenida en fila: "+subI+"  columna: "+subJ);
               igual=false;
            }
            subJ++;
            if (subJ>7){
            subJ=0;
            subI++;
        }
        } while (igual && !(contSub==64));
        
        if (igual) {
            System.out.println("No contenida");
        }
    
}
}

