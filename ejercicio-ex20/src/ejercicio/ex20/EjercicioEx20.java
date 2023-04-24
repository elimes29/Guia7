/*
Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
parámetro. Después haremos otra función o procedimiento que imprima el vector.
 */
package ejercicio.ex20;

/**
 *
 * @author usuario
 */
public class EjercicioEx20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] vector = new int[10];
        vector = llena(vector);
        imprime(vector);
    }

    public static int[] llena(int[] v) {
        for (int i = 0; i < 10; i++) {
            v[i] = (int) (Math.random() * 10);
        }
        return v;
    }

    public static void imprime(int[] v) {
        for (int i = 0; i < 10; i++) {
            System.out.print("("+v[i]+")");;
        }
        System.out.println("");
    }
}
