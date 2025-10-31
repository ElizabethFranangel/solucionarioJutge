/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LoopsInsideLoops;

import java.util.Scanner;

/**
 *
 * @author ElizabethFranangel <https://orcid.org/0009-0006-1800-9996>
 */
public class P79817_Powers {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        int a = 0, b = 0, power = 0;
        while (lector.hasNext()) {
            a = lector.nextInt();
            b = lector.nextInt();
            if (b >= 0) {
                power = (int) Math.pow(a, b);
                System.out.println(power);
            }
        }

    }
}
