/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TreatAllInSequence;

import java.util.Scanner;

/**
 *
 * @author ElizabethFranangel <https://orcid.org/0009-0006-1800-9996>
 */
public class P23001_ConsecutiveRepeatedWords {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String cadena, cadAux;
        int cont = 0, nmax = 0;

        cadena = teclado.nextLine();
        cadAux=cadena.replace("  "," ");
        
        String cadenas[] = cadAux.split(" ");

        for (int i = 0; i <= cadenas.length - 1; i++) {

            if (cadenas[0].equals(cadenas[i])) {
                cont++;

            } else {
                cont = 0;
            }
            if (nmax <= cont) {
                nmax = cont;

            }
        }
        System.out.println(nmax);

    }
}
