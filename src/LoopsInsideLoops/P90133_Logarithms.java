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
public class P90133_Logarithms {
    public static void main(String[] args) {
        Scanner lector= new Scanner(System.in);
        int b,n;
        while(lector.hasNext()){
            b=lector.nextInt();
            n=lector.nextInt();
            System.out.println(Logartimos(b,n));
        }
    }
    static int Logartimos(int b, int n){
        int acum=b, contador=0;
        while(acum <=n){
            
            if (acum<=n) {
            contador++;
            }
            acum= acum*b;
        }
        return contador;
        
    }
}
