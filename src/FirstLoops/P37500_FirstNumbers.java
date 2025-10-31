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
public class P37500_FirstNumbers {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in); 
        int n = teclado.nextInt();
        
        firstNumber(n);
       // System.out.println(firstNumber(n));
    }
    
    public static void firstNumber(int n){
        if (n >0){
        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }
        }else{
        System.out.println(0);
        }
    }
}
