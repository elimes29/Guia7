/*
11 1254
Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el
operador de división. Nota: recordar que las variables de tipo entero truncan los
números o resultados.
 */
package ejercicio.ex10;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EjercicioEx10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int num = leer.nextInt();
        int cont=0;
        while (num/10>0) {
            num=num/10;
            cont++;
        }
        System.out.println("El número es de "+(cont+1)+" dígitos");
        
    }
    
}
