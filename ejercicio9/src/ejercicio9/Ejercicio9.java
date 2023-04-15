/*
 EJERCICIO 9
Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar
el resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
Nota: recordar el uso de la sentencia break.
 */
package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        int num,sum,cont;
        sum=0;
        cont=0;
        
        while (cont<20){
            cont++;
            System.out.println("Ingrese el número " + cont );
            num=leer.nextInt();
            if (num>0){
                sum=sum+num;
            }else if (num==0){
                System.out.println("Se capturó el número 0");
                break;
            }
        }
        System.out.println("La suma de los número es " + sum);
    }
    
}
