/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Introduction;

import java.util.Scanner;

/**
 *
 * @author Elizabeth Franangel <https://orcid.org/0009-0006-1800-9996>
 */
public class P56118_MáximoDeDosNumerosEnteros {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int a = lector.nextInt();
        int b = lector.nextInt();
        System.out.println(Compare(a, b));
    }

     static int Compare(int a, int b) {
        if(a > b) {
            return a;
        }
        return b;
    }
}
