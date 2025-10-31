/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Introduction;

import java.util.Scanner;

/**Escriba un programa que lea dos números e imprima su suma.
 *
 * @author Elizabeth Franangel <https://orcid.org/0009-0006-1800-9996>
 */
public class P57548_SumOfTwoIntegerNumbers {
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
       int numeroUno = read.nextInt();
       int numeroDos = read.nextInt();
        System.out.println(numeroUno+numeroDos);
    }
}
