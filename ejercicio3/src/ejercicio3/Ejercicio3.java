/*
EJERCICIO 3
Define variables donde puedas alojar los resultados y prueba usar dos operadores de cada tipo.
 */
package ejercicio3;

/**
 *
 * @author usuario
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //OPERADORES
        /*
        Operadores Aritméticos
            + Operador de Suma
            - Operador de Resta
            * Operador de Multiplicación
            / Operador de División
            % Operador de Módulo
        */
        int a=12;
        int b=25;
        float c=20;
        float x=(a+b-c*(a%c))/b;
        System.out.println(x);
        /*
        Operadores Unarios
            + Operador Unario de Suma; indica que el valor es positivo.
            - Operador Unario de Resta; indica que el valor es negativo.
            ++ Operador de Incremento.
            -- Operador de Decremento.
        */
        System.out.print("a " +a+" a ");
        a=-b;
        System.out.println(a);
        x=a;
        System.out.println(x);
        c++;
        System.out.println(c);
        a--;
        System.out.println(a);
        /*
        Operadores de Igualdad y Relación
            == Igual
            != Distinto
            > Mayor que
            >= Mayor o igual que
            < Menor que
            <= Menor o igual que
        */
        boolean m=a==b;
        boolean n=c!=x;
        boolean o=a>c;
        boolean p=c<a;
        boolean q=x<=x;
        System.out.println(m);
    }
    
}
