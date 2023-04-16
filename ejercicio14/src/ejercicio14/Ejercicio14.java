/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String[] Equipo = new String[5];
        
        for (int i = 0; i < 4; i++) {
            int integrante=i+1;
            System.out.println("Escriba el nombre del integrante numero "+integrante);
            Equipo[i]=leer.nextLine();
            
        }
    }
    
}
