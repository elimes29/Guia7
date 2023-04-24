/*
Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y
muestre la suma de sus elementos.
 */
package ejercicio.ex22;

/**
 *
 * @author usuario
 */
public class EjercicioEx22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matriz;
        int n=4,m=5,suma=0;
        matriz=new int[n][m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j]=(int)(Math.random()*10);
                suma=suma+matriz[i][j];
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
        System.out.println("La suma de sus elementos es "+suma);
    }
    
}
