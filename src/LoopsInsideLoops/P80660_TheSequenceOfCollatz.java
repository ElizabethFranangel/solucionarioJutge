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
public class P80660_TheSequenceOfCollatz {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int n;
        while (lector.hasNext()) {
            n = lector.nextInt();

            System.out.println(SequenceOfCollatz(n));
        }
    }

    static int SequenceOfCollatz(int n) {
        int contador = 0, acum = n;
        
        while(acum>1){
            contador ++;
            if (acum % 2==0) {
                acum=numPar(acum);
                
                
            }else
                acum= numImpar(acum);
            
        }
        return contador;
    }

    static int numImpar(int n) {
        int num;
        num = (n * 3) + 1;
        return num;

    }

    static int numPar(int n) {
        int num;
        num = n / 2;
        return num;
    }
}
