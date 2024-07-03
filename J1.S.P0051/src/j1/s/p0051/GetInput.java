/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0051;

import java.util.Scanner;

/**
 *
 * @author admin
 */
class GetInput {

    static int InputChoice() {
        Scanner scanner = new Scanner(System.in);
        //Loop re-enter if input value is invalid
        while (true) {
            try {
                System.out.print("Please choice one option: ");
                String number = scanner.nextLine();
                //Check if input value is empty
                if (number.isEmpty()) {
                    System.out.println("Empty!");
                } else {
                    int output = Integer.parseInt(number);
                    //Check input value
                    if (output < 1 || output > 3) {
                        System.out.println("Please enter number appear in the screen!");
                    } else {
                        return output;
                    }
                }
            } catch (Exception e) {
                System.out.println("Please enter number eppear in the screen!");
            }
        }
    }

    static double InputNumber(String mess) {
        Scanner scanner = new Scanner(System.in);
        //Loop re-enter if input value is invalid
        while (true) {
            try {
                System.out.print(mess);
                String number = scanner.nextLine();
                //Check if input value is empty
                if (number.isEmpty()) {
                    System.out.println("Empty!");
                } else {
                    double max = Double.MAX_VALUE;
                    double output = Double.parseDouble(number);
                    //Check input value
                    if (output > max) {
                        System.out.println("Number is invalid!");
                    } else {
                        return output;
                    }
                }
            } catch (Exception e) {
                System.out.println("Not is digit!");
            }
        }
    }

    static String InputOperator(String mess) {
        Scanner scanner = new Scanner(System.in);
        //Loop re-enter if input value is invalid
        while (true) {
            System.out.print(mess);
            String op = scanner.nextLine().trim();
            //Check input value is empty
            if (op.isEmpty()) {
                System.out.println("Empty!");
            } else if (op.equalsIgnoreCase("+") || op.equalsIgnoreCase("-")
                    || op.equalsIgnoreCase("*") || op.equalsIgnoreCase("/")
                    || op.equalsIgnoreCase("^") || op.equalsIgnoreCase("=")) {
                return op;
            } else {
                System.out.println("Please input (+, -, *, /, ^)");
            }
        }
    }

    static double InputWeightHeight(String mess) {
        Scanner scanner = new Scanner(System.in);
        //Loop re-enter if input value is invalid
        while (true) {
            try {
                System.out.print(mess);
                String number = scanner.nextLine();
                //Check if input value is empty
                if (number.isEmpty()) {
                    System.out.println("Empty!");
                } else {
                    double min = 0, max = Double.MAX_VALUE;
                    double output = Double.parseDouble(number);
                    //Check input value
                    if (output <= min || output > max) {
                        System.out.println("Value invalid!");
                    } else {
                        return output;
                    }
                }
            } catch (Exception e) {
                System.out.println("BMI is digit!");
            }
        }
    }    
}
