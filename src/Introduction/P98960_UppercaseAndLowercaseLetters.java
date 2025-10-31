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
public class P98960_UppercaseAndLowercaseLetters {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char letter = teclado.next().charAt(0);

        if (Character.isUpperCase(letter)) {
            System.out.println(Character.toLowerCase(letter));
            
        }else{
            System.out.println(Character.toUpperCase(letter));
           
        }
    }
}
