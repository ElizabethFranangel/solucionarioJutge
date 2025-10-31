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
public class P62421_ThreeWords {

    public static void main(String[] args) {
        System.out.println("Escriba un programa que lea tres palabras 'a b c', e imprima una línea con c, b y a en este orden.");
        Scanner teclado = new Scanner(System.in);

        String cadena = teclado.nextLine();
        String subCadenas[] = cadena.split(" ");

        System.out.println(invetirPalabrasDeCadena(subCadenas));

    }

    public static String invetirPalabrasDeCadena(String cadena[]) {
        String cadAux = "";
        for (int i = cadena.length - 1; i >= 0; i--) {
            cadAux += cadena[i];
            if (i > 0) {
                cadAux += " ";
            }
        }
        return cadAux;
    }
}
