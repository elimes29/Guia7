/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el
promedio de n números (n>0). El valor de n se solicitará al principio del programa y los
números serán introducidos por el usuario. Realice dos versiones del programa, una
usando el bucle “while” y otra con el bucle “do - while”.
 */
package ejercicio.ex7;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EjercicioEx7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Indique cuantos númerps va a ingresar ");
        int n = leer.nextInt();
        int max = 0;
        int min = 0;
        float prom = 0;
        int cont = 0;
        int num;

        /*
        //While
        System.out.println("Indique el número"+(cont+1));
        cont++;
        num=leer.nextInt();
        max=num;
        min=num;
        prom=prom+num;
        while(cont<n){
            System.out.println("Indique el número"+(cont+1));
            cont++;
            num=leer.nextInt();
            if (num>max) {
                max=num;
            }
            if (num<min) {
                min=num;
            }
            prom=prom+num;
        }
         */
        //Do While
        do {
            System.out.println("Indique el número " + (cont + 1));
            cont++;
            num = leer.nextInt();
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
            prom = prom + num;
        } while (cont < n);

        prom = prom / n;
        System.out.println("primedio" + prom);
        System.out.println("Máximo " + max);
        System.out.println("Minimo " + min);
    }

}
