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
public class P89851_WhichIsMissing {
    
       public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n, faltante = 0;
        int arr[];
        boolean bandera = false;
        while (teclado.hasNext()){
            
            n=teclado.nextInt();
            arr= new int[n-1];
            
            for (int i = 0; i < arr.length; i++) {
                arr[i]=teclado.nextInt();
            }
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j < arr.length; j++) {

                    if (arr[j]== i) {
                        bandera =true;
                        break;
                    }else{
                        
                        bandera =false;
                        
                    }
                }

                if (bandera==false) {
                    faltante=i;
                    
                }
                
            }
            System.out.println(faltante);
        }
    }
 
}
