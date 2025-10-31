/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FirstProcedures;

import java.util.Scanner;

/**
 *
 * @author ElizabethFranangel <https://orcid.org/0009-0006-1800-9996>
 */
public class P57474_IterativeFactorial {

    public static void main(String[] args) {
        Scanner lector= new Scanner(System.in);
        int n;
        while(lector.hasNext()){
            n=lector.nextInt();
            System.out.println(Factorial(n));
        }
    }
    static int Factorial(int n){
        int factorial=1;
        for (int i = n ; i>=1; i--) {
            factorial*=i;
           
        }
        return factorial;
    }
}
