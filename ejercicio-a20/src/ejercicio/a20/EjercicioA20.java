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
        int fila0=0;
        int fila1=0;
        int fila2=0;
        int col0=0;
        int col1=0;
        int col2=0;
        int diagPrin=0;
        int diagSecu=0;
        //Sumando filas, colunas
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i==0){ //fila 0
                    fila0=fila0+A[i][j];
                }
                if (i==1){ //fila 1
                    fila1=fila1+A[i][j];
                }
                if (i==2){ //fila 2
                    fila2=fila2+A[i][j];
                }
                if (j==0){ //colunma 0
                    col0=col0+A[i][j];
                }
                if (j==1){ //colunma 1
                    col1=col1+A[i][j];
                }
                if (j==2){ //colunma 2
                    col2=col2+A[i][j];
                }
                if (j==i){ //diagonal principal 0
                    diagPrin=diagPrin+A[i][j];
                }
                if (i+j==3-1){ //diaonal secundaria
                    diagSecu=diagSecu+A[i][j];
                }
                
            }
            
        }
        if ((fila1==fila0) && (col1==fila0) && (fila2==fila0) && (col2==fila0) && (col3==fila0) && (diagPrin==fila0) && (diagSecu==fila0)){
            System.out.println("Este cuadrado es Mágico");
        
    } else{
            System.out.println("Este cuadrado NO Mágico");
        }
        //System.out.println(col0+" "+col1+" "+col2+" "+fila1+" "+fila2+" "+fila0+" "+diagPrin+" "+diagSecu);
    }
    
}
