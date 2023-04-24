/*
Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento
para los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.
 */
package ejercicio.ex5;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EjercicioEx5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        char letra = ' ';
        System.out.println("Ingrese una clase de socio A, B o C");
        letra = (leer.next().charAt(0));
        System.out.println("Ingrese el valor real de tratamiento");
        float precio = leer.nextFloat();
        if (letra == 'A') {
            System.out.println("Por se socio A tiene un 50% de descuento y su pago es de " + precio * 0.5);
        } else if (letra == 'B') {
            System.out.println("Por se socio B tiene un 35% de descuento y su pago es de " + precio * 0.65);
        } else if (letra == 'C') {
            System.out.println("Por se socio C no tiene descuento y su pago es de " + precio);
        } else {
            System.out.println("Letra de socio errada");
        }
    }
}
