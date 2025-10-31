/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FirstLoops;

import java.util.Scanner;

/**
 *
 * @author ElizabethFranangel #<https://orcid.org/0009-0006-1800-9996>
 */
public class P50327_ReversedNumber {
    
    public static void main(String[] args) {
     Scanner teclado= new Scanner (System.in);
     
     String reverse="";
        String numero= teclado.nextLine();
        
        for (int i = numero.length()-1; i>-1; i--) {
            reverse += numero.charAt(i);
        }
          System.out.println(reverse);
    }
}
