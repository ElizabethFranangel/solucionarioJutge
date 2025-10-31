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
public class P92613_Rounding {
    public static void main(String[] args) {
        Scanner consola = new Scanner (System.in);
        double realNumber = consola.nextDouble();
        
        System.out.println((int)Math.floor(realNumber)+" "+ (int)Math.ceil(realNumber)+" "+(int)Math.round(realNumber));
    }
    
}
