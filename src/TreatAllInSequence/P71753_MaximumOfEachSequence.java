/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TreatAllInSequence;

import java.util.Scanner;

/**
 *
 * @author ElizabethFranangel <https://orcid.org/0009-0006-1800-9996>
 */
public class P71753_MaximumOfEachSequence {
    
        public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n, aux=-2000000000;

        while (teclado.hasNext()) {
                n = teclado.nextInt();
                int arr[] = new int[n];
                
                for (int i = 0; i < n; i++) {
                    arr[i]= teclado.nextInt();
                   

            }
                for (int i = 0; i < arr.length; i++) {
                    
                    aux=Math.max(aux, arr[i]);
                
            }
                System.out.println(aux);
               aux=-2000000000;

            
        }
    }
}
