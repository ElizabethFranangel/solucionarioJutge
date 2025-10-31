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
public class P15613_Temperatures {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int temperatura = lector.nextInt();
        System.out.println(Temperatura(temperatura));
        if (temperatura >= 100) {
            System.out.println("water would boil");
        } else if (temperatura <= 0) {
            System.out.println("water would freeze");

        }
    }
     static String Temperatura(int temp) {
        
        if (temp > 30) {

            return "it's hot";

        } else if (temp < 10) {
            return "it's cold";

        } else {
            return "it's ok";
        }

    }
}
