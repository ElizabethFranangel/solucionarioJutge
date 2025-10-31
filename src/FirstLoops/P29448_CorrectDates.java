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
public class P29448_CorrectDates {
        public static void main(String[] args){
        Scanner lector = new Scanner(System.in);

        while (lector.hasNext()) {
            int day = lector.nextInt();
            int mounth = lector.nextInt();
            int years = lector.nextInt();
            System.out.println(CompDate(mounth, day, years));
        }

    }

    static String CompDate(int mount, int day, int years) {
        if (years <= 9999 && years >= 1800) {
            switch (mount) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if (day <= 31 && day >= 1) {
                        return "Correct Date";
                    } else {
                        return "Incorrect Date";
                    }
                case 2:
                    if ((years%4)==0) {
                        if (years%100>=1) {
                            if (day==29) {
                                return "Correct Date";  
                            }
                            
                        }else if(years%400==0)
                         if (day==29) {
                                return "Correct Date";
                            }
                    }
                    if (day <= 28 && day >= 1) {
                        return "Correct Date";
                    } else {
                        return "Incorrect Date";
                    }
                case 4:
                case 6:
                case 9:
                case 11:
                    if (day <= 30 && day >= 1) {
                        return "Correct Date";
                    } else {
                        return "Incorrect Date";
                    }
            }

        }
        return"Incorrect Date";
    }
}
