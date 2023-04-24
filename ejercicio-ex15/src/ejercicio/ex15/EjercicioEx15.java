/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
matemática y deben devolver sus resultados para imprimirlos en el main.
 */
package ejercicio.ex15;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EjercicioEx15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Indiqe el primer número");
        int a=leer.nextInt();
        System.out.println("Indiqe el segundo número");
        int b=leer.nextInt();
        
        System.out.println("¿Qué desea hacer?");
        System.out.println("1: Sumar");
        System.out.println("2: Restar");
        System.out.println("3: Multiplicar");
        System.out.println("4: Dividir");
        int opc=leer.nextInt();
        
        switch (opc){
            case 1:
                int sum=suma(a,b);
                System.out.println("La suma es "+sum);
                return;
            case 2:
                int res=resta(a,b);
                System.out.println("La resta es "+res);
                return;
            case 3:
                int mul=multi(a,b);
                System.out.println("La multiplicación es "+mul);
                return;
            case 4:
                float div=division(a,b);
                System.out.println("La division es "+(float) (1.0*div));
                return;
            default:
                System.out.println("Erro de opción");
        }
    }
    public static int suma(int a, int b){
        return a+b;
    }
    public static int resta(int a, int b){
        return a-b;
    }
    public static int multi(int a, int b){
        return a*b;
    }
    public static float division(int a, int b){
        return (float) (1.0*a/b);
    }
}
