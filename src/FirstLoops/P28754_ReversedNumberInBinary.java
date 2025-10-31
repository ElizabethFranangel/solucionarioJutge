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
public class P28754_ReversedNumberInBinary {
        public static void main(String[] args){
        Scanner lector = new Scanner(System.in);

        int numDecimal = lector.nextInt();
              
        System.out.println(GenerarBinario(numDecimal));
       
            


    }

 static String GenerarBinario(int numDecimal) {
        
        String binario = "";
        int aux, modulo;
        
        if (numDecimal==0) {
            return binario="0";
        }
        for (aux = numDecimal; aux >= 1; aux = (aux/2)) {
            modulo = aux %2;
            binario += modulo;
        }

        return binario;
    }
}
