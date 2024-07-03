/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice61;

import java.util.Scanner;

/**
 *
 * @author admin
 */
class GetInput {

    static double getNumber(String mess) {
        Scanner scanner = new Scanner(System.in);
        //Loop re-enter if input value is invalid
        while (true) {
            try {
                System.out.println(mess);
                String input = scanner.nextLine();
                //Check input is empty
                if (input.isEmpty()) {
                    System.out.println("Empty!");
                } else {
                    double number = Double.parseDouble(input);
                    //Check input value
                    if (number > 0) {
                        return number;
                    } else {
                        System.out.println("Please enter number > 0!");
                    }
                }
            } catch (Exception e) {
                System.out.println("Please input number!");
            }
        }
    }

}
