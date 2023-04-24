/*
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares
y la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
 */
package ejercicio.ex8;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EjercicioEx8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num, cont = 0, contPar = 0, contImp = 0;

        do {
            System.out.println("Ingrese un número");
            num = leer.nextInt();
            cont++;
            if (num > 0) {
                if (num % 2 == 0) {
                    contPar++;
                } else {
                    contImp++;
                }
            }
        } while (num % 5 != 0);
        System.out.println("Número ingresados " + cont);
        System.out.println("Número pares ingresados " + contPar);
        System.out.println("Número impares ingresados " + contImp);
    }

}
