/*
Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que
una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada
de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package ejercicio.a19;

/**
 *
 * @author usuario
 */
public class EjercicioA19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] A = new int[3][3];
        int[][] B = new int[3][3];
        
        //Llenado A
        A[0][0]=0;
        A[0][1]=-2;
        A[0][2]=4;
        A[1][0]=2;
        A[1][1]=0;
        A[1][2]=2;        
        A[2][0]=-4;
        A[2][1]=-2;
        A[2][2]=0;
        
        //Llenando B
        B[0][0]=0;
        B[0][1]=-2;
        B[0][2]=-4;
        B[1][0]=-2;
        B[1][1]=0;
        B[1][2]=-2;        
        B[2][0]=4;
        B[2][1]=2;
        B[2][2]=0;
        int dim=3*3,sum=0;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (A[i][j]==-B[i][j]){
                    sum++;
            }
            }
        }
                    if (sum==dim){
                System.out.println("Es anti simétrica");
            }else{
                System.out.println("NO es anti simétrica");
   
        }
    }
    
}
