/*
Los profesores del curso de programación de Egg necesitan llevar un registro de las notas
adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y
desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por
trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del
programa los profesores necesitan obtener por pantalla la cantidad de aprobados y
desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o
igual al 7 de sus notas del curso.
 */
package ejercicio.ex21;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EjercicioEx21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        float[] notas = new float[10];
        int n1, n2, n3, n4, apro = 0, repro = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Indique la nota 1 del alumno " + (i+1));
            n1 = leer.nextInt();
            System.out.println("Indique la nota 2 del alumno " + (i+1));
            n2 = leer.nextInt();
            System.out.println("Indique la nota 3 del alumno " + (1+i));
            n3 = leer.nextInt();
            System.out.println("Indique la nota 4 del alumno " + (i+1));
            n4 = leer.nextInt();
            notas[i] = (float) ((float) (n1 * .1) + (n2 * .15) + (n3 * .25) + (n4 * .5));
            if (notas[i] >= 7) {
                apro++;
            } else {
                repro++;
            } 
        }
        System.out.println("Lo alumnos aprobados fueron "+apro+" y los reprobados "+repro);
    }

}

