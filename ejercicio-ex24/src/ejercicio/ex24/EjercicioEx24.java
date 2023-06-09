/*
Realizar un programa que complete un vector con los N primeros números de la sucesión
de Fibonacci. Recordar que la sucesión de Fibonacci es la sucesión de los siguientes
números:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...
Donde cada uno de los números se calcula sumando los dos anteriores a él. Por ejemplo:
La sucesión del número 2 se calcula sumando (1+1)
Análogamente, la sucesión del número 3 es (1+2),
Y la del 5 es (2+3),
Y así sucesivamente...
La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:
Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
Fibonaccin = 1 para todo n<=1
Por lo tanto, si queremos calcular el término “n” debemos escribir una función que reciba
como parámetro el valor de “n” y que calcule la serie hasta llegar a ese valor.
 */
package ejercicio.ex24;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EjercicioEx24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Indiqe el termino a buscar de fibonacci");
        int n = leer.nextInt();
        int f = 1, an=0,ac=1;
        if ((n == 1)) {
            f = 1;
        } else {
            for (int i = 0; i < n - 1; i++) {
                f = an + ac;
                an = ac;
                ac = f;
            }
        }
        System.out.println("F de "+n+" es "+f);

    }

}
