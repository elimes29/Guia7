/*
EJERCICIO 11
Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada
en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se
reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las
vocales acentuadas) se mantienen sin cambios.

a e i o u
@ # $ % *

Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación
correspondiente. Utilice la estructura “según” para la transformación.
Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
 */
package ejercicio11;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una letra (para en .)");
        //char letra=leer.next().charAt(0);
        String letra=leer.nextLine();
        String palabra="";
        

        while (!letra.equals(".")){
            palabra=palabra+letra;
            System.out.println("Ingrese una letra (para en .)");
            letra=leer.nextLine();
        }
        palabra=palabra+".";
        System.out.println(palabra);
        
        String Palabra2=codifica(palabra);
        System.out.println(Palabra2);
        

    }
    
    public static String codifica(String palabra){
        
        String palabraS="";
        for (int i = 0; i<palabra.length(); i++) {
            switch (palabra.charAt(i)){
                case 'a':
                    palabraS=palabraS+"@";
                    continue;
                case 'e':
                    palabraS=palabraS+"#";
                    continue;
                case 'i':
                    palabraS=palabraS+"$";
                    continue;
                case 'o':
                    palabraS=palabraS+"%";
                    continue;
                case 'u':
                    palabraS=palabraS+"*";
                    continue;
                default:
                    palabraS=palabraS+palabra.charAt(i);
                    
            }
        }
        return palabraS;
    }
    
}
