/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FirstProcedures;

import java.util.Scanner;

/**
 *
 * @author ElizabethFranangel <https://orcid.org/0009-0006-1800-9996>
 */
public class P88790_IterativeGreatestCommonDivisor {
      public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int a, b;
        while (lector.hasNext()) {
            a = lector.nextInt();
            b = lector.nextInt();

            System.out.println(gcd(a, b));
        }
    }

    public static int gcd(int a, int b) {
        int divisor = 0, dividendo = 0, cociente, modulo = 0;
        if (a == b) {
            return a;

        } else if (a > b) {
            if (b==0) {
                return a;
                
            }
            dividendo = a;
            divisor = b;

        } else {
            if (a==0) {
                return b;
                
            }
            dividendo = b;
            divisor = a;
        }
       
        modulo = dividendo % divisor;
        while (modulo != 0) {
            dividendo = divisor;
            divisor = modulo;
            modulo = dividendo % divisor;

        }

        return divisor;
    }  
}
