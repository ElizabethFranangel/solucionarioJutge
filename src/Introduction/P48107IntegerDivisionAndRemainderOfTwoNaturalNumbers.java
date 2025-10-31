/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Introduction;

import java.util.Scanner;

/**
 *
 * @author ElizabethFranangel #<https://orcid.org/0009-0006-1800-9996>
 */
public class P48107IntegerDivisionAndRemainderOfTwoNaturalNumbers {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        double a = teclado.nextDouble();
        double b = teclado.nextDouble();
        if (b<=0) {
           System.exit(0);
        }
        int d = (int) (a/b);
        int r = (int)(a%b);
        System.out.println(d+" "+r);
    }
}
