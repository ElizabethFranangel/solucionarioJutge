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
public class P69277_FirstCubes {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();

        for (int i = 0; i <= n; i++) {
            int calculador = (int) Math.pow(i, 3);
            System.out.print(calculador);
            if (i != n) {
                System.out.print(",");
            }
        }
        System.out.println();
    }
}
