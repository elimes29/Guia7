/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
package ejercicio.a14;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EjercicioA14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Indique la moneda a conertir (dolares, yenes o libras)");
        String moneda;
        moneda=leer.nextLine();
        System.out.println("Indique la cantidad de euros a cambiar");
        float euros=leer.nextFloat();
        //funcion cambio
        cambio(euros,moneda);
    }
    
    public static void cambio(float monto,String moneda){
        switch (moneda){
            case "dolares":
                System.out.println((float) (monto*1.28611)+"dolares son " + monto + " euros");
                return;
            case "yenes":
                System.out.println((float) (monto*129.852)+"dolares son " + monto + " yenes");
                return;
            case "libras":
                System.out.println((float) (monto*0.86)+"dolares son " + monto + " libras");
                return;
            default:
                System.out.println("Moneda no identificada");
        }
    }
}
