/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preba.igualdad.de.arrays;

import java.util.Arrays;

/**
 *
 * @author usuario
 */
public class PrebaIgualdadDeArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Let us create different integers arrays
        int[] arr1 = new int [] {1, 2, 3, 4};
        int[] arr2 = new int [] {1, 2, 3, 4};
        int[] arr3 = new int [] {1, 2, 4, 3};
         
        System.out.println("is arr1 equals to arr2 : " +
                                Arrays.equals(arr1, arr2));
        System.out.println("is arr1 equals to arr3 : " +
                                Arrays.equals(arr1, arr3));
    }
}
    }
    
}
