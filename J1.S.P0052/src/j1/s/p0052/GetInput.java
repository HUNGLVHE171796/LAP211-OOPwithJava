/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0052;

import java.util.Scanner;

/**
 *
 * @author admin
 */
class GetInput {

    static int inputChoice() {
        Scanner scanner = new Scanner(System.in);
        //Loop until input value is valid
        while (true) {
            try {
                System.out.println("Select an option: ");
                String number = scanner.nextLine();
                //Check input number is empty
                if (number.isEmpty()) {
                    System.out.println("Empty");
                } else {
                    int input = Integer.parseInt(number);
                    //Check input value
                    if (input < 1 || input > 5) {
                        System.out.println("Please input number appear in the screen");
                    } else {
                        return input;
                    }
                }
            } catch (Exception e) {
                System.out.println("Input choice invalid");
            }
        }
    }

    static String getString(String mess, String error, String regex) {
        Scanner scanner = new Scanner(System.in);
        //Loop until input string is valid
        while(true) {
            System.out.println(mess);
            String input = scanner.nextLine().trim();
            //Check input string is empty
            if(input.isEmpty()) { 
                System.out.println("String cannot be empty");
            } else if(input.matches(regex)) {
                return input;
            } else {
                System.out.println(error);
            }
        }
    }

    static float getFloat() {
        Scanner scanner = new Scanner(System.in);
        //Loop until input value is valid
        while(true) {
            try {
                System.out.println("Enter total Area: ");
                String number = scanner.nextLine();
                //Check input value is empty
                if(number.isEmpty()) { 
                    System.out.println("Value cannot be empty");
                } else {
                    float max = Float.MAX_VALUE;
                    float output = Float.parseFloat(number);
                    //Check input value
                    if(output <= 0 || output > max) { 
                        System.out.println("Total area invalid");
                    } else {
                        return output;
                    }
                }
            } catch (Exception e) {
                System.out.println("Please enter number");
            }
        }
    }

}
