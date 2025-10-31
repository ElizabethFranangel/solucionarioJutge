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
public class P29973_Triangle {
    public static void main(String[] args) {
        Scanner Lector = new Scanner(System.in);
        int n = Lector.nextInt();
        String ast="";
        for (int i = 1; i <= n; i++) {
           ast+="*";
            System.out.println(ast);
        }

    }
}
