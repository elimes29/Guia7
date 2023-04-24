/*
Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-
0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.
 */
package ejercicio.ex12;

/**
 *
 * @author usuario
 */
public class EjercicioEx12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String I,J,K;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    I=Integer.toString(i);
                    J=Integer.toString(j);
                    K=Integer.toString(k);
                    if (("3").equals(K)) {
                        K="E";
                    }
                    if (("3").equals(J)) {
                        J="E";
                    }
                    if (("3").equals(I)) {
                        I="E";
                    }
                    System.out.println(I+"-"+J+"-"+K);
                    }
                        
                }
            }
        }
    }
    

