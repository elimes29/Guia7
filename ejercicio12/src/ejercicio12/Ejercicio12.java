/*
EJERCICIO 12
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando
que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del
segundo, sino informe que no lo son.
 */
package ejercicio12;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Inrese el primer número");
        int a=leer.nextInt();
        System.out.println("Inrese el segundo número");
        int b=leer.nextInt();
        
        esMultiplo(a,b);
    }
    public static void esMultiplo(int a, int b){
        if (a%b==0){
            System.out.println("El primer número es multiplo del segundo");
        }else{
            System.out.println("El primer número NO es multiplo del segundo");
        }
    }
    
}
