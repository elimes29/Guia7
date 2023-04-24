/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
de Java substring(), Length() y Math.random().
 */
package ejercicio.ex23;

import java.util.Scanner;


/**
 *
 * @author usuario
 */
public class EjercicioEx23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String[][] M = new String[20][20];
        String palabra;
        int fila,fin;
        
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                M[i][j]=String.valueOf((int) (Math.random()*10));
            }
        }

        for (int k = 0; k < 5; k++) {
            System.out.println("Indiqe una palabra de 3 a 5 letras");
            palabra = leer.nextLine();
            fila=(int) (Math.random()*20);
            for (int i = 0; i < palabra.length(); i++) {
                M[fila][i]=palabra.substring(i,i+1);
            }
        }
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(M[i][j]+" ");
            }
            System.out.println("");
        }
        
    }

}
