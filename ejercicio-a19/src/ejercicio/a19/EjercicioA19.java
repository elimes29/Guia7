/*
Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos).
 */
package ejercicio.a19;

/**
 *
 * @author usuario
 */
public class EjercicioA19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=10;
        int[] v1=new int[n];
        int[] v2=new int[n];
        int cont=0;
        for (int i = 0; i < n; i++) {
            v1[i]=v2[i]=(int) (Math.random()*10);
            //v1[i]=(int) (Math.random()*10);
            //v2[i]=(int) (Math.random()*10);
        }
        for (int i = 0; i < n; i++) {
            if (v2[i]==v1[i]){
                cont++;
            }else{
                break;
            }
            if (cont==n){
                System.out.println("Son iguales");

            }
              
            }
        System.out.println(cont);
                
            
    }
    
}
