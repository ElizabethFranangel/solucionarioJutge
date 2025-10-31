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
public class P55722_IterativeNumberOfDigits {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        int n;
        while (lector.hasNext()) {
            n = lector.nextInt();
            if (n >= 0) {

                System.out.println(numberOfDigits(n));
            }
        }

    }

    public static int numberOfDigits(int n) {
        String num = Integer.toString(n);
        int cont = 1;
        while (cont != num.length()) {
            cont++;
        }
        return cont;
    }
}
