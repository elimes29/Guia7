/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
 */
package ejercicio.a13;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EjercicioA13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Indique el lado del cadrado");
        int lado=leer.nextInt();
        
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                if (i==0){
                    System.out.print("*");
                }else if((j==0) || (j==lado-1)){
                    System.out.print("*");
                }else if (i==lado-1){
                    System.out.print("*");
                }else
                    System.out.print(" ");
            }
            System.out.println("");
            
        }
    }
    
}
