/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Introduction;

import java.util.Scanner;

/**
 *
 * @author ElizabethFranangel <https://orcid.org/0009-0006-1800-9996>
 */
public class P90226_ComparisonOfWords {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        String cadena1 = consola.next();
        String cadena2 = consola.next();
               
        if(cadena1.compareTo(cadena2)== 0){
            System.out.println(cadena1+ " = " + cadena2 );
        }else if(cadena1.compareTo(cadena2)<0){
            System.out.println(cadena1+ " < " + cadena2 );
        }else{
            System.out.println(cadena1+ " > " + cadena2 );
        }
        
    }
}
