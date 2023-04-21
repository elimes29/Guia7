/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se
obtiene cambiando sus filas por columnas (o viceversa).
 */
package ejercicio.a18;

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
        int[][] A = new int[4][4];
        int[][] B = new int[4][4];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                A[i][j]=(int) (Math.random()*10);
                System.out.print(A[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("------------------ ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                B[i][j]=A[j][i];
                System.out.print(B[i][j] + " ");
            }
            System.out.println(" ");
        }
        
    }
    
}
