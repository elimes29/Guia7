/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package ejercicio.a17;

/**
 *
 * @author usuario
 */
public class EjercicioA17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;
        int cont5 = 0;
        int n = 100;
        int[] vector = new int[n];
        //System.out.println(99999/1);
        //System.out.println(99/1000);
        //LLenando el vector con valores aleatorios

        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 100000);
            //System.out.print(vector[i]+",");
            if ((vector[i] / 10000 > 0) && (vector[i] / 10000 < 10)) {
                cont5++;
            } else if ((vector[i] / 1000 > 0) && (vector[i] / 1000 < 10)) {
                cont4++;
            } else if ((vector[i] / 100 > 0) && (vector[i] / 100 < 10)) {
                cont3++;
            } else if ((vector[i] / 1000 > 0) && (vector[i] / 1000 < 10)) {
                cont2++;
            } else {
                cont1++;
            }

        }
        //System.out.println("");
        System.out.println("Un dígito: " + cont1 + " Dos dígitos: " + cont2 + " Tres dígitos: " + cont3 + " Cuatro dígitos: " + cont4 + " Cinco díitos: " + cont5);
    }
}
