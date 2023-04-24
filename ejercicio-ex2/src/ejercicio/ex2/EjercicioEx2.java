/*
Declarear A, B, C y D. Hacer lo necesrio para que B tome el valor de C,
C tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package ejercicio.ex2;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EjercicioEx2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int A = 1, B = 2, C = 3, D = 4 ;
        System.out.println("A:"+A+" B:"+B+" C:"+C+" D:"+D);
        int aux = B;
        B=C;
        C=D;
        D=A;
        A=aux;
        System.out.println("A:"+A+" B:"+B+" C:"+C+" D:"+D);
    }
    
}
