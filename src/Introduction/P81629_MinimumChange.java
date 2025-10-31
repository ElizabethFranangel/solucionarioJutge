/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Introduction;

import java.util.Scanner;

/**
 * P81629 Jutge.org: Escribe un programa que, dada una cantidad de euros y
 * céntimos, calcule el número mínimo de billetes y monedas necesarios para
 * obtener dicha cantidad. Hay monedas de 1, 2, 5, 10, 20 y 50 céntimos y de 1 y
 * 2 euros, y billetes de 5, 10, 20, 50, 100, 200 y 500 euros. 
 * 
 * input:
 * La entrada consta de dos números naturales: la cantidad de euros e y la
 * cantidad de céntimos c . Suponga que 'c menor que 100'.
 * 
 * Output:
 * Imprime el número de billetes y monedas de cada tipo necesarios para
 * representar la cantidad de entrada, de forma que se minimice el número total
 * de billetes y monedas. 
 * 
 * @author ElizabethFranangel <https://orcid.org/0009-0006-1800-9996>
 */
public class P81629_MinimumChange {
    public static void main(String[] args) {
        Scanner consola = new Scanner (System.in);
        
        int euros = consola.nextInt();
        int centimos = consola.nextInt();
        consola.close();
        
        int totalCents = euros * 100 + centimos;
        
           // Billetes
        int b500 = totalCents / 50000; totalCents %= 50000;
        int b200 = totalCents / 20000; totalCents %= 20000;
        int b100 = totalCents / 10000; totalCents %= 10000;
        int b50  = totalCents / 5000;  totalCents %= 5000;
        int b20  = totalCents / 2000;  totalCents %= 2000;
        int b10  = totalCents / 1000;  totalCents %= 1000;
        int b5   = totalCents / 500;   totalCents %= 500;

        // Monedas
        int m2e  = totalCents / 200; totalCents %= 200;
        int m1e  = totalCents / 100; totalCents %= 100;
        int m50  = totalCents / 50;  totalCents %= 50;
        int m20  = totalCents / 20;  totalCents %= 20;
        int m10  = totalCents / 10;  totalCents %= 10;
        int m5   = totalCents / 5;   totalCents %= 5;
        int m2   = totalCents / 2;   totalCents %= 2;
        int m1   = totalCents;
        
        String mensaje="""
                       Banknotes of 500 euros: %d 
                       Banknotes of 200 euros: %d
                       Banknotes of 100 euros: %d
                       Banknotes of 50 euros: %d
                       Banknotes of 20 euros: %d 
                       Banknotes of 10 euros: %d 
                       Banknotes of 5 euros: %d 
                       Coins of 2 euros: %d 
                       Coins of 1 euro: %d 
                       Coins of 50 cents: %d 
                       Coins of 20 cents: %d 
                       Coins of 10 cents: %d 
                       Coins of 5 cents: %d 
                       Coins of 2 cents: %d 
                       Coins of 1 cent: %d 
                       """;
        System.out.printf(mensaje,b500, b200, b100, b50, b20, b10, b5, m2e, m1e, m50, m20, m10, m5, m2, m1 );
        
    }

}
