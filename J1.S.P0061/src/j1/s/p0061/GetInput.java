/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0061;

import java.util.Scanner;

/**
 *
 * @author admin
 */
class GetInput {

    static double getNumber(String mess) {
        Scanner scanner = new Scanner(System.in);
        double min = 0;
        //Loop re-enter if input value is invalid
        while(true) {
            try {
                System.out.println(mess);
                String input = scanner.nextLine();
                double number = Double.parseDouble(input);
                if (number > min ) {
                    return number;
                } else {
                    System.out.println("Please input number > 0");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please input number");
            }
        }
    }  
}
