/*
Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del
programa directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está
seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale
del programa, caso contrario se vuelve a mostrar el menú.
 */
package ejercicio.a11;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EjercicioA11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un primer número");
        int a=leer.nextInt();
        System.out.println("Ingrese un segundo número");
        int b=leer.nextInt();
        
        int opcion=menu();
        float resultado;
        boolean cent=true;
               
        while (cent){
            switch (opcion){
                case 1:
                    resultado=a+b;
                    System.out.println("La suma es: "+resultado+"**************");
                    opcion=menu();
                    continue;
                case 2:
                    resultado=a-b;
                    System.out.println("La resta es: "+resultado+"**************");
                    opcion=menu();
                    continue;
                case 3:
                    resultado=a*b;
                    System.out.println("La miltiplicación es: "+resultado+"**************");
                    opcion=menu();
                    continue;
                case 4:
                    resultado=a/b;
                    System.out.println("La division es: "+resultado+"**************");
                    opcion=menu();
                    continue;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    char salida=leer.next().charAt(0);
                    if (salida=='S'){
                        cent=false;
                        return;                    }
                default:
                    System.out.println("Valor incorrecto");
                    opcion=menu();
                    continue;
            }
        }
        
    }
    public static int menu(){
        Scanner leer = new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.println("Elija opción:");
        int opcion=leer.nextInt();
        return opcion;
    }
    
}
