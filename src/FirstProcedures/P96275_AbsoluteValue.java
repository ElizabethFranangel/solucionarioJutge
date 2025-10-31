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
public class P96275_AbsoluteValue {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int n;
        while (lector.hasNext()) {
            n = lector.nextInt();
            System.out.println(absolute(n));
        }
    }

    public static int absolute(int n) {
        int m;
        m = Math.abs(n);
        return m;
    }
}
