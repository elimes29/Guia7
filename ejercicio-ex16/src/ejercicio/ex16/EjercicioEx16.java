/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */
package ejercicio.ex16;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author usuario
 */
public class EjercicioEx16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Indiqe el numero de personas a ingresar");
        int n = leer.nextInt();
        String[] nombre = new String[n];
        int[] edad = new int[n];
        String seguir;

        for (int i = 0; i < n; i++) {
            System.out.println("Indique el nombre de la persona #"+(i+1));
            nombre[i]=leer.nextLine();
            System.out.println("Indique la edad de la persona #" + (i + 1));
            edad[i] = leer.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (edad[i] > 18) {
                System.out.println(nombre[i] + " es mayor de edad.");
            } else {
                System.out.println(nombre[i] + " NO es mayor de edad.");
            }
            System.out.println("Desea continuar con la sigueinte persona (Si/No)");
            seguir = toUpperCase(leer.nextLine());
            if ("NO".equals(seguir)) {
                return;
            }
        }
    }
}
