/*
Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano.
 */
package ejercicio.ex4;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EjercicioEx4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num;
        String romano="";
        boolean cent = false;
        do {
            System.out.println("Ingrese un número del 1 al 10");
            num = leer.nextInt();
            if (num > 0 && num < 11) {
                cent = false;
            } else {
                System.out.println("Número incorrecto");
                cent = true;
            }
        } while (cent);
        switch (num) {
            case 1:
                romano = "I";
                break;
            case 2:
                romano = "II";
                break;
            case 3:
                romano = "III";
                break;
            case 4:
                romano = "IV";
                break;
            case 5:
                romano = "V";
                break;
            case 6:
                romano = "VI";
                break;
            case 7:
                romano = "VII";
                break;
            case 8:
                romano = "VIII";
                break;
            case 9:
                romano = "IX";
                break;
            case 10:
                romano = "X";
                break;
        }
        System.out.println("El numero: " + num + " en romano es: " + romano);
    }
}
