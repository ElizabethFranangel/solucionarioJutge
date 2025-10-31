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
public class P97156_NumbersInAnInterval {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
       int a=teclado.nextInt();
       int b=teclado.nextInt();
       
        for (int i = a; i <=b; i++) {
            System.out.print(i); 
            if (i!=b) {
                System.out.print(",");
            }
        }
         System.out.println("");
    }
}
