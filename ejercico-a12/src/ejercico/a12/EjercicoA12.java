/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que
ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia
distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas
e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 */
package ejercico.a12;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EjercicoA12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una cadena (Para con &&&&&)");
        String cadena=leer.nextLine();
        int contBuenas=0;
        int contMalas=0;
        while (!(cadena.equals("&&&&&"))){
            if (cadena.length()>5){
                contMalas++;
            }else if((cadena.startsWith("X")) && (cadena.endsWith("O"))){
                contBuenas++;
            }else{
                contMalas++;                    
            }
        System.out.println("Ingrese una cadena (Para con &&&&&)");
        cadena=leer.nextLine();
        }
        System.out.println("Ingresos malos "+contMalas+" que es el "+((float) 100*contMalas/(contMalas+contBuenas))+"%");
        System.out.println("Ingresos Buenos "+contBuenas+" que es el "+((float) 100*contBuenas/(contMalas+contBuenas))+"%");
        
    }
    
}
