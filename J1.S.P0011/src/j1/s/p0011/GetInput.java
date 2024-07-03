/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0011;

import java.util.Scanner;

/**
 *
 * @author admin
 */
class GetInput {

    static int enterBaseNumberInput() {
        Scanner scanner = new Scanner(System.in);
        int min = 1, max = 3;
        while(true) {
            try {
                System.out.print("Enter base number input(1: binary, 2, decimal, 3: hexadecimal): ");
                String number = scanner.nextLine();
                //Check if input is empty
                if(number.isEmpty()) {
                    System.out.println("Base number input cannot be empty");
                } else {
                    int output = Integer.parseInt(number);
                    //Check input value
                    if(output > max || output < min) {
                        System.out.println("Base number input invalid");
                    } else {
                        return output;
                    }
                }
            } catch (Exception e) {
                System.out.println("Base number input invalid");
            }
        }
    }

    static int enterBaseNumberOutput() {
        Scanner scanner = new Scanner(System.in);
        int min = 1, max = 3;
        while(true) {
            try {
                System.out.print("Enter base number output(1: binary, 2, decimal, 3: hexadecimal): ");
                String number = scanner.nextLine();
                //Check if input is empty
                if(number.isEmpty()) {
                    System.out.println("Base number output cannot be empty");
                } else {
                    int output = Integer.parseInt(number);
                    //Check input value
                    if(output > max || output < min) {
                        System.out.println("Base number output invalid");
                    } else {
                        return output;
                    }
                }
            } catch (Exception e) {
                System.out.println("Base number output invalid");
            }
        }
    }

    static String enterInputValue(int baseInput) {
        String input = null;
        switch(baseInput) { 
            //If baseInput = 1, allow enter binary
            case 1:
                input = getBinaryNumber();
                break;
            //If baseInput = 2, allow enter decimal
            case 2:
                input = getDecimalNumber();
                break;
            //If baseInput = 3, allow enter hexadecimal
            case 3:
                input = getHexadecimal();
                break;
        }
        return input;
    }

    private static String getBinaryNumber() {
        String input = getString("Enter binary number (only contain 0, 1): ", "Wrong", "[0-1]+");
        return input;
    }

    private static String getDecimalNumber() {
        String input = getString("Enter decimal number (only contain 0-9): ", "Wrong", "[0-9]+");
        return input;
    }

    private static String getHexadecimal() {
        String input = getString("Enter hexadecimal number (only contain 0-9A-F): ", "Wrong", "[0-9A-F]+");
        return input;
    }

    private static String getString(String mess, String error, String regex) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println(mess);
            String input = scanner.nextLine().trim();
            //Check input is empty
            if(input.isEmpty()) {
                System.out.println("Input cannot be empty");
            } else if(input.matches(regex)) {
                return input;
            } else {
                System.out.println(error);
            }
        }
    }
    
    
}
