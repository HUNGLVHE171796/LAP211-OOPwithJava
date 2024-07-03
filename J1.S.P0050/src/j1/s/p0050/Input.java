/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0050;

import java.util.Scanner;

/**
 *
 * @author admin
 */
class Input {

    static int InputChoice() {
        Scanner scanner = new Scanner(System.in);
        //Loop re-enter if input value is invalid
        while(true) {
            try {
                System.out.print("Please choice one option: ");
                String number = scanner.nextLine();
                //Check if input value is empty
                if(number.isEmpty()) { 
                    System.out.println("Empty!");
                } else { 
                    int output = Integer.parseInt(number);
                    //Check input value
                    if(output < 1 || output > 3) { 
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

    static double InputCoefficients(String string) {
        Scanner scanner = new Scanner(System.in);
        //Loop re-enter if input value is invalid
        while(true) {
            try {
                System.out.print(string);
                String number = scanner.nextLine();
                //Check if input value is empty
                if(number.isEmpty()) { 
                    System.out.println("Value of coefficient cannot be empty!");
                } else { 
                    double min = - Double.MAX_VALUE, max = Double.MAX_VALUE;
                    double output = Double.parseDouble(number);
                    //Check input value
                    if(output < min || output > max) { 
                        System.out.println("Value of coefficient is invalid!");
                    } else {
                        return output;
                    }
                }
            } catch (Exception e) {
                System.out.println("Please input number!");
            }
        }
    } 
    
}
