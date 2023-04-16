/*
Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla
que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota:
investigar la función Substring y equals() de Java.
 */
package ejercicio.a9;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EjercicioA9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String a=leer.nextLine();
        
        if (a.charAt(0)=='A'){
        //if (a.charAt(0).equals('A')){    
             System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }
    
}
